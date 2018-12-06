
package School_Result_Management_System;

import java.util.ArrayList;


public class LocalAdmin extends Admin{
     void canShowTeacherInfo(ArrayList<JuniorTeacher>slist)
    {
        for(JuniorTeacher s:slist)
        {
            System.out.println(s);
        }
    }
      void canCalWaiverForMale(ArrayList<MaleStudent>mlist)
     {
         double waiver;
         for(MaleStudent f:mlist)
         {
             if(gpa>=3.8)
             {
                 waiver=f.getPay()*.3;
                 f.balance+=waiver;
                 
                 
             }
         }
     }
}
