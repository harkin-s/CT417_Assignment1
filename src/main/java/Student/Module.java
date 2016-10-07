/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Sean
 */
public class Module {
    String mname;
    String ID;
    Student[] Students = new Student[3];
    
    public Module(String mName,String ID , Student[] Students){
        this.mname = mName;
        this.ID = ID;
        this.Students = Students; 
    }
    
    //Getters
    public String getmName(){
        return this.mname;
    }
      public String getID(){
        return this.ID;
    }
        public Student[] getStudents(){
        return this.Students;
    }
        
    //Setters
        public void setmName(String n){
        this.mname = n;
    }
      public void setID(String i ){
        this.ID = i;
    }
        public void setStudents(Student[] s){
        this.Students = s;
    }
}
