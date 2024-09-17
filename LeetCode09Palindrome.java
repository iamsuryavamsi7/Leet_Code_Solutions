public class LeetCode09Palindrome {

    public static void main(String[] args){

        int num = 1;

        System.out.println(isPalindrome(num));

    }

    public static boolean isPalindrome(int num) {

        int temp = num;

        int reverseNumber = 0;

        if ( num < 0 )

            return false;

        if ( num >= 0 && num < 10)

            return true;

        while ( num > 0 ) {

            int lastDigit = num % 10;

            reverseNumber = (reverseNumber * 10) + lastDigit;

            num = num / 10;

        }

        if ( reverseNumber == temp )

            return true;

        return false;

    }

    // public static boolean palindrome(int num){

    //     int temp = num;
    //     int rev = 0;

    //     if ( num < 0 || num == 0 ) {

    //         return false;

    //     }

    //     while ( num > 0 ) {

    //         int digit = num % 10;
    //         rev = ( rev * 10 ) + digit;
    //         num = num / 10;

    //     }

    //     if ( rev == temp ) {

    //         return true;

    //     }

    //     return false;

    // }
    
}
