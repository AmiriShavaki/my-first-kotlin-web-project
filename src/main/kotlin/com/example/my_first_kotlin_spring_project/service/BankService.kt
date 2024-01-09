package com.example.my_first_kotlin_spring_project.service

import com.example.my_first_kotlin_spring_project.datasource.BankDataSource
import com.example.my_first_kotlin_spring_project.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}