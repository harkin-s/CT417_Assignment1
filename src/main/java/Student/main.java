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
public class main {
    
    public static void main(String[] args){
        Student Sean = new Student("Sean","05-09-1994",22,13344471);
        String UserName = Sean.getuserName();
        System.out.println("User Name is : " + UserName);
    }
    
    
    
    
}
