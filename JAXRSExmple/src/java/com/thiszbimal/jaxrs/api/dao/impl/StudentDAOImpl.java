/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.jaxrs.api.dao.impl;

import com.thiszbimal.jaxrs.api.dao.StudentDAO;
import com.thiszbimal.jaxrs.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class StudentDAOImpl implements StudentDAO{

    @Override
    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Bimal", "Karki", "bimal@gmail.com", true));
        studentList.add(new Student(2, "Bikash", "Koirala", "bikash@gmail.com", true));
        studentList.add(new Student(3, "Shreya", "Shilpakar", "shreya@gmail.com", true));
        studentList.add(new Student(4, "Laxmi", "Acharya", "laxmi@gmail.com", true));
        return studentList;
    }

    @Override
    public Student getById(int id) {
        for(Student s: getAll()){
            if(s.getId()==id)
                return s;
        }
        return null;
    }
    
    
}
