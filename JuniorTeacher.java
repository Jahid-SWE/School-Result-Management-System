
package School_Result_Management_System;

import java.util.ArrayList;

public class JuniorTeacher extends Teacher implements Attendence{

    public JuniorTeacher(String name,String id) {
        super(name,id);
    }
  
    
    public void givesMark(ArrayList<MaleStudent>slist)
    {
        for(MaleStudent s:slist)
        {
            for(Course c:s.a)
            {
                c.mark=80;
            }
        }
    }
   
     public void givesMarkforForeign(ArrayList<FemaleStudent>flist)
    {
        for(FemaleStudent s:flist)
        {
            for(Course c:s.a)
            {
                c.mark=80;
            }
        }
    }
      public void can_calculate_attendence_percentage(ArrayList<FemaleStudent>flist)
  {
      for(FemaleStudent f: flist)
      {
      s_attendence=(getNumber_of_student_absent()/getTotal_days_of_attendence()*100);
      f.canShowAttendencePercentage(s_attendence);
      }
      
  }
   
}
