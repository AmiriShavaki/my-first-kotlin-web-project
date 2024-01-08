package com.example.my_first_kotlin_spring_project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFirstKotlinSpringProjectApplication

fun main(args: Array<String>) {
    runApplication<MyFirstKotlinSpringProjectApplication>(*args)
}
