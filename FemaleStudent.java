
package School_Result_Management_System;


public class FemaleStudent extends Student{

    public FemaleStudent(String id, String name, String phonenumber,String address) {
        super(id, name, phonenumber, address);
    }
    
   public void canShowAttendencePercentage(double attendence)
    {
        System.out.println(attendence);
    }
    
}
