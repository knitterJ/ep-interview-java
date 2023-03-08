import java.util.*;

public class TextAnalyzer {

  public static Map<String, Integer> analyze(String text) {
       // usuwamy znaki interpunkcyjne i białe znaki, dzielimy tekst na wyrazy
       String[] words = text.replaceAll("\\p{Punct}|\\d", "").toLowerCase().split("\\s+");

       // tworzymy mapę, w której kluczami są wyrazy, a wartościami ilość ich wystąpień
       Map<String, Integer> wordCounts = new TreeMap<>();
       for (String word : words) {
           if (word.isEmpty()) {
               continue;
           }

           // Metoda put wstawia do mapy parę klucz-wartość (key-value). Jeśli mapa już zawiera element o podanym kluczu, to jego wartość jest aktualizowana na podstawie nowej wartości podanej w metodzie put.
           // w wyrażeniu wordCounts.getOrDefault(word, 0) metoda getOrDefault będzie próbowała pobrać wartość z mapy dla klucza word. Jeśli w mapie jest wartość dla tego klucza, zostanie ona zwrócona, a jeśli nie, zostanie zwrócona wartość domyślna podana jako drugi argument, czyli w tym przypadku 0. Innymi słowy, jeśli w mapie jest wartość dla klucza word, to zostanie ona pobrana, a jeśli nie ma, to zostanie zwrócona wartość 0.
           wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
       }

       return wordCounts;
   }

  public static void main(String[] args) {

    String text1 = "Ala ma kota? Ala lubi koty.";
    Map<String, Integer> result1 = analyze(text1);
    System.out.println("Result 1:");
    System.out.println(result1);

    String text2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ullamcorper tincidunt turpis eget porttitor.";
    Map<String, Integer>  result2 = analyze(text2);
    System.out.println(result2);
    // System.out.println("Result 2:");
    // System.out.println(result2);

    String text3 = "To jest prosty tekst bez żadnych znaków interpunkcyjnych.";
    Map<String, Integer>  result3 = analyze(text3);
    System.out.println("Result 3:");
    System.out.println(result3);
  }
}
