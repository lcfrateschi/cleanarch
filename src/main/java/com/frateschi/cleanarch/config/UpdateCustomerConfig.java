package com.frateschi.cleanarch.config;

import com.frateschi.cleanarch.core.dataprovider.UpdateCustomer;
import com.frateschi.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.frateschi.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.frateschi.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.frateschi.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase (FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, FindAddressByZipCodeImpl findAddressByZipCode, UpdateCustomerImpl updateCustomer){

        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase,findAddressByZipCode, updateCustomer);
    }
}
