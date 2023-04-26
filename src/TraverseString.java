import java.util.HashMap;
import java.util.Scanner;

public class TraverseString {
    public static void main(String[] args) {

        System.out.println("Please enter a sentence!");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine();
        sentence = sentence.toLowerCase().replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        String newSentence = "";

        HashMap<Character, Integer> mappy = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++){
            if (!mappy.containsKey(sentence.charAt(i))){
                mappy.put(sentence.charAt(i), 1);
                newSentence = newSentence + sentence.charAt(i);
            }
        }

        System.out.println("The unique characters are: " + newSentence);

    }
}
