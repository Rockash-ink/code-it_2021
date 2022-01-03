package filesReadWrite;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;




//todo , muste read files from the folder file and check wich file have the name of file.
public class ReadFile {
    public static String data;
    public static HashSet<String> files = new HashSet<String>();
    static String fileType;

    public static HashSet<String> getReadAllFilesName(final File folder){
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                    getReadAllFilesName(fileEntry);
            } else {
                
                String fileName = fileEntry.getName();
                
                String finalName = fileName.replace(".csv", "");
                //System.out.println(fileEntry.getName());
                files.add(finalName);
                //System.out.println(files);
                
            }
        }
        return files;
    }
    //i completelly forgot


    public static String readFile(String filename,String WhatReturn){
        
        
        
        try {
            File dataObj = new File(filename);
            //for the second scanner
            File typeObj = new File(filename);

            //this read all the files
            Scanner dataScanner = new Scanner(dataObj);
            //this read the type of the file
            Scanner typeScanner = new Scanner(typeObj);
            typeScanner.useDelimiter(",|\\n");

            //first scanner
            while (dataScanner.hasNextLine()) {
                data = dataScanner.nextLine();
                //System.out.println(data);
            }
            //secondScanner
            typeScanner.nextLine();
            
            fileType = typeScanner.next();
            //close Scanners
            switch(WhatReturn){
                case "data":
                dataScanner.close();
                typeScanner.close();
                return data;
                case "fileType":
                dataScanner.close();
                typeScanner.close();
                return fileType;
                case "fileName":
                fileType = typeScanner.next();
                dataScanner.close();
                typeScanner.close();
                return fileType;
                
            }

            dataScanner.close();
            typeScanner.close();
            

            //System.out.println(fileType);
            
        } catch (FileNotFoundException e ){
            System.out.println("an error occured. i didnt find the file");
            e.printStackTrace();
        } 

        
        return "nodata";
    }
}
