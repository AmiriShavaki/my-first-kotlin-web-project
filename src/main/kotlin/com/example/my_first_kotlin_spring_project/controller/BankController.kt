package com.example.my_first_kotlin_spring_project.controller

import com.example.my_first_kotlin_spring_project.model.Bank
import com.example.my_first_kotlin_spring_project.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}