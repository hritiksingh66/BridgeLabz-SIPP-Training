package LinearAndBinarySearch;

public class LinearSearchWordInSentences {
    
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }
    
    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps",
            "Java is a programming language",
            "Linear search is simple",
            "Binary search is efficient"
        };
        String targetWord = "programming";
        
        String result = findSentenceWithWord(sentences, targetWord);
        System.out.println("Result: " + result);
    }
}