package Class8;

import java.util.Locale;

public class MyHomeWork8 {
    public static void main(String[] args) {

        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            total += doubleArray[i];
        }
        System.out.println(total);


        String word = "eyE";
        String[] wordArray = word.split("");
        String reverse = "";
        boolean isPalindrome = true;

        for (int i = 1; i <= wordArray.length; i++) {
            reverse = reverse + wordArray[wordArray.length - i];
            if (word.equalsIgnoreCase(reverse)) {
                System.out.println(isPalindrome);
            }
        }


        int num = 75;
        boolean isPrime = true;

        for (int l = 2; l <= num / 2; l++) {
            if (num % l == 0) {
                isPrime = false;
                System.out.println(isPrime);
                break;
            } else {
                System.out.println(isPrime);
            }
        }


        }
    }












