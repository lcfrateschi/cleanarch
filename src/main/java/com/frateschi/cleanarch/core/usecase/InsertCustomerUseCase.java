package com.frateschi.cleanarch.core.usecase;

import com.frateschi.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
