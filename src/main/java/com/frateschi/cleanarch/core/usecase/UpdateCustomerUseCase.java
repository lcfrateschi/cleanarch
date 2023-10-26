package com.frateschi.cleanarch.core.usecase;

import com.frateschi.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer,String zipCode);

}
