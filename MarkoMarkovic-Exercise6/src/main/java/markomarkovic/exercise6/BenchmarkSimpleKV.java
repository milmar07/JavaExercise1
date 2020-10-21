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
        BenchmarkSimpleKV bs = new BenchmarkSimpleKV();
        int temp = 0;
        
        
        Random rd = new Random();
        String alphabet = "ABCDEFGHIJLMNOPQRSTUVWXYZ";
        StringBuilder stb = new StringBuilder();
        
        long startTime = System.nanoTime();
        while (temp < bs.KEYPAIRS){
            temp = kv1.getLenght();
            int randomLenght = (int)(Math.random()*10+1);
            for(int i = 0; i<randomLenght; i++){
                int index = rd.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                stb.append(randomChar);
        }
        String randomString = stb.toString();
        int randomNmb = rd.nextInt();
        kv1.put(randomString, randomNmb); 
        }
        long endtime = System.nanoTime();
        long totalTime = (endtime - startTime)/1000000L;
        System.out.println(totalTime);
    
    
    
    }
    
}
