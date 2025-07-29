package com.xworkz.demo.repo;

import com.xworkz.demo.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;

public interface ContactDAORepo {

    void save(ContactDTO dto);
}