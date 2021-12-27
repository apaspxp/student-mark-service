package com.pxp.studentmarkservice.service;

import com.pxp.studentmarkservice.model.StudentMarkModel;
import com.pxp.studentmarkservice.model.StudentMarkModelList;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentMarkService {

    private List<StudentMarkModel> studentMarkModelList = Arrays.asList(
            new StudentMarkModel("1",34,38,36,41,45),
            new StudentMarkModel("2",35,33,35,48,41),
            new StudentMarkModel("3",37,35,39,44,40),
            new StudentMarkModel("4",32,37,32,40,41),
            new StudentMarkModel("5",32,37,51,32,75),
            new StudentMarkModel("6",41,71,52,52,74),
            new StudentMarkModel("7",33,78,42,36,75),
            new StudentMarkModel("8",58,74,21,45,74),
            new StudentMarkModel("9",51,63,53,75,74),
            new StudentMarkModel("10",25,69, 42,45,71)
    );

    public StudentMarkModel getMarkOfAStudent(String rollNo){
        if (studentMarkModelList.stream().filter(s -> rollNo.equalsIgnoreCase(s.getRollNo())).findFirst().isPresent())
            return studentMarkModelList.stream().filter(s -> rollNo.equalsIgnoreCase(s.getRollNo())).findFirst().get();
        else
            return new StudentMarkModel();
    }

    public StudentMarkModelList getMarkOfAllStudents(){
        StudentMarkModelList studentMarkModelList = new StudentMarkModelList();
        studentMarkModelList.setStudentMarkModelList(this.studentMarkModelList);
        return studentMarkModelList;
    }
}
