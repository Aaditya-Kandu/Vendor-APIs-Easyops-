package com.example.VendorBackendApp.Entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Type;
import org.intellij.lang.annotations.RegExp;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "vendor")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(unique = true)
    private String vendorCode;

    private String vendorName;

    private String address;

    private String city;

    private String state;


    public String pinCode;

    @Column(unique = true)
    private String vendorPhoneNo;


    @Column(unique = true)
    private String email;


}
