package com.example.VendorBackendApp;

import com.example.VendorBackendApp.Entities.Vendor;
import com.example.VendorBackendApp.Repositories.VendorRepository;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class VendorJunitTest {

    @Autowired
    VendorRepository vendorRepository;

    //Test JUnit for Save

    public void saveVendor(){

        Vendor vendor = Vendor.builder()
                .vendorName("Aaditya Kandu")
                .vendorCode("sas152")
                .vendorPhoneNo("8175864241")
                .state("Telangana")
                .city("Hyderabad")
                .email("aadityakandu@gmail.com")
                .id(1)
                .pinCode("123456")
                .address("Uppal")
                .build();

        vendorRepository.save(vendor);

        Assertions.assertThat(vendor.getId()).isGreaterThan(0);
    }

}
