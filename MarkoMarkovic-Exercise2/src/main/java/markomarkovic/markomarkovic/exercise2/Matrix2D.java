/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.markomarkovic.exercise2;

/**
 *
 * @author Marko
 */
public class Matrix2D {
    private final int matrix[][];
    private final int rows;
    private final int cols;
   
    //Methods for Constructing;
    public Matrix2D(int rows, int cols){
      this.matrix = new int[rows][cols]; 
      this.rows = rows;
      this.cols = cols;
    }
    //method just to fill in the matrix with integers
    public void fillMatrix(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols; j++){
                this.matrix[i][j] = (i+j)*2;
            }
        }
    }
    
    //method to fill with 0
    public void fillMatrixZero(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols; j++){
                this.matrix[i][j] = 0;
            }
        }
    }
    
    //method for printing a matrix
    public void printMatrix(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________");
    }
    
    //Methods for Addition;
    /*
    The method that you asked needed to return the value of new matrix and it should be something like this:
    public Matrix2D myAddition(Matrix2D other) throws Exception {
        if(this.rows == other.rows && this.cols == other.cols){
            Matrix2D tempMatrix = new Matrix2D(this.rows,this.cols);
            for(int i=0;i<this.rows;i++){
                for(int j=0;j<this.cols; j++){
                    tempMatrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
                }
            }
            return tempMatrix;
        } else {throw new Exception();}
    }
    
    
    This should be the method that you needed and in test case you should use it like this
    matrix3 = matrix1.myAddition(matrix2);
    
    Then the matrix3 will get the values of the addition.
    
    In my example i used it without returning the values, i hope you understand what i mean.
    }
    
    */
    public void myAddition(Matrix2D other) throws Exception {
        if(this.rows == other.rows && this.cols == other.cols){
            for(int i=0;i<this.rows;i++){
                for(int j=0;j<this.cols; j++){
                    this.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
                }
            }
        } else {throw new Exception();}
    }
    
    //Methods for Multiplication;
    /*
    This method is returning values Matrix2D unlike in myAddition(), but if you want me to make the changes for
    method myAddition(), i can do so, and also changing a bit of Test class as well.
    */
    public Matrix2D myMultiplication(Matrix2D other) throws Exception{
        if(this.cols == other.rows){
            Matrix2D temp = new Matrix2D(this.rows,other.cols); 
            temp.fillMatrixZero();
            for(int i=0; i<this.rows;i++){
                for(int j=0;j<other.cols;j++){
                    for(int k=0;k<other.rows;k++){
                            temp.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                        }
                    }
                }
                return temp;
            } else {throw new Exception();}
    }
    
    
    
    
    
    
    public static void main(String[] args){
        
        /* This was all just for testing purposes while writing a program, the real test cases are in Matrix2DTest class.
        Matrix2D matrica1 = new Matrix2D(1,2);
        Matrix2D matrica2 = new Matrix2D(2,6);
        matrica1.fillMatrix();
        matrica2.fillMatrix();
        
        matrica1.printMatrix();
        matrica2.printMatrix();
        
        try{
        matrica1.myAddition(matrica2);
        System.out.println("Successful Addition");
        }catch(Exception e){
           System.out.println("Matrix dimension do not match");
        }
        matrica1.printMatrix();//For showing the values of Matrix 1 with position after using Addition method
        //If the program returns the same value as before then the addition was not made because the dimensions of the matrix were not the same
        //otherwise the method myAddition will do the job and compute the sum of those two matrix.

        try{
        matrica1 = matrica1.myMultiplication(matrica2);
        System.out.println("Successfull Multiplication");
        }catch(Exception e){
            System.out.println("Matrix 1 columns do not match the number of Matrix 2 rows, so the calculation could not be made");
        }
        
        matrica1.printMatrix(); //This will just show if we made the calculation or not
        */
    }
}
