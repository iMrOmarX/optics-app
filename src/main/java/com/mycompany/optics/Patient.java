/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.optics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Omar AbuRish
 */
public class Patient implements Serializable {
    
    int id ; 
    String name ;
    Date birthDate;
    ArrayList<Examination> exams; 
    int numberOfExams = 0 ;
    public Patient( String name, int yearOfBirth  , int id ) {
        
        this.name = name;
        this.birthDate = new Date(yearOfBirth, 1, 1);
        this.exams = new ArrayList<>();
        this.id = id ;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Examination> getExams() {
        
        return exams;
    }
    
    
    public void addExam(Examination newExam) {
        numberOfExams++;
        exams.add(newExam);
    }

    public int getNumberOfExams() {
        return numberOfExams;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
