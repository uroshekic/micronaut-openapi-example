package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
class HelloWorldController {

    @Get(produces = [MediaType.APPLICATION_JSON])
    fun index(): MessageDto {
        return MessageDto("Hello World")
    }
}
