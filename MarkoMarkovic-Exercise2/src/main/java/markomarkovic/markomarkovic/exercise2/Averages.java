/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.markomarkovic.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marko Markovic
 */
public class Averages {
    
    private List<Double> myList;
    
    //Constructor
    public Averages(){
    this.myList = new ArrayList<Double>();
    }
    // Just a shortcut for getting the size of the List.
    public int getSize(){
        return this.myList.size();
    }
    
    // The Arithmetic Mean where we sum up all the numbers from List and then devide them with the number of elements we have.
    static Double arithMean(Averages e){
        double sum = 0.0;
        for(int i=0;i < e.getSize() ;i++){
            sum += e.myList.get(i);
        }
        return sum/(e.getSize());
    }
    
    
    // The Geometric Mean where i do a product on all the elements and then get the N-th root of the number of total elements.
    static Double geoMean(Averages e){
       double product = 1;
       for(int i=0; i< e.getSize(); i++){
           product *= e.myList.get(i);
       }
       double divider = 1.0/e.getSize();
       System.out.println("The divider is: " + divider);
       double value = Math.pow(product,divider);
       return value;
    }
    
    //The Garmonic Mean where i devide the total number of elements with the sum of 1/elements.
    static Double harmMean(Averages e){
        double sum = 0.0;
        for(int i=0; i<e.getSize();i++){
            sum += 1.0/e.myList.get(i);
        }
        return e.getSize() / sum;
    }
    
    public void printList(){
        System.out.print("The elements of list: ");
        for(int i=0; i<this.myList.size();i++){
            System.out.print(this.myList.get(i) + " , ");
        }
    }
    
    
    public static void main(String[] args){
        
        Averages myAvg = new Averages();
        
        // first enter the number of elements that you wish to enter
        System.out.println("The number of elements you wish to enter: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        
        // enter the values
        for(int j=0; j<i; j++){
            System.out.print("Value " + j +" is: ");
            double k = scanner.nextDouble();
            myAvg.myList.add(k); 
            System.out.println(k);
        }
        //Just to show the number of element in a List
        System.out.println("The size of the List is: " + myAvg.getSize());
        //The results of the method arithMean();
        System.out.println("The arithMean()returns: " + arithMean(myAvg));
        //The results of the method geoMean();
        System.out.println("The geoMean() return: " + geoMean(myAvg));
        //The results of the method harmMean();
        System.out.println("The harmMean() return: " + harmMean(myAvg));

    }
}
