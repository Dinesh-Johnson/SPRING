package com.xworkz.demo.service;

import com.xworkz.demo.dto.ContactDTO;

public interface ContactService {

    String validateAndSave(ContactDTO dto);
}
