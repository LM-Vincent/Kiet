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
            boolean found = false;
            System.out.println("|------------+--------------------+------------+------------+----------|");
            System.out.printf("|%-12s|%-20s|%-12s|%-12s|%-12s\n",
                                  "Student ID","Name","Phone","Peak Code","Fee");
            System.out.println("|------------+--------------------+------------+------------+----------|");
        for (Student student : studentList) {
            System.out.printf("|%-12s|%-20s|%-12s|%-12s|%-10d\n",
                        student.getStudentID(),
                        student.getName(),
                        student.getPhoneNumber(),
                        student.getMountainCode(),
                        (int)student.getTuitionFee());
                        found = true;
        
        }
        if(!found){
            System.out.println("|                    No students have registered yet.                  |");
        }
            
            System.out.println("|------------+--------------------+------------+------------+----------|");
            System.out.println("                           +---------------+");
            System.out.println("---------------------------|Enter back Menu|----------------------------");
            System.out.println("                           +---------------+");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
    }
    
    public void filterByCampus(){
        Scanner sc = new Scanner(System.in);
        boolean found=false;
        System.out.println("Enter the campus code you want display.");
        String filter=sc.nextLine().toLowerCase();
        System.out.println("|------------+--------------------+------------+------------+----------|");
        System.out.printf("|%-12s|%-20s|%-12s|%-12s|%-10s|\n",
                                  "Student ID","Name","Phone","Peak Code","Fee");
        System.out.println("|------------+--------------------+------------+------------+----------|");
        for (Student student : studentList) {
            if(student.getStudentID().toLowerCase().contains(filter)){
                System.out.printf("|%-12s|%-20s|%-12s|%-12s|%-10d|\n",
                        student.getStudentID(),
                        student.getName(),
                        student.getPhoneNumber(),
                        student.getMountainCode(),
                        (int)student.getTuitionFee());
                found=true;
            }

        }
        if(!found){
            System.out.println("|             No students have registered under this campus.           |");
        }
         
            System.out.println("|------------+--------------------+------------+------------+----------|");
            System.out.println("                           +---------------+");
            System.out.println("---------------------------|Enter back Menu|----------------------------");
            System.out.println("                           +---------------+");
            sc.nextLine();
    }
    
    public void saveData(){
        
    }
    
    public void exitProgram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to save the changes before exiting? (Y/N)");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("y")){
            //save
        }else{
            System.out.println("You have unsaved changes. Are you sure you want to exit without saving? (Y/N)");
            sc.nextLine();
            if(choice.equalsIgnoreCase("n")){
                //save
            }
            //exit.
        }
    }
}
