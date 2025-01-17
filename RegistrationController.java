/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Scanner;
import model.Student;
import uitilities.Inputter;
import uitilities.Acceptable;

/**
 *
 * @author Admin
 */
public class RegistrationController {

    private List<Student> studentList;
    public RegistrationController(List<Student>studentList){
       this.studentList=studentList;
    }
    
    public void displayRegistration(){
        for (Student student : studentList) {
            
        }
}
}
