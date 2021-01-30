package com.cosmos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address03")
public class Address {
    @Id
    private Long mobileNumber;
    private String name;
    private String address;
    private String landmark;
    private Long pincode;
    private Long alternateNumber;
}
