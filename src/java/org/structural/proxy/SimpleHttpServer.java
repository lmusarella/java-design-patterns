package org.structural.proxy;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer
{
    private RandomGenerator randomGenerator = new RemoteRandomGenerator();
    private HttpServer server;

    public void serve() throws IOException, InterruptedException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1",11000), 0);
        server.createContext("/generate", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                String response = randomGenerator.getRandomNumber()+"";
                httpExchange.sendResponseHeaders(200, response.length());
                OutputStream os = httpExchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    public void stop(){
        server.stop(1);
    }
}
