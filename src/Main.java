import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {
        // Reading Files
        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\IdeaProjects\\Reading Files\\code.txt")));

        String[] myArray = string.split("\\s\\W");
        //System.out.println(myArray.length);
        int count = 0;


        for (int a = 0; a < myArray.length; a++) {
            if (Integer.parseInt(myArray[a]) == 0) {
                System.out.println(count);
                break;
            } else if (Integer.parseInt(myArray[a]) % 2 == 0) {
                count++;

            }
        }

        }

}
