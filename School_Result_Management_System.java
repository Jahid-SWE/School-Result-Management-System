
package School_Result_Management_System;

import java.util.ArrayList;


public class School_Result_Management_System {

   
    public static void main(String[] args) {
       Course c=new Course("23","phy",3,3.5);
       ArrayList<Course>clist=new ArrayList<>();
       clist.add(c);
       MaleStudent s=new MaleStudent("dkfj","suman","34", "molla bari");
       ArrayList<MaleStudent>slist=new ArrayList<>();
        s.courseAssgin(clist);
       FemaleStudent f=new FemaleStudent("434","djf", "34", "ere");
       ArrayList<FemaleStudent>flist=new ArrayList<>();
       f.courseAssgin(clist);
       SeniorTeacher t=new SeniorTeacher("PRINCE","43");
       t.courseAssign(clist);
       t.givesMark(slist);
       JuniorTeacher j=new JuniorTeacher("SAYEEF","34");
     
      
       
       
       
       
    }
    
}
