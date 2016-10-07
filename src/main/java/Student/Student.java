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
public class Student {
    
    String name;
    String DOB;
    int age;
    int ID;
    
    
    public Student(String name , String DOB , int age, int ID){
        this.name = name;
        this.DOB = DOB;
        this.age =age;
        this.ID = ID;
        
    }
    //Start of Setters
    public void setName(String name){
        this.name = name;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    //End of Setters
    
    //Begin of Getters
    public String getName(){
        return this.name;
    }
    public String getDOB(){
        return this.DOB;
    }
    public int getID(){
        return this.ID;
    }
    public int getage(){
        return this.age;
    }
    public String getuserName(){
        return this.name +" "+ this.age;
    }
    //End of Getters 
}
    


