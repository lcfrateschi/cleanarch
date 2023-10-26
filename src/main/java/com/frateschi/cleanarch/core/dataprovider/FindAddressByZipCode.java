package com.frateschi.cleanarch.core.dataprovider;

import com.frateschi.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
