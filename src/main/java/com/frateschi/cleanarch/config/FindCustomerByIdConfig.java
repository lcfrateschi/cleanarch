package com.frateschi.cleanarch.config;

import com.frateschi.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.frateschi.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById){

        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
