package com.frateschi.cleanarch.config;

import com.frateschi.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.frateschi.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.frateschi.cleanarch.dataprovider.InsertCustomerImpl;
import com.frateschi.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomer, SendCpfForValidationImpl sendCpfForValidation){

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer,sendCpfForValidation);

    }
}
