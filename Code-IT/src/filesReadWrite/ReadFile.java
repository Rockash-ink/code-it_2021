package filesReadWrite;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

import javax.xml.crypto.Data;



//todo , muste read files from the folder file and check wich file have the name of file.
public class ReadFile {
    public static String data;
    public static HashSet<String> files = new HashSet<String>();

    public static HashSet<String> getReadAllFilesName(final File folder){
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                    getReadAllFilesName(fileEntry);
            } else {
                readFile("files/" +fileEntry.getName());
                String fileName = fileEntry.getName();
                
                String finalName = fileName.replace(".csv", "");
                //System.out.println(fileEntry.getName());
                files.add(finalName);
                //System.out.println(files);
            }
        }
        return files;
    }

    public static String getReadFileName(String filename){
        
        
        try {
            File myObj = new File(filename + ".csv");
            
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            
            myReader.close();
            
        } catch (FileNotFoundException e ){
            System.out.println("an error occured.");
            e.printStackTrace();
        } 
        return data;
    }

    public static String readFile(String filename){
        
        
        try {
            File myObj = new File(filename);
            
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            
            myReader.close();
            
        } catch (FileNotFoundException e ){
            System.out.println("an error occured. i didnt find the file");
            e.printStackTrace();
        } 
        return data;
    }
}
