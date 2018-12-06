
package School_Result_Management_System;

import java.util.ArrayList;


public class SeniorTeacher extends Teacher implements Attendence{

    public SeniorTeacher(String name,String id) {
        super(name,id);
    }
 
     public void givesMark(ArrayList<MaleStudent>slist)
    {
        
        for(MaleStudent s:slist)
        {
            for(Course c:s.a)
            {
                if(c.c_id=="171-35-1976")
                {
                c.mark=80;
                }
            }
        }
    }
     void showForeignStudentInfo(ArrayList<FemaleStudent>flist)
     {
         for(FemaleStudent f:flist)
         {
             System.out.println(f);
         }
     }
  public void can_calculate_attendence_percentage(ArrayList<FemaleStudent>flist)
  {
      s_attendence=(getNumber_of_student_absent()/getTotal_days_of_attendence()*100);
  }
     
    
}
