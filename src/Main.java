import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("http Server started at port :"+9090);
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost",9090),0);
        server.createContext("/hello", new HelloHandler());
        server.start();
    }
}