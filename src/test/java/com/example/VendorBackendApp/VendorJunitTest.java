package com.example.VendorBackendApp;

import com.example.VendorBackendApp.Entities.Vendor;
import com.example.VendorBackendApp.Repositories.VendorRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class VendorJunitTest {

    @Autowired
   private VendorRepository vendorRepository;

    //Test JUnit for Save

    @Test
    @Order(1)
    public void saveVendor(){

        Vendor vendor = Vendor.builder()
                .vendorName("Aaditya Kandu")
                .vendorCode("A24")
                .vendorPhoneNo("9181758642")
                .state("Telangana")
                .city("Hyderabad")
                .email("aadityakandu123@gmail.com")
                .pinCode("500013")
                .address("Uppal")
                .build();

        vendorRepository.save(vendor);
        Assertions.assertThat(vendor.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
   public void getVendor(){

        Vendor vendor = vendorRepository.findById(4).get();
        Assertions.assertThat(vendor.getId()).isEqualTo(4);
   }

   @Test
   @Order(3)
    public void updateVendor(){
        Vendor vendor = vendorRepository.findById(4).get();
        vendor.setVendorCode("CS21");
        vendor.setVendorName("Prince Kandu");
        vendor.setCity("Warangal");
        vendor.setVendorPhoneNo("8175864142");
        vendor.setState("UP");
        vendor.setEmail("aadityakandu123@gmail.com");
        vendor.setAddress("Bharat Nagar Colony, Uppal");
        vendor.setPinCode("273305");

        Vendor updateResult = vendorRepository.save(vendor);

   }

   @Test
   @Order(4)
    public void deleteVendor(){

        Vendor vendor = vendorRepository.findById(4).get();
        vendorRepository.delete(vendor);

   }
   

}
