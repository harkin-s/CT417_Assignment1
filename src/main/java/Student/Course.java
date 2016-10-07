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
    
}
