package com.clubs2win.session8;

public class Main {

    public static void main(String[] args) {
	// this is where I will type my homework
        System.out.println("Is Even problem below");
        System.out.println("6 is even. " + isEven(6));
        System.out.println("7 is even. " + isEven(7));
        System.out.println("0 is even. " + isEven(0));
        System.out.println("-6 is even. " + isEven(-6));
        System.out.println("-7 is even. " + isEven(-7));
        System.out.println("Is Prime problem below");
        System.out.println("6 is prime. " + isPrime(6));
        System.out.println("2 is prime. " + isPrime(2));
        System.out.println("25 is prime. " + isPrime(25));
        System.out.println("9 is prime. " + isPrime(9));
        System.out.println("100 is prime. " + isPrime(17));
        System.out.println("Is Palindrome problem below");
        System.out.println("123 is palindrome. " + isPalindrome(123));
        System.out.println("121 is palindrome. " + isPalindrome(121));
        System.out.println("-121 is palindrome. " + isPalindrome(-121));
        System.out.println("-123 is palindrome. " + isPalindrome(-123));

    }
    public static boolean isPalindrome (int n){
        int palindrome = n; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }


        return n == reverse;
    }

    /*
    Assume that int n for isPrime is positive
    The if line  in the for loop, is when n/j has no remainder, so when n is a multiple of j, n is not a prime
     */
    public static boolean isPrime (int n){
        boolean prime = true;
        if (n % 2 == 0)
            prime = false;
        if (n == 2)
            prime = true;
        for (int j = 3; j <= Math.sqrt(n); j+=2) {
            if (n % j == 0) {
                prime =  false;
            }
        }
        return prime;


    }
    public static boolean isEven (int n ) {
        return ((n / 2) * 2 == n);
        }

}
