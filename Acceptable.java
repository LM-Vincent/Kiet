/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uitilities;
import model.Student;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface Acceptable {
    public static final String STU_ID_VALID ="^[QqSsHhDdCc][Ee]\\d{6}$";
//    public static final String NAME_VALID="^[A-Za-z]{2,20}$";
    public static final String DOUBLE_VALID = "\\d+(\\.\\d+)";
    public static final String INT_VALID = "\\d+";
    public static final String PHONE_VALID="^\\d{10}";
    public static final String VINA_VALID = "^(091|094|088|083|084|085|081|082)\\d{7}$";
    public static final String MOBI_VALID = "^(070|079|077|076|078|089|090|093)\\d{7}$";
    public static final String VIETTEL_VALID = "^(086|096|097|098|039|038|037|036|035|034|033|032)\\d{7}$";
    public static final String EMAIL_VALID = "^[\\w._+-]+@[\\w.-]+\\.[a-zA-Z.]{2,}$";
    
    
    
    public static boolean isValid(String data, String pattern){
        return data.matches(pattern);
    }
    
    
    //Check studentID exist.
    public static boolean isUniqueStudentID(String studentID,List<Student>studentList){
        for (Student student : studentList) {
            if(student.getStudentID().equalsIgnoreCase(studentID)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isUniqueName(String name,List<Student>studentList){
        for (Student student : studentList) {
            if(student.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }
    
}
