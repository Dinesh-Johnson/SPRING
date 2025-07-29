package com.xworkz.demo.repo;

import com.xworkz.demo.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAORepoImpl  implements ContactDAORepo{

    @Autowired
    JdbcTemplate jdbcTemplate;



    public void save(ContactDTO contactDTO) {

        String sql = "INSERT INTO contact_info (name,email,mobile,comments) values (?,?,?,?)";

        jdbcTemplate.update(sql,contactDTO.getName(),contactDTO.getEmail(),contactDTO.getMobile(),contactDTO.getComments());

    }
}
