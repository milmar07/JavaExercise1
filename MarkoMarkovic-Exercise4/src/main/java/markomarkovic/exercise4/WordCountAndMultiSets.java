package markomarkovic.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Marko Markovic
 */
public class WordCountAndMultiSets {
    
    Set<String> multiset;
    
    public WordCountAndMultiSets(){
        this.multiset = new HashSet(); 
    }
    
    public static void main(String[] args){
        WordCountAndMultiSets firstBag = new WordCountAndMultiSets();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input data where delimiter is whitespace, and if you want to exit enter . (dot)");
        System.out.println("Please enter your line: ");
        while(sc.hasNextLine()){
            System.out.println("Please enter your line: ");
            String line = sc.nextLine();
            if(line.contains(".")){
                break;
            }
            String[] result = line.split(" ");
            for(int i=0;i<result.length;i++){
                firstBag.multiset.add(result[i]);
            }
        }
        System.out.println("Thank you for your input");
        ArrayList<Integer> firstThree= new ArrayList<Integer>();
        for(int i=0; i<firstBag.multiset.size();i++){
           if(firstThree.size() < 3){
               firstThree.add(Collections.frequency(firstBag.multiset, firstBag.multiset.))
           } 
        }
        
    }
}

