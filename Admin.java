
package School_Result_Management_System;

import java.util.ArrayList;


public class Admin {
     double gpa=0;
     public void gpaCalculate(ArrayList<Course>clist,ArrayList<Student>slist)
    {
       
        double total_credit=0;
        for(Course c:clist)
        {
        total_credit=total_credit+c.getCredit();
        gpa=gpa+(c.getCredit()*c.getGrade());
        }
        gpa=gpa/total_credit;
        for(Student s:slist)
        {
            s.canShowResult(gpa);
        }
        
     }
     void canCalWaiver(ArrayList<FemaleStudent>flist)
     {
         double waiver;
         for(FemaleStudent f:flist)
         {
             if(gpa>=3.8)
             {
                 waiver=f.getPay()*.3;
                 f.balance+=waiver;
                 
                 
             }
         }
     }
     
     
}
