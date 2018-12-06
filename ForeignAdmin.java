
package School_Result_Management_System;

import java.util.ArrayList;


public class ForeignAdmin extends Admin{
    void canShowTeacherInfo(ArrayList<SeniorTeacher>slist)
    {
        for(SeniorTeacher s:slist)
        {
            System.out.println(s);
        }
    }
            
}
