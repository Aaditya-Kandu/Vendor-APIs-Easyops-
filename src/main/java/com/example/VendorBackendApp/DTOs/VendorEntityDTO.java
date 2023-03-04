package com.example.VendorBackendApp.DTOs;

import lombok.Data;

import javax.persistence.Column;

@Data
public class VendorEntityDTO {

    private String vendorName;

    private String vendorCode;

    private String address;

    private String city;

    private String state;

    public String pinCode;

    private String vendorPhoneNo;

    private String email;

}
