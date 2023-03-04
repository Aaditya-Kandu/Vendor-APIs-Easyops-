package com.example.VendorBackendApp.Services;

import com.example.VendorBackendApp.Convertors.ConvertVendorEntity;
import com.example.VendorBackendApp.DTOs.VendorEntityDTO;
import com.example.VendorBackendApp.DTOs.VendorUpdateDTO;
import com.example.VendorBackendApp.Entities.Vendor;
import com.example.VendorBackendApp.Repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

    @Autowired
    VendorRepository vendorRepository;

    public String addVendor(VendorEntityDTO vendorEntityDTO) throws Exception{

        Vendor vendor = ConvertVendorEntity.convertEntityDTOtoEntity(vendorEntityDTO);

        vendorRepository.save(vendor);

        return "Vendor Added Successfully";
        
    }

    public Vendor getVendor(int id)
    {

      Vendor vendor = vendorRepository.findById(id).get();
      return vendor;
    }

    public String deleteVendor(int id) throws Exception{

        vendorRepository.deleteById(id);
        return "User delete successfully";

    }

    public String updateVendor(VendorUpdateDTO vendorUpdateDTO){

        Vendor originalData = vendorRepository.findById(vendorUpdateDTO.getId()).get();

        originalData.setAddress(vendorUpdateDTO.getAddress());
        originalData.setCity(vendorUpdateDTO.getCity());
        originalData.setEmail(vendorUpdateDTO.getEmail());
        originalData.setPinCode(vendorUpdateDTO.getPinCode());
        originalData.setState(vendorUpdateDTO.getState());
        originalData.setVendorName(vendorUpdateDTO.getVendorName());
        originalData.setVendorPhoneNo(vendorUpdateDTO.getVendorPhoneNo());
        originalData.setVendorCode(vendorUpdateDTO.getVendorCode());

        vendorRepository.save(originalData);

        return "Vendor has been updated successfully";

    }

}
