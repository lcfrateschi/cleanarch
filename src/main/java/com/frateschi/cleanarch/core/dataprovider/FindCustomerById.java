package com.frateschi.cleanarch.core.dataprovider;

import com.frateschi.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}
