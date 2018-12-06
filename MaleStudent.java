
package School_Result_Management_System;

import java.util.ArrayList;


public class MaleStudent extends Student {

    public MaleStudent(String id, String name, String phonenumber,String address) {
        super(id, name, phonenumber, address);
    }
 void canVisitWebsite(String googleClassroom,String studentPortal)
 {
     if(googleClassroom.equals("googleClassroom")&& studentPortal.equals("studentPortal"))
     {
         System.out.println("They can visit these sites");
     }
     else
     {
         System.out.println("can't visit");
     }
     
 }
    @Override
 public void canShowAttendencePercentage(double attendence)
    {
        System.out.println(attendence);
    }
    
}
