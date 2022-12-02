package com.springboot.account.dto.request;

import java.math.BigDecimal
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank

data class CreateAccountRequest(
        @field:NotBlank(message = "customerId must not be empty")
        val customerId: String,

        @field:Min(0, message = "initial credit value must not be negative value")
        val initialCredit: BigDecimal
)