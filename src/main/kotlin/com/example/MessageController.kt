package com.example;

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import kotlin.random.Random

@Controller("/message")
class MessageController {

    @Get(produces = [MediaType.APPLICATION_JSON])
    fun getAll(): List<MessageDto> {
        return listOf(MessageDto("Message 1"), MessageDto("Message 2"), MessageDto("Message 3"))
    }

    @Get("/{id}", produces = [MediaType.APPLICATION_JSON])
    fun get(id: String): MessageDto {
        return MessageDto("Message: $id")
    }

    @Post(produces = [MediaType.APPLICATION_JSON])
    fun generate(): MessageDto {
        return MessageDto("Message: " + Random.nextInt(0, 100))
    }
}
