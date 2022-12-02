package com.springboot.account.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class CustomerAccountDto(
        val id: String,
        val transactions: Set<TransactionDto>?,
        val balance: BigDecimal? = BigDecimal.ZERO,
        val creationDate: LocalDateTime
) {
}