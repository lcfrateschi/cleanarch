package com.frateschi.cleanarch.entrypoint.controller.request;


import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;


}
