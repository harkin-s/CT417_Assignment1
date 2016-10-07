package Testing;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Student.Student;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   @Test
   public void userNameTest() {
      Student Sean = new Student("Sean","05-09-1994",22,13344471);
      assertEquals(Sean.getuserName() , "Sean 22");
   }
}
