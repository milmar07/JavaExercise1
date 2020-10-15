package markomarkovic.exercise4;

import java.util.Iterator;
import java.util.Scanner;
import com.google.common.collect.HashMultiset; 
import com.google.common.collect.Multiset; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 *
 * @author Marko Markovic
 */
public class WordCountAndMultiSets {
    
    Multiset<String> multiset; 
    
    public WordCountAndMultiSets(){
        this.multiset = HashMultiset.create(); 
    }
    
    // sorting by value
    public static <String, Integer extends Comparable <? super Integer> > Map <String, Integer> sortByValue(Map<String, Integer> map){
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.<String,Integer>comparingByValue().reversed());
        
        Map<String, Integer> result = new LinkedHashMap<>();
        for(Entry<String, Integer> entry: list){
                result.put(entry.getKey(), entry.getValue());
        }
        
        return result;
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
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(Iterator<String> it = firstBag.multiset.iterator(); it.hasNext();){
            String nextLoad = new String();
            nextLoad = it.next();
            map.put(nextLoad,firstBag.multiset.count(nextLoad)); 
        }
        //sorting the map by values
        map = sortByValue(map);
        // limiting map to only 3 elements
        Map<String, Integer> topThree = map.entrySet().stream().limit(3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1,v2) -> v1, LinkedHashMap::new));
        System.out.println(topThree);
    }
}

