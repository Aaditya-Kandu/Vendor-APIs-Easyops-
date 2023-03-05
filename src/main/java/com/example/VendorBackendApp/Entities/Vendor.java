package com.example.VendorBackendApp.Entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Type;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
//import org.intellij.lang.annotations.RegExp;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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

    @NotEmpty
    @Size(min = 6,max = 6)
    public String pinCode;

    @Column(unique = true,nullable = false)
    @Size(min = 10, max = 10, message = "Phone number should have  10 characters")
    private String vendorPhoneNo;

    @Column(unique = true,nullable = false)
    @Email
    private String email;


}
