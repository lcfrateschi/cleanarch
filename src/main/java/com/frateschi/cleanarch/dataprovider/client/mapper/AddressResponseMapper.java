package com.frateschi.cleanarch.dataprovider.client.mapper;

import com.frateschi.cleanarch.core.domain.Address;
import com.frateschi.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
