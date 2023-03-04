package com.example.VendorBackendApp.DTOs;

import lombok.Data;

@Data
public class VendorUpdateDTO {


    private int id;

    private String vendorName;

    private String vendorCode;

    private String address;

    private String city;

    private String state;

    public String pinCode;

    private String vendorPhoneNo;

    private String email;

}
