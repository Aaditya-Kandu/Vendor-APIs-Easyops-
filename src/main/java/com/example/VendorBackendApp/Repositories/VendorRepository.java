package com.example.VendorBackendApp.Repositories;

import com.example.VendorBackendApp.Entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Integer> {

   // Vendor deleteById(int id);

    //Vendor upadateById(int id);
}
