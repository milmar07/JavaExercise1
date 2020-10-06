package markomarkovic.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //Task 1 printing HelloWorld
        System.out.println("Hello World");
        
        //Task 4 Reading a number N using Scanner and creating an output
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        String myString = new String();

        if(myInt%3 == 0){
            for(int i=0; i < myInt; i++){
                myString = myString.concat("=");
            }
            System.out.println(myString);
        }   
        else{
            for (int j=0; j < myInt; j++){
                myString = myString.concat("-");
            }
            System.err.println(myString);
        }        

        //Task 5 A simple copy first line from one file to another, the fiels are already pre-created and copyfrom.txt file is filled with some lines.
        File myFile = new File("D:\\FAX\\SoftwareSkillsLab\\MarkoMarkovic-Exercise1\\files/copyfrom.txt");
        Scanner myReader = new Scanner(myFile);
        String textLine = myReader.nextLine();
        myReader.close();

        FileWriter myWriter = new FileWriter("D:\\FAX\\SoftwareSkillsLab\\MarkoMarkovic-Exercise1\\files/copyto.txt");
        myWriter.write(textLine);
        myWriter.close();

        System.out.println("Copy Finished");
    }
}
