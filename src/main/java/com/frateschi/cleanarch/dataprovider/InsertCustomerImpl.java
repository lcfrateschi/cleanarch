package com.frateschi.cleanarch.dataprovider;

import com.frateschi.cleanarch.core.dataprovider.InsertCustomer;
import com.frateschi.cleanarch.core.domain.Customer;
import com.frateschi.cleanarch.dataprovider.repository.CustomerRepository;
import com.frateschi.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;


    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
