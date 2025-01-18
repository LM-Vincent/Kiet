/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import controller.StudentController; // Add, Update, Delete, Search
import controller.RegistrationController;
import java.util.ArrayList;
import model.Student;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        String filePath="MoutainList.csv";
        Scanner sc=new Scanner(System.in);
        int choice = 0;
        ArrayList<Student> studentList = new ArrayList<>();
        StudentController studentController= new StudentController(studentList);
        RegistrationController registraioncontroller = new RegistrationController(studentList);
        do {  
            System.out.println("+=================================================================+");
            System.out.println("|                                                                 |");
            System.out.println("|              Mountain Hiking Challenge Registration             |");
            System.out.println("|                                                                 |");
            System.out.println("+=================================================================+");
            System.out.println("|1. New Registration:                                             |");
            System.out.println("|2. Update Registration Information:                              |");
            System.out.println("|3. Display Registered List:                                      |");
            System.out.println("|4. Delete Registration Information:                              |");
            System.out.println("|5. Search Participants by Name:                                  |");
            System.out.println("|6. Filter Data by Campus:                                        |");
            System.out.println("|7. Statistics of Registration Numbers by Location:               |");
            System.out.println("|8. Save Data to File:                                            |");
            System.out.println("|9. Exit the Program:                                             |");
            System.out.println("+=================================================================+");
            System.out.printf("Enter the choice(1-9):");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: 
                    studentController.addStudent(); //con add mountaincode
                    break;
                case 2: 
                    studentController.updateStudent();
                    break;
                case 3: 
                    registraioncontroller.displayRegistration(); //xong
                    break;
                case 4: 
                    studentController.deleteStudent(); //xong
                    break;
                case 5: 
                    studentController.searchByName(); //xong
                    break;
                case 6: 
                    registraioncontroller.filterByCampus();//xong
                    break;
                case 7: 
                    //Statistics of Registration Numbers by Location:
                    break;
                case 8: 
                    //save
                    break;
                case 9: 
                    registraioncontroller.exitProgram();
                    break;
                default: System.out.println("This function is not available.");
            }
        } while (choice !=9);
        sc.close();
    }
}
