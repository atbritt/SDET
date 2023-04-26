import java.util.Scanner;

public class Consonants {


    public static void main(String[] args) {

        System.out.println("Please enter a sentence!");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine();
        sentence = sentence.toLowerCase();

        countConsonants(sentence);



    }

    private static void countConsonants(String sentence) {
        int consonantCount = 0;
        String replacedConsonants = "";

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == 'b' || sentence.charAt(i) == 'c' || sentence.charAt(i) == 'd' || sentence.charAt(i) == 'f' ||
                    sentence.charAt(i) == 'g' || sentence.charAt(i) == 'h' || sentence.charAt(i) == 'j' || sentence.charAt(i) == 'k' ||
                    sentence.charAt(i) == 'l' || sentence.charAt(i) == 'm' || sentence.charAt(i) == 'n' || sentence.charAt(i) == 'p' ||
                    sentence.charAt(i) == 'q' || sentence.charAt(i) == 'r' || sentence.charAt(i) == 's' || sentence.charAt(i) == 't' ||
                    sentence.charAt(i) == 'v' || sentence.charAt(i) == 'w' || sentence.charAt(i) == 'x' || sentence.charAt(i) == 'y' ||
                    sentence.charAt(i) == 'z'){
                consonantCount ++;
                replacedConsonants = replacedConsonants + '*';
            } else {
                replacedConsonants = replacedConsonants + sentence.charAt(i);
            }
        }
        System.out.println("The number of consonants is: " + consonantCount);
        System.out.println("The new sentence is: " + replacedConsonants);
    }
}
