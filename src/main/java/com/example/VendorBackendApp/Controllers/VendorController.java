package com.example.VendorBackendApp.Controllers;

import com.example.VendorBackendApp.DTOs.VendorEntityDTO;
import com.example.VendorBackendApp.DTOs.VendorUpdateDTO;
import com.example.VendorBackendApp.Entities.Vendor;
import com.example.VendorBackendApp.Services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    VendorService vendorService;

    @PostMapping("add_vendor")
    public ResponseEntity<String> addVendor(@RequestBody()VendorEntityDTO vendorEntityDTO){

        try {
            String response = vendorService.addVendor(vendorEntityDTO);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch (Exception e){
            String response = "Vendor is not Added";
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/get_vendor")
    public ResponseEntity<Vendor> getVendor(@RequestParam("id") int id){

        Vendor vendor = vendorService.getVendor(id);
        return new ResponseEntity<>(vendor, HttpStatus.ACCEPTED);


    }


    @DeleteMapping("/delete_vendor")
    public ResponseEntity<String> deleteVendor(@RequestParam("id") int id){

        try{
            String response = vendorService.deleteVendor(id);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){
            String response = "User Id Invalid";
            return new ResponseEntity<>(response , HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("/update_vendor")
    public String updateVendor(@RequestBody() VendorUpdateDTO vendorUpdateDTO){

        return vendorService.updateVendor(vendorUpdateDTO);


    }
}
