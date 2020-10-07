package markomarkovic.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

/**
 *
 * @author Marko Markovic
 */
public class AssociativeArray {
    HashMap<String, String> hashMap;
    TreeMap<String, String> treeMap;
    Hashtable<String, String> hashTable;
    
    public AssociativeArray(){
        this.hashMap = new HashMap<String, String>();
        this.treeMap = new TreeMap<String, String>();
        this.hashTable = new Hashtable<String, String>();
    }
    
    
    
    public static void main(String[] args){
        AssociativeArray aArray = new AssociativeArray(); 
        String line = new String();
        String splitBy = ",";
        
        System.out.println("This is how we read the data one by one: ");
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\330S\\Documents\\GitHub\\JavaExercise1\\MarkoMarkovic-Exercise4\\files/inputData.csv"));
            while((line = br.readLine()) != null){
                String[] data = line.split(splitBy);
                System.out.println(data[0] + "," + data[1]);
                aArray.hashMap.put(data[0], data[1]);  
                aArray.treeMap.put(data[0], data[1]);
                aArray.hashTable.put(data[0], data[1]);
            }
            
            
        } catch(IOException e){System.out.println("There was an error");}
        
        System.out.println("This is how we see them in different types of MAPS");
        //Printing
        System.out.println("---------------------------------------------------------");
        System.out.println("This is for the HashMap: " + aArray.hashMap);
        System.out.println("---------------------------------------------------------");
        System.out.println("This is for the TreeMap: " + aArray.treeMap);
        System.out.println("---------------------------------------------------------");
        System.out.println("This is for the Hashtable: " + aArray.hashTable);
        System.out.println("---------------------------------------------------------");
    }
}
