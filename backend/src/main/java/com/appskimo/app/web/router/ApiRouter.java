package com.appskimo.app.web.router;

import com.appskimo.app.service.ApiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class ApiRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(ApiHandler apiHandler) {
        return RouterFunctions.route(GET("/hello"), apiHandler::hello)
            .andRoute(GET("/user"), apiHandler::user);
    }

}
