package com.example.my_first_kotlin_spring_project.com.example.my_first_kotlin_spring_project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/")
class RESTcontroller {
    @GetMapping
    fun index(): String = "Hello World!"
}