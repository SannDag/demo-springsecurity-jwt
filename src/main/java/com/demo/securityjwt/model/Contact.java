package com.demo.securityjwt.model;

import lombok.Data;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_contact")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="birth_Date")
    private LocalDate birthDate;

    @Column(name="cellphone")
    private String cellphone;

    @Column(name="email")
    private String email;
}
