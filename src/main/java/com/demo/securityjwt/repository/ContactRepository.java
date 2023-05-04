package com.demo.securityjwt.repository;

import com.demo.securityjwt.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
