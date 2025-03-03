package org.example.behavioral.chain_of_responsibility;

import org.example.behavioral.chain_of_responsibility.middleware.Middleware;
import org.example.behavioral.chain_of_responsibility.middleware.RoleCheckMiddleware;
import org.example.behavioral.chain_of_responsibility.middleware.ThrottlingMiddleware;
import org.example.behavioral.chain_of_responsibility.middleware.UserExistsMiddleware;
import org.example.behavioral.chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
* Upon receiving a request, each handler decides either to process the request or to pass it to
* the next handler in the chain.
*/
public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    static {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Build various chains using the same components.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
