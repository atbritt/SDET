import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LastLetterCount {


    public static void main(String[] args) {

        System.out.println("Please enter a sentence!");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.nextLine();
        sentence = sentence.toLowerCase().replaceAll("\\p{Punct}", "");

        lastLetterCount(sentence);
    }

    private static void lastLetterCount(String sentence) {
        int sCount = 0;
        int yCount = 0;
        boolean firstS = false;
        boolean firstY = false;
        int yPos = 0;
        int sPos = 0;
        int currentIndex = 0;
        String newSentence = "";

        String[] arr = sentence.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(arr));

        for (String word : wordList){
            if (word.charAt(word.length() - 1) == 's' && !firstS){
                sCount++;
                sPos = currentIndex +1;
                firstS = true;
                currentIndex++;
            } else if (word.charAt(word.length() - 1) == 's') {
                sCount++;
                currentIndex++;
            }else if (word.charAt(word.length()-1) == 'y' && !firstY){
                yCount++;
                yPos = currentIndex +1;
                firstY = true;
                currentIndex++;
            } else if (word.charAt(word.length()-1) == 'y') {
                yCount++;
                currentIndex++;
            }else {
                currentIndex++;
            }
        }
        if (sPos != 0 && yPos != 0) {
            Collections.swap(wordList, sPos, yPos);
            for (int i = 0; i < wordList.size(); i++) {
                if (i != wordList.size() - 1) {
                    newSentence = newSentence + wordList.get(i) + " ";
                } else {
                    newSentence = newSentence + wordList.get(i) + ".";
                }
            }
                newSentence = newSentence.substring(0, 1).toUpperCase() + newSentence.substring(1);
                System.out.println(newSentence + "\nNumber of words ending in S: " + sCount + "\nNumber of words ending in Y: " + yCount);

        } else {
            sentence= sentence.substring(0,1).toUpperCase() + sentence.substring(1);
            System.out.println(sentence + "." + "\nThere were not words ending in both Y and S\nNumber of words ending in S: " + sCount + "\nNumber of words ending in Y: " + yCount);
        }






        }
    }

