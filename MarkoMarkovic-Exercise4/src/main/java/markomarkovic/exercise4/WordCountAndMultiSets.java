package markomarkovic.exercise4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import com.google.common.collect.HashMultiset; 
import com.google.common.collect.Multiset; 
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Marko Markovic
 */
public class WordCountAndMultiSets {
    
    Multiset<String> multiset; 
    
    public WordCountAndMultiSets(){
        this.multiset = HashMultiset.create(); 
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
        
        System.out.println("The most common 3 words: ");
        
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(Collections.reverseOrder());
        
        for(Iterator<String> it = firstBag.multiset.iterator(); it.hasNext();){
            String nextLoad = new String();
            nextLoad = it.next();
            treeMap.put(firstBag.multiset.count(nextLoad), nextLoad);    
        }
        
        TreeMap<Integer, String> myNewMap = treeMap.entrySet().stream().limit(3).collect(TreeMap::new, (m,e) -> m.put(e.getKey(), e.getValue()), Map::putAll);
        System.out.println(myNewMap);
    }
}

