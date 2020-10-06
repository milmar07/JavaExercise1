/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.exercise3;

/**
 *
 * @author Marko Markovic
 */
class Matrix {
    public int matrix[][];
    public int rows;
    public int cols;
    
    public void Matrix(int rows, int cols){
    this.matrix = new int[rows][cols];
    this.rows = rows;
    this.cols = cols;
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
}
