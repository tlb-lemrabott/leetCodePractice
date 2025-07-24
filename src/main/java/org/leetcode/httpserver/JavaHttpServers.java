package org.leetcode.httpserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class JavaHttpServers {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);

        PersonManager personManager = new PersonManager();
        personManager.addPerson(new Person("1", "John Doe", 30));

        server.createContext("/api/persons/", new MyServlet(personManager));
        server.setExecutor(null);
        server.start();
        InetSocketAddress address = server.getAddress();
        int runningPort = address.getPort();
        //System.out.println();
        System.out.println("Server started on port " + runningPort);
    }

    static class MyServlet implements HttpHandler {
        private PersonManager personManager;
        public MyServlet(PersonManager personManager) {
            this.personManager = personManager;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String method = exchange.getRequestMethod();
            String path = exchange.getRequestURI().getPath();
            System.out.println("handle called !");
            if (method.equals("GET")) {
                System.out.println("GET Called!");
                handleGetRequest(exchange, path);
            } else {
                String response = "Method not supported";
                exchange.sendResponseHeaders(405, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }

        private void handleGetRequest(HttpExchange exchange, String path) throws IOException {
            String basePath = "/api/persons/";
            System.out.println("handle GET called !");
            if (path.startsWith(basePath)) {
                String personId = path.substring(basePath.length());
                if (!personId.isEmpty()) {
                    Person person = personManager.getPerson(personId);
                    if (person != null) {
                        String response = person.toString();
                        exchange.getResponseHeaders().set("Content-Type", "text/plain");
                        exchange.sendResponseHeaders(200, response.length());

                        try (OutputStream os = exchange.getResponseBody()) {
                            os.write(response.getBytes());
                        }
                    } else {
                        // Person not found
                        String response = "Person not found";
                        exchange.getResponseHeaders().set("Content-Type", "text/plain");
                        exchange.sendResponseHeaders(404, response.length());

                        try (OutputStream os = exchange.getResponseBody()) {
                            os.write(response.getBytes());
                        }
                    }
                } else {
                    // Invalid person ID in request
                    String response = "Invalid person ID";
                    exchange.getResponseHeaders().set("Content-Type", "text/plain");
                    exchange.sendResponseHeaders(400, response.length());

                    try (OutputStream os = exchange.getResponseBody()) {
                        os.write(response.getBytes());
                    }
                }
            } else {
                // Invalid path
                String response = "Invalid request";
                exchange.getResponseHeaders().set("Content-Type", "text/plain");
                exchange.sendResponseHeaders(400, response.length());

                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            }
        }
    }
}
