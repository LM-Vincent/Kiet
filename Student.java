/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Student {
    private String studentID;
    private String name;
    private String phoneNumber;
    private String email;
    private Mountain mountainCode;
    private double tuitionFee;

    public Student() {
        this.studentID="";
        this.name="";
        this.email="";
        this.phoneNumber="";
    }

    public Student(String studentID, String name, String phoneNumber, String email, double tuitionFee) {
        this.studentID = studentID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.tuitionFee=tuitionFee;
    }

    public String getStudentID() {
        return studentID.toUpperCase();
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
            this.tuitionFee = tuitionFee;
    }

    public Mountain getMountainCode() {
        return mountainCode;
    }

    public void setMountainCode(Mountain mountainCode) {
        this.mountainCode = mountainCode;
    }
   
    //Ham viet hoa chu cai dau tien
    public static String toTitleCase(String name){
        String rs="";
        StringTokenizer stk = new StringTokenizer(name," ");
        while(stk.hasMoreTokens()){
            String w=stk.nextToken();
            w=(w.charAt(0)+"").toUpperCase()+w.substring(1).toLowerCase();
            rs=rs+" "+w;
        }
        return rs.trim();
    }
        
    
        
    
    
   

    
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", mountainCode=" + mountainCode + ", tuitionFee=" + tuitionFee + '}';
    }
    
}
