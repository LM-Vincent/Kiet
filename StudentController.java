/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import java.util.Scanner;
import model.Student;
import uitilities.Acceptable;
import uitilities.Inputter;
/**
 *
 * @author Admin
 */
public class StudentController {
    private List<Student> studentList;
    
    public StudentController(List <Student>studentList){
        this.studentList=studentList;
    }
    
    public void addStudent(){
        Student newStudent = new Student();
        System.out.println("========================= New Registration ========================");
        while(true){
         String studentID = uitilities.Inputter.getString("Enter Student ID:", 8, 8);
         //Check studentID co hop le hay khong
            if(!Acceptable.isValid(studentID, Acceptable.STU_ID_VALID)){
             System.out.println("The first two characters represent the campus code (SE, HE,DE, QE, CE)!");
            }else if(!Acceptable.isUniqueStudentID(studentID, studentList)){
             System.out.println("Student ID already exists. Please enter a unique ID");
            }else{
             newStudent.setStudentID(studentID);
             break;
         }
     }
     
     //Add student name
        while(true){
        String name = uitilities.Inputter.getString("Enter Name:", 2, 20);
            newStudent.setName(name);
            break;
    }
    
    // Add phone number
        double defaultFee=6000000;
        while (true) {            
            String phoneNumber=uitilities.Inputter.getString("Enter Phone Number:", 10, 10);
            if(Acceptable.isValid(phoneNumber, Acceptable.PHONE_VALID)){
                if(Acceptable.isValid(phoneNumber, Acceptable.MOBI_VALID)||
                        Acceptable.isValid(phoneNumber,Acceptable.VIETTEL_VALID)||
                        Acceptable.isValid(phoneNumber,Acceptable.VINA_VALID)){
                    newStudent.setPhoneNumber(phoneNumber);
                    
                    if (Acceptable.isValid(phoneNumber, Acceptable.VIETTEL_VALID) || 
                    Acceptable.isValid(phoneNumber, Acceptable.VINA_VALID)) {
                    double discountedFee = defaultFee * 0.65; // Apply 35% discount
                    newStudent.setTuitionFee(discountedFee);
                } else {
                    newStudent.setTuitionFee(defaultFee); // No discount
                }
                    break;
                }else{
                    System.out.println("Invalid. Try again");
                }
            }
        }
        
    //Add email
        while (true) {  
            String email = Inputter.getString("Enter Email:", 1, 100);
            if(!Acceptable.isValid(email, Acceptable.EMAIL_VALID)){
                System.out.println("Please enter again!!!");
            }else{
                newStudent.setEmail(email);
                break;
            }
        }
        
        //Add MountainCode
        while (true) {            
            String moutainCode=Inputter.getString("Enter the Mountain Code:", 1, 3);
            break;
        }
     
        
        studentList.add(newStudent);
        System.out.println("=====================Student added successfully.==================");
    }
    
    
    public void updateStudent(){
        Scanner sc = new Scanner(System.in);
        boolean found=false;
        while (true) {            
            String studentID = Inputter.getString("Enter Student ID", 8, 8);
                //Kiem tra StudentID ton tai khong
            for (Student student : studentList) {
                if(student.getStudentID().equalsIgnoreCase(studentID)){
                    System.out.println("-------------------------------");
                    System.out.println("1.Name    :"+student.getName());
                    System.out.println("2.Phone   :"+student.getPhoneNumber());
                    System.out.println("3.Email   :"+student.getEmail());
                    System.out.println("4.Mountain:"+student.getMountainCode());
                    System.out.println("-------------------------------");
                    found=true;
                }
                int choice=0;
                System.out.println("Choice option you wanna update.");
                switch(choice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                }
            }
            break;
                
        }   
    }
    
    public void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        boolean found=false;
        while (true) {
            String studentID = Inputter.getString("Enter StudentID", 8, 8);
            for (Student student : studentList) {
                if(student.getStudentID().equalsIgnoreCase(studentID)){
                    System.out.println("-------------------------------");
                    System.out.println("StudentID:"+student.getStudentID());
                    System.out.println("Name     :"+student.getName());
                    System.out.println("Phone    :"+student.getPhoneNumber());
                    System.out.println("Email    :"+student.getEmail());
                    System.out.println("Mountain :"+student.getMountainCode());
                    System.out.println("-------------------------------");
                    found=true;
                }
                    System.out.println("Do you wanna delete?(Y/N)");
                    String choice=sc.nextLine();
                    if(choice.equalsIgnoreCase("y")){
                        studentList.remove(student);
                        System.out.println("This registration has been successfully deleted.");
                    }else{
                        System.out.println("Deletion cancelled.");
                    }
                    break;  
            }//Ket thuc vong lap for
            if(!found){
                //Kiểm tra nếu studentID not exists thì in ra dòng dưới
                System.out.println("This student has not registered yet.");
            }
            break;
        }//Ket thuc vong lap  while
    }
    public void searchByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String search =sc.nextLine().toLowerCase();
        boolean found=false;
                
        for (Student student : studentList) {
            System.out.println("|------------+--------------------+------------+------------+----------|");
            System.out.printf("|%-12s|%-20s|%-12s|%-12s|%-12s\n",
                                  "Student ID","Name","Phone","Peak Code","Fee");
            System.out.println("|------------+--------------------+------------+------------+----------|");
            if(student.getName().toLowerCase().contains(search)){
                System.out.printf("|%-12s|%-20s|%-12s|%-12s|%-10d\n",
                        student.getStudentID(),
                        student.getName(),
                        student.getPhoneNumber(),
                        student.getMountainCode(),
                        (int)student.getTuitionFee());
                
                found=true;
            }
        }
            if(!found){
            System.out.println("|                   No one matches the search criteria!                |");
        }
            System.out.println("|------------+--------------------+------------+------------+----------|");
    }

    
    
}
