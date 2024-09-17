
// import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String[] args) {

        // int[] nums = {1, 2, 3, 4};

        // int target = 5;

        // int num = 121;

        System.out.println();

    }

    public static int[] toSum(int[] nums, int target){

        Map<Integer, Integer> hashMap = new HashMap<>();        

        for ( int i = 0; i < nums.length; i++ ) {

            int subtractedValue = target - nums[i];

            if ( hashMap.containsKey(subtractedValue) ) 

                return new int[] {i, hashMap.get(subtractedValue) };

            hashMap.put(nums[i], i);

        }

        return new int[] {-1, -1};

    }

    public static boolean palindrome(int num){

        int originalNumber = num;

        int rev = 0;

        if ( num < 0 )

            return true;
        
        if ( num >= 0 && num < 10 )

            return true;

        while ( num > 0 ) {

            int lastDigit = num % 10;

            rev = rev * 10 + lastDigit;
            
            num = num / 10;

        }

        return rev == originalNumber;

    }

    public static int romanToInteger(String str){

        Map<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int result = hashMap.get(str.charAt(str.length() - 1));

        for ( int i = str.length() - 2; i >= 0; i-- ) {

            if ( hashMap.get(str.charAt((i))) < hashMap.get(str.charAt(i + 1)) ) {

                result -= hashMap.get(str.charAt(i));

            } else {

                result += hashMap.get(str.charAt(i));

            }

        }

        return result;

    }

    public static String longestCommonPrefix(String[] str){

        Arrays.sort(str);

        String str1 = str[0];
        String str2 = str[str.length - 1];

        int i = 0;

        while (i < str1.length()) {

            if ( str1.charAt(i) == str2.charAt(i) ) {

                i++;

            }

        }

        return i == 0?"":str1.substring(0, i);

    }

}