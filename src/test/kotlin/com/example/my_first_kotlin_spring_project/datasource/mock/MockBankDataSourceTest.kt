package com.example.my_first_kotlin_spring_project.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()
    @Test
    fun `should provide a collection of banks`() {
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks).isNotEmpty
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }
    
    @Test
    fun `should provide some mock data`() {
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
    
    @Test
    fun `should provide unique account numbers`() {
        // given
        val banks = mockDataSource.retrieveBanks()
        val accountNumbers = banks.map { it.accountNumber }
        
        // when
        val uniqueAccountNumbers = accountNumbers.toSet()
        
        // then
        assertThat(uniqueAccountNumbers.size).isEqualTo(banks.size)
    }
}