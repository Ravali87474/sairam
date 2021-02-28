package com.data.studentsinpg.controller;

import com.data.studentsinpg.model.SqlModel;
import com.data.studentsinpg.repository.StudentsMRepo;
import com.data.studentsinpg.repository.StudentsSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/StudentsMRepo")



public class StudentsController {
    @Autowired
    StudentsMRepo studentsMRepo;
    @Autowired
    StudentsSRepo studentsSRepo;
    @PostMapping("/create")
    public void create(@RequestBody SqlModel sqlModel)
    {
        studentsSRepo.save(sqlModel);
    }
    @GetMapping("Retrive")
    public void get()
    {
        studentsMRepo.findAll();

    }

}
