/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import org.joda.time.DateTime;

/**
 *
 * @author Sean
 */
public class Course {
    String course;
    Module[] modules = new Module[3];
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    
    public Course(String c , Module[] m ,DateTime sD, DateTime eD ){
        this.course = c;
        this.modules = m;
        this.startDate = sD;
        this.endDate = eD;
    }
    //Getters
    public String getCourse(){
      return this.course;  
    }
    public Object[] getModules(){
      return this.modules;  
    }
    public Object getsDate(){
      return this.startDate;  
    }
    public Object geteDate(){
      return this.endDate;  
    }
    //Setters
    public void setCourse(String s){
      this.course = s;  
    }
    public void setModules(Module[] m ){
       this.modules = m;  
    }
    public void setsDate(DateTime t ){
      this.startDate = t;  
    }
    public void seteDate(DateTime t){
      this.endDate = t;  
    }
    
}
