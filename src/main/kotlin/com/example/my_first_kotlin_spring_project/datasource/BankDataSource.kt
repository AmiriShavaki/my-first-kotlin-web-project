package com.example.my_first_kotlin_spring_project.datasource

import com.example.my_first_kotlin_spring_project.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}