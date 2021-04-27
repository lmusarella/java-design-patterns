/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Create a random number between 200 and 300
 * @author edr
 */
public class LocalRandomGenerator implements RandomGenerator {
    public int getRandomNumber(){
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:11000/generate");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            return Integer.parseInt(content.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
