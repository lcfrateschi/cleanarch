package com.frateschi.cleanarch.dataprovider;

import com.frateschi.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.frateschi.cleanarch.core.domain.Address;
import com.frateschi.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.frateschi.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;


    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);


    }
}
