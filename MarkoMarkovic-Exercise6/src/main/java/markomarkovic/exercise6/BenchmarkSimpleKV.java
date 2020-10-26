/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.exercise6;

import java.util.Random;

/**
 *
 * @author 330S
 */
public class BenchmarkSimpleKV {
    public final static int KEYPAIRS = 1000;
    
    public BenchmarkSimpleKV(){}
    
    
    public static void main(String[] args){
        Simple<String,Integer> kv1 = new SimpleKV();
        
        
        String alphabet = "ABCDEFGHIJLMNOPQRSTUVWXYZ";
        for(int i=0; i<10;i++){
            Random rd = new Random();
            StringBuilder stb = new StringBuilder();
            int temp = 0;
            long startTime=0;
            long endTime=0;
            long totalTime=0;
            
            startTime = System.nanoTime();
            while (temp < KEYPAIRS){
                temp+=1;
                for(int j = 0; j<30; j++){
                    int index = rd.nextInt(alphabet.length());
                    char randomChar = alphabet.charAt(index);
                    stb.append(randomChar);
            }
            String randomString = stb.toString();
            int randomNmb = rd.nextInt(10000);
            kv1.put(randomString, randomNmb);
            stb.setLength(0);
            }
            endTime = System.nanoTime();
            totalTime = (endTime - startTime)/1000000L;
            System.out.println("The total time in [" + i + "] try is : " + totalTime + " ms");
        }
    
    
    }
    
}
