package org.structural;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.structural.flyweight.CoffeeFlavour;
import org.structural.flyweight.CoffeeFlavourFactoryImpl;
import org.structural.proxy.LocalRandomGenerator;
import org.structural.proxy.SimpleHttpServer;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class ProxyTest {


    private SimpleHttpServer server;
    private LocalRandomGenerator target;

    @Before
    public void setUp() {
        server = new SimpleHttpServer();
        target = new LocalRandomGenerator();
    }

    @After
    public void tearDown(){
        server.stop();
    }

    @Test
    public void shouldGenerateRemotelyRandomNumber() throws IOException, InterruptedException {
        //Given
        server.serve();

        //When
        int result = target.getRandomNumber();

        //Then
        assertTrue(result>=0);
        assertTrue(result<=100);
    }
}
