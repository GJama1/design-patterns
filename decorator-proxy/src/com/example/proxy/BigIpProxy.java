package com.example.proxy;

import java.util.List;
import java.util.Set;

public class BigIpProxy extends Backend {


    private final Backend backend;
    private final Set<String> allowedOrigins;

    public BigIpProxy(Backend backend, Set<String> allowedOrigins) {
        this.backend = backend;
        this.allowedOrigins = allowedOrigins;
    }

    public void executeRequest(String request, String origin) {
        System.out.printf("Intercepting request: %s from %s%n", request, origin);
        if (isAllowedOrigin(origin)) {
            backend.executeRequest(request);
        } else {
            System.out.println("CORS error: " + origin + " is not allowed to access this resource");
        }
    }

    private boolean isAllowedOrigin(String origin) {
        return allowedOrigins.contains(origin);
    }


}
