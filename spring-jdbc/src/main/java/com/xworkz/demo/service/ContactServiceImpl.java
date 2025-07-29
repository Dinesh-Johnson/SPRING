package com.xworkz.demo.service;

import com.xworkz.demo.dto.ContactDTO;
import com.xworkz.demo.repo.ContactDAORepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAORepo contactDAORepo;

    @Override
    public String validateAndSave(ContactDTO dto) {
        if (dto==null){
            System.out.println("Values are NUll");
        }
        String name= dto.getName();
        if (name==null||name.isEmpty()){
            System.out.println("Name is Required");
        }
        String email= dto.getEmail();
        if (email==null||email.isEmpty()){
            System.out.println("Email is Required");
        }
        Long mobile = dto.getMobile();
        if (mobile==0){
            System.out.println("Mobile Number is Required");
        }
        String comments = dto.getComments();
        if (comments==null||comments.isEmpty()){
            System.out.println("Enter Comments");
        }

        contactDAORepo.save(dto);
        return null;
    }
}
