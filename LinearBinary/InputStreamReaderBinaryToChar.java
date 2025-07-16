package LinearAndBinarySearch;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderBinaryToChar {
    
    public static void main(String[] args) {
        String fileName = "data.txt";
        
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}