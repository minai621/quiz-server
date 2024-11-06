package com.mjcp.quizserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuizServerApplication

fun main(args: Array<String>) {
    runApplication<QuizServerApplication>(*args)
}
