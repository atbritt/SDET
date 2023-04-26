import java.util.Scanner;

public class Vowels {


    public static void main(String[] args) {

        System.out.println("Please enter a sentence!");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine();
        sentence = sentence.toLowerCase();

        countVowel(sentence);

    }

    private static void countVowel(String sentence) {
        int vowelCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                              vowelCount++;
                           }
                       }
                      System.out.println("The number of vowels in the sentence is: " + vowelCount);
                   }
    }


