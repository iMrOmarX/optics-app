package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 *
 * @author Omar AbuRish
 */
public class Examination implements Serializable {
    LocalDateTime examDate;
    float rightSphere , rightCylinder ,rightAxis;
    float leftSphere , leftCylinder , leftAxis;
    float near; 
    String note;
    
    
    public Examination(LocalDateTime examDate, float rightSphere, float rightCylinder, float rightAxis, float leftSphere, float leftCylinder, float leftAxis, float near, String note) {
        this.examDate = examDate;
        this.rightSphere = rightSphere;
        this.rightCylinder = rightCylinder;
        this.rightAxis = rightAxis;
        this.leftSphere = leftSphere;
        this.leftCylinder = leftCylinder;
        this.leftAxis = leftAxis;
        this.near = near;
        this.note = note;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public float getRightSphere() {
        return rightSphere;
    }

    public float getRightCylinder() {
        return rightCylinder;
    }

    public float getRightAxis() {
        return rightAxis;
    }

    public float getLeftSphere() {
        return leftSphere;
    }

    public float getLeftCylinder() {
        return leftCylinder;
    }

    public float getLeftAxis() {
        return leftAxis;
    }

    public float getNear() {
        return near;
    }

    public String getNote() {
        return note;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    public void setRightSphere(float rightSphere) {
        this.rightSphere = rightSphere;
    }

    public void setRightCylinder(float rightCylinder) {
        this.rightCylinder = rightCylinder;
    }

    public void setRightAxis(float rightAxis) {
        this.rightAxis = rightAxis;
    }

    public void setLeftSphere(float leftSphere) {
        this.leftSphere = leftSphere;
    }

    public void setLeftCylinder(float leftCylinder) {
        this.leftCylinder = leftCylinder;
    }

    public void setLeftAxis(float leftAxis) {
        this.leftAxis = leftAxis;
    }

    public void setNear(float near) {
        this.near = near;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    @Override
    public String toString() {
        return "Examination{" + "examDate=" + examDate + ", rightSphere=" + rightSphere + ", rightCylinder=" + rightCylinder + ", rightAxis=" + rightAxis + ", leftSphere=" + leftSphere + ", leftCylinder=" + leftCylinder + ", leftAxis=" + leftAxis + ", near=" + near + ", note=" + note + '}';
    }
    
    
    
    
}
