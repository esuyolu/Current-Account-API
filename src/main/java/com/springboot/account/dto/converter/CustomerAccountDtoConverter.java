package com.springboot.account.dto.converter;

import com.springboot.account.dto.CustomerAccountDto;
import com.springboot.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CustomerAccountDtoConverter {

    private final TransactionDtoConverter transactionDtoConverter;

    public CustomerAccountDtoConverter(TransactionDtoConverter transactionDtoConverter) {
        this.transactionDtoConverter = transactionDtoConverter;
    }

    public CustomerAccountDto convertToCustomerAccountDto(Account from) {
        return new CustomerAccountDto(Objects.requireNonNull(from.getId()),
                Objects.requireNonNull(from.getTransactions()
                        .stream()
                        .map(transactionDtoConverter::convert)
                        .collect(Collectors.toSet())),
                from.getBalance(),
                from.getCreationDate());
    }
}
