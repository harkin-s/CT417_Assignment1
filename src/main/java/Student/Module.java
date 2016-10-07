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
}
