/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.jaxrs.api.dao;

import com.thiszbimal.jaxrs.entity.Student;
import java.util.List;

/**
 *
 * @author admin
 */
public interface StudentDAO {
    List<Student> getAll();
    Student getById(int id);
}
