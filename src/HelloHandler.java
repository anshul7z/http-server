import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String resp="this is response form the hello handler";
        exchange.sendResponseHeaders(200,resp.length());
        OutputStream stream = exchange.getResponseBody();
        stream.write(resp.getBytes());
        stream.flush();
        stream.close();
    }
}
