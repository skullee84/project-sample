package com.appskimo.app.service;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Component
public class ApiHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("result", "hello");

        return ServerResponse.ok().body(Mono.just(map), Map.class);
    }

    public Mono<ServerResponse> user(ServerRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "dominic");

        return ServerResponse.ok().body(Mono.just(map), Map.class);
    }

}
