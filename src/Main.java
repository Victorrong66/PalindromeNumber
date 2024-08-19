//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        //Test cases
        int[] testNum = {121, -121, 10, 12321, 1234321, 0, 1, 22, 12345};

        for (int num : testNum) {
            boolean result = palindromeNumber.isPalindrome(num);
            System.out.println("Is " + num + " a palindrome? " + result);
        }
    }
}