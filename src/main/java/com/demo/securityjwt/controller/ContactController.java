package com.demo.securityjwt.controller;

import com.demo.securityjwt.model.Contact;
import com.demo.securityjwt.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
@AllArgsConstructor
public class ContactController {
    private final ContactRepository contactRepository;

    @GetMapping
    public List<Contact> listContact(){
        return contactRepository.findAll();
    }
}
