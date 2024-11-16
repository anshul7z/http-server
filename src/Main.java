import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost",9090),0);
        server.createContext("/hello", new HelloHandler());
        server.start();
    }
}