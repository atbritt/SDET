import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Please enter a word or sentence:");
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();

        checkPalindrome(palindrome);



    }

    public static void checkPalindrome(String palindrome){
        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length(); i++){
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)){
                isPalindrome = false;
            }
        }


        if (isPalindrome == true) {
            System.out.println("Your word " + palindrome + " is a palindrome");
        } else {
            System.out.println("Your word " + palindrome + " is not a palindrome");
        }
    }
}
