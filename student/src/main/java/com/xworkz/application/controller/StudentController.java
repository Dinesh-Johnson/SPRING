package com.xworkz.application.controller;

import com.xworkz.application.dto.StudentDTO;

import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class StudentController {

    public StudentController() {
        System.out.println("StudentController constructor");
    }

    @RequestMapping("/profile")
    public String handleProfile(@Valid StudentDTO studentDTO, BindingResult bindingResult, Model model) {

        if (studentDTO.getName() == null || studentDTO.getName().isEmpty()) {
            model.addAttribute("dto", new StudentDTO());
            return "Profile";
        }

        if (bindingResult.hasErrors()) {
             bindingResult.getFieldErrors().stream()
                    .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                    .forEach(System.out::println);

            model.addAttribute("dto", studentDTO);
            model.addAttribute("message", "Invalid details");
            return "index";
        }

        String filename=null;
        try {
            byte[] bytes = studentDTO.getProfilePicture().getBytes();
            Path path = Paths.get("D:\\File Folder\\" + studentDTO.getName() + System.currentTimeMillis());
            Files.write(path, bytes);
             filename= path.getFileName().toString();
            System.out.println("Uploaded file saved as: " + filename);


            InputStream inputStream = new ByteArrayInputStream(bytes);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            System.out.println("Reading Excel content:");
            Iterator iterator = sheet.iterator();

            while (iterator.hasNext()) {

                XSSFRow row = (XSSFRow) iterator.next();
                Iterator cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    XSSFCell cell = (XSSFCell) cellIterator.next();
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + " ");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + " ");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + " ");
                            break;

                    }

                    System.out.print("  |  ");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("dto", studentDTO);
            model.addAttribute("message", "File upload failed");
            return "index";
        }

        model.addAttribute("name", studentDTO.getName());
        model.addAttribute("filename", filename);
        return "ProfileSuccess";
    }

    @GetMapping("/download")
    public void download(@RequestParam("profile") String profile,HttpServletResponse response) throws IOException {

        System.out.println("profile: "+profile);

        //response.setContentType("image/jpg");
        File file = new File("D:\\File Folder\\"+profile);
        System.out.println(profile);
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        ServletOutputStream out = response.getOutputStream();
        IOUtils.copy(in,out);
        response.flushBuffer();
    }
}

