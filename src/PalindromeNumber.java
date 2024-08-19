// This program will return either true or false if the integer number that is entered is a palindrome

//Define the class
public class PalindromeNumber {
    //Declares the public method name and takes an integer "x" as an input, and it returns a boolean value
    //(True or False) which indicates if the number is a palindrome
    public boolean isPalindrome(int x) {
        //1. x < 0 = If the x is negative
        //2. x != 0 && x % 10 == 0 = If the x is a non-zero number ending in 0
        //These two conditions in the "if" Statement, if true, will return false
        if (x < 0 || (x != 0 && x % 10 == 0)) {
          return false;
        }
        //The variables "reversed" and "original" will be integers
        //The variable "reversed" will store the reversed digits of "x"
        //The variable "original" will hold the initial value of "x" for later comparison
        int reversed = 0;
        int original = x; //Ex: 12321

        //This "while" statement will reverse the "original" integer variable stored
        //and update the "reversed" integer variable until the condition in the "While"
        //statement is false (Ex: 12 > 123)
        while (x > reversed) { //Compares to see if "original" is greater than "reversed" and if it is true then "while"
                               //statement will begin
            reversed = reversed * 10 + x % 10;
            //Ex:
            //reversed = 0 * 10 + 12321 % 10
            //reversed = 0 + 1
            //reversed = 1
            x /= 10;
            //x = 12321 / 10
            //reversed = 1
            //original x = 1232

        }
    return (x == reversed) || (x == reversed / 10);
    }
}

