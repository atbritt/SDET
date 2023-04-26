import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        System.out.println("Please enter a word or sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();


        wordCount(sentence);
    }

    private static void wordCount(String sentence) {
        int wordCount = 0;

        if (sentence.isEmpty()){
            System.out.println("The number of words in your sentence is: " + wordCount);
        } else {
            wordCount ++;
            for (int i = 0; i < sentence.length(); i++){
                if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' '){
                    wordCount ++;
                }


            }
            if (sentence.charAt(sentence.length() - 1) == ' ') {
                wordCount --;
            }
            System.out.println("The number of words in your sentence is: " + wordCount);
        }
    }


}