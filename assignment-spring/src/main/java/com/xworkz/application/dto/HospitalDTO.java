package com.xworkz.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class HospitalDTO {

    private String name;
    private String location;
    private String type;
    private String doctors;
    private String beds;
    private String contact;
}
