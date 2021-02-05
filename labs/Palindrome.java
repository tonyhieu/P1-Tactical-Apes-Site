import java.lang.*;
public class Palindrome{

     public static void main(String []args){
        System.out.println("Hello World");
        Palindrome test = new Palindrome();
        boolean isPali = test.isPalindrome("abcddcba");
        if (isPali) {
          System.out.println("Palindrome");
        } else {
          System.out.println("Not a palindrome");
        }
       
     public boolean isPalindrome (String input) {
         String changedInput = input.replaceAll("\\s", "");
         String[] stringArray = new String[(changedInput.length())];
         for (int i = 0; i < stringArray.length; i++) {
             stringArray[i] = changedInput.substring(i,i+1);
         }
         for (int j = 0; j < stringArray.length / 2; j++) {
            if (!(stringArray[j].equals(stringArray[stringArray.length-(j+1)]))) {
                return false;
            }
         }
         return true;
         
     }
} 
