import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyzer {

    public static Map<String, Long> countWords(String text) {
        return Arrays.stream(text.toLowerCase()
                        .replaceAll("[^a-zA-Z0-9 ]", "")
                        .split("\\s+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()));
    }

    public static String mostFrequentWord(String text) {
        return countWords(text)
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No words found");
    }

    public static int countCharacters(String text) {
        return text.replace(" ", "").length();
    }

    public static void main(String[] args) {
        String text = "Java is great. Java is powerful. Java is everywhere.";

        System.out.println("Word frequencies:");
        System.out.println(countWords(text));

        System.out.println("\nMost frequent word:");
        System.out.println(mostFrequentWord(text));

        System.out.println("\nCharacter count:");
        System.out.println(countCharacters(text));
    }
}
