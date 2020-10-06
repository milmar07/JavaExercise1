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
    public boolean matrix[][];
    public int rows;
    public int cols;
    
    
    //Basuc constructor for Matrix
    Matrix(int rows, int cols){
    this.matrix = new boolean[rows][cols];
    this.rows = rows;
    this.cols = cols;
    }

    Matrix() {
        this.matrix = new boolean[0][0];
        this.rows = 0;
        this.cols = 0;
    }
    
    
    //method for printing a matrix
    public void printMatrix(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                if(this.matrix[i][j] == false){
                    System.out.print("0" + "\t");
                } else {System.out.print("1" + "\t");}
                
            }System.out.println();
        }
    }
}
