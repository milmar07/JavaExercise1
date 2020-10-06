/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Marko
 */

// Task 2 creating MyUnit
         class MyUnit{
             public String concatenate(String one, String two){
                 return one + two;
             }
         }

      
//Task 3 creating a Test class for MyUnit (concatenate)
public class MyUnitTest{
    @Test
    public void testConcatenate(){
                MyUnit myUnit = new MyUnit();
                String result = myUnit.concatenate("one", "two");
                assertEquals("onetwo", result);
            }
    
}
