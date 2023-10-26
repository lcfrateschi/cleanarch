package com.frateschi.cleanarch.dataprovider.repository.mapper;

import com.frateschi.cleanarch.core.domain.Customer;
import com.frateschi.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer custumer);

    Customer toCustomer(CustomerEntity customerEntity);

}
