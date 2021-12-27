package com.pxp.studentmarkservice.controller;

import com.pxp.studentmarkservice.model.StudentMarkModel;
import com.pxp.studentmarkservice.model.StudentMarkModelList;
import com.pxp.studentmarkservice.service.StudentMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentMarkController {

    @Autowired
    private StudentMarkService studentMarkService;

    @RequestMapping(value = "get-student-mark/{rollNo}", method = RequestMethod.GET)
    public StudentMarkModel getMarks(@PathVariable String rollNo){
        return studentMarkService.getMarkOfAStudent(rollNo);
    }

    @RequestMapping(value = "get-all-student-marks", method = RequestMethod.GET)
    public StudentMarkModelList getAllStudentMarks(){
        return studentMarkService.getMarkOfAllStudents();
    }
}
