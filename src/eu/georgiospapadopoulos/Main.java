package eu.georgiospapadopoulos;

public class Main {

    public static void main(String[] args) {


        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1231));
        System.out.println(isPalindrome(121));

    }

    /**
     * Receives a number and checks if it is a palindrome or not.
     * @param number Number to check.
     * @return The boolean result.
     */
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0, remainingNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            remainingNumber = number % 10;
            reversedNumber = reversedNumber * 10 + remainingNumber;
            number /= 10;

        }

        return (reversedNumber == originalNumber);
    }

}
