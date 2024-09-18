
import java.util.Arrays;

public class LeetCode14LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));

    }

    public static String longestCommonPrefix(String[] strs){

        Arrays.sort(strs);

        String str1 = strs[0];

        String str2 = strs[strs.length - 1];

        int i = 0;

        while ( i < str1.length() - 1 ) {

            if ( str1.charAt(i) == str2.charAt(i) ) {

                i++;

            } else {

                break;

            }

        }

        return i == 0 ? "" : str1.substring(0, i);

    }
    
}
