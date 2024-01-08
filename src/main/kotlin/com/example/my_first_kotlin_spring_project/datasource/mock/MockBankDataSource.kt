package com.example.my_first_kotlin_spring_project.datasource.mock

import com.example.my_first_kotlin_spring_project.datasource.BankDataSource
import com.example.my_first_kotlin_spring_project.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1342", 435.0, 0),
        Bank("1512", 0.0, 324)
    )
    override fun retrieveBanks(): Collection<Bank> = banks
}