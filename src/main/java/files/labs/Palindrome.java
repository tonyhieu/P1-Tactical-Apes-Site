package files.labs;

import java.lang.*;
import java.util.Scanner;
public class Palindrome{

     public static void main(String []args) {
         System.out.println("Enter word");
         Scanner myObj = new Scanner(System.in);
         String word = myObj.nextLine();
         String changedWord = word.replaceAll("\\s", "");
         Palindrome test = new Palindrome();
         boolean isPali = test.isPalindrome(changedWord);
         boolean isPaliRec = test.isPalindromeRecursive(changedWord, 0, changedWord.length() - 1);
         if (isPali) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not a palindrome");
         }
         if (isPaliRec) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not a Palindrome");
         }
     }
       
     public boolean isPalindrome (String input) {
         String[] stringArray = new String[(input.length())];
         for (int i = 0; i < stringArray.length; i++) {
             stringArray[i] = input.substring(i,i+1);
         }
         for (int j = 0; j < stringArray.length / 2; j++) {
            if (!(stringArray[j].equalsIgnoreCase(stringArray[stringArray.length-(j+1)]))) {
                return false;
            }
         }
         return true;
         
     }
     public boolean isPalindromeRecursive(String input, int min, int max) {
         if (min==max) {
             return true;
         }
         
         if (!(input.charAt(min).equalsIgnoreCase((input.charAt(max))))) {
             return false;
         }
         
         if (min < max - 1) {
             return isPalindromeRecursive(input, min + 1, max - 1);
         }
         return true;
     }
} 
