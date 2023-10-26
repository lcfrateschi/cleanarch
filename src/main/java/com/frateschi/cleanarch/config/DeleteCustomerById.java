package com.frateschi.cleanarch.config;

import com.frateschi.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.frateschi.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.frateschi.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerById {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerByIdImpl deleteCustomerById){

        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase,deleteCustomerById);

    }
}
