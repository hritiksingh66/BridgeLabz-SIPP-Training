package LinearAndBinarySearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFileReader {
    
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String targetWord = "hello";
        int count = 0;
        
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }
            
            System.out.println("Word '" + targetWord + "' appears " + count + " times in the file.");
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}