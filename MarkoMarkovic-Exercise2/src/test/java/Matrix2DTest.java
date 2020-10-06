/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import markomarkovic.markomarkovic.exercise2.Matrix2D;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Marko
 */
public class Matrix2DTest {
    
    public Matrix2DTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testMain() {
        Matrix2D matrix1 = new Matrix2D(5,1);
        Matrix2D matrix2 = new Matrix2D(1,7);
        Matrix2D matrix3 = new Matrix2D(2,3);
        // matrix4 just for showing that the function myAddition() is working
        Matrix2D matrix4 = new Matrix2D(2,3);
        
        matrix1.fillMatrix();
        matrix2.fillMatrix();
        matrix3.fillMatrix();
        matrix4.fillMatrix();
        
        // this is just for showing BEFORE the state of matrix3
        matrix3.printMatrix();
        
        try {   //testing matrix1 + matrix2
        matrix1.myAddition(matrix2);
        System.out.println("Successful Addition");
        } catch(Exception e) {System.out.println("Matrix dimensions mismatch");}
        
        
        try {   //testing matrix2 + matrix3
        matrix2.myAddition(matrix3);
        System.out.println("Successful Addition");
        } catch(Exception e) {System.out.println("Matrix dimensions mismatch");}
        
        
        try {   //testing matrix3 + matrix1
        matrix3.myAddition(matrix1);
        System.out.println("Successful Addition");
        } catch(Exception e) {System.out.println("Matrix dimensions mismatch");}
   
        
        try {   //testing matrix1 + matrix2
        matrix3.myAddition(matrix4);
        System.out.println("Successful Addition");
        } catch(Exception e) {System.out.println("Matrix dimensions mismatch");}
    

        //This is just for showing that addition with matrix4 was successful
        matrix3.printMatrix();
       
        try {   //testing myMultiplication with matrixes
        matrix1.myMultiplication(matrix2);
        System.out.println("Successful Multiplication");
        } catch(Exception e) {System.out.println("The number of columns of matrix1 do not match the number of rows in matrix2");}
        
        try {   //testing myMultiplication with matrixes
        matrix2.myMultiplication(matrix3);
        System.out.println("Successful Multiplication");
        } catch(Exception e) {System.out.println("The number of columns of matrix2 do not match the number of rows in matrix3");}

        try {   //testing myMultiplication with matrixes
        matrix3.myMultiplication(matrix1);
        System.out.println("Successful Multiplication");
        } catch(Exception e) {System.out.println("The number of columns of matrix3 do not match the number of rows in matrix1");}
        
        //This is the new matrix for the test case with matrix3
        Matrix2D matrix5 = new Matrix2D(3,7);
        // the correct case for matrix3 with matrix5
        try {   //testing myMultiplication with matrixes
        matrix3.myMultiplication(matrix5);
        System.out.println("Successful Multiplication");
        } catch(Exception e) {System.out.println("The number of columns of matrix3 do not match the number of rows in matrix5");}
   
    }
    
}
