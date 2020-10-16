/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.exercise5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marko Markovic  
 */
public class WordFilter {
    // a provided input String
    private String inputText;
    
    
    
    public WordFilter(){
        this.inputText = new String("What separates API specifications from a programming guide are examples,\n"
                + "definitions of common programming terms, certain conceptual overviews (such as\n"
                + "metaphors), and descriptions of implementation bugs and workarounds. There is no\n"
                + "dispute that these contribute to a developer's understanding and help a\n"
                + "developer write reliable applications more quickly. However, because these do\n"
                + "not contain API \"assertions\", they are not necessary in an API specification.\n"
                + "You can include any or all of this information in documentation comments (and\n"
                + "can include custom tags, handled by a custom doclet, to facilitate it). At Java\n"
                + "Software, we consciously do not include this level of documentation in doc\n"
                + "comments, and instead include either links to this information (links to the\n"
                + "Java Tutorial and list of changes) or include this information in the same\n"
                + "documentation download bundle as the API spec -- the JDK documentation bundle\n"
                + "includes the API specs as well as demos, examples, and programming guides.");
    }

    //task 1
    public static void wordsAtLineBegin(){
        WordFilter wf = new WordFilter();
        String regex = "(?m)^\\b(.*?)[^,]\\b";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(wf.inputText);
        
        while(matcher.find()){
            System.out.println(
                    String.format("Words found at the begingg of the Line: [%S]", matcher.group())
            );
        }
    }
    
    //task 2
    public static void wordsOfLenght(int len){}    
    
    //task 3
    public static void wordsAllCaps(){}
    
    //task 4
    public static void wordsFirstCapital(){}
    
    //task 5
    public static void wordsInBrackets(){}
    
    
    public static void main(String[] args){
        //task1
        wordsAtLineBegin();
        
        //task2
       // System.out.println("Please enter the lenght of the words you wish to get: ");
       // Scanner sc = new Scanner(System.in);
       // int inp = sc.nextInt();
        //wordsOfLenght(inp);
        //wordsAllCaps();
        //wordsFirstCapital();
        //wordsInBrackets();
        

    }
    
}
