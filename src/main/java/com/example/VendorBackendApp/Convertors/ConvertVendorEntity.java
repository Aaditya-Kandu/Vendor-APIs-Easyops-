package com.example.VendorBackendApp.Convertors;

import com.example.VendorBackendApp.DTOs.VendorEntityDTO;
import com.example.VendorBackendApp.Entities.Vendor;

public class ConvertVendorEntity {

    public static Vendor convertEntityDTOtoEntity(VendorEntityDTO vendorEntityDTO){

        Vendor vendor = Vendor.builder()
                .vendorName(vendorEntityDTO.getVendorName())
                .vendorPhoneNo(vendorEntityDTO.getVendorPhoneNo())
                .address(vendorEntityDTO.getAddress())
                .city(vendorEntityDTO.getCity())
                .email(vendorEntityDTO.getEmail())
                .pinCode(vendorEntityDTO.getPinCode())
                .state(vendorEntityDTO.getState())
                .vendorCode(vendorEntityDTO.getVendorCode())
                .build();

        return vendor;
    }
}
