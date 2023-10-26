package com.frateschi.cleanarch.core.usecase;

import com.frateschi.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
