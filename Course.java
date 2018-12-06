package School_Result_Management_System;
public class Course {
    String c_id;
    String c_name;
    double gpa;
   private double credit;
   private double grade;
int mark;
    public Course(String c_id, String c_name,double credit,double grade) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.credit=credit;
        this.grade=grade;
        
        
    }

    public double getCredit() {
        return credit;
    }

    public double getGrade() {
        return grade;
    }
    
    
    
    
}
