import java.util.Scanner;

public class RotateString {
    public static void main(String[] args){

        System.out.println("Please enter a word!");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine();
        String newSentence = "";

        int cut = 3;

        for (int i = cut; i < sentence.length(); i++){
            newSentence = newSentence + sentence.charAt(i);
        }
        for (int i = 0; i < cut; i++){
            newSentence = newSentence + sentence.charAt(i);
        }

        System.out.println(newSentence);




    }
}
