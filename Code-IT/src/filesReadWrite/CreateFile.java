package filesReadWrite;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFile {
    public static void createFile(String filename){
        try {
            File myObj = new File("files/" + filename + ".csv");
            if (myObj.createNewFile()) {
                System.out.println("File Created: " + myObj.getName());

            } else {
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    public static void writeFile(String filename){
        try {
            FileWriter myWriter = new FileWriter("files/" + filename + ".csv");
            myWriter.write("im writhing this,");
            myWriter.write("im writhing that");
            myWriter.close();
            System.out.println("i successfully write");

        } catch (IOException e){
            System.out.println("an error occured.");
            e.printStackTrace();
        }
    }
}
