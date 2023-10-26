package com.frateschi.cleanarch.core.usecase.impl;

import com.frateschi.cleanarch.core.dataprovider.FindCustomerById;
import com.frateschi.cleanarch.core.domain.Customer;
import com.frateschi.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
