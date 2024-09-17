
import java.util.HashMap;
import java.util.Map;

public class LeetCode13RomanToInteger{

    public static void main(String[] args) {

        String str = "X";

        System.out.println(romanToInteger(str));

    }

    public static int romanToInteger(String str) {

        // String str = III;

        Map<Character, Integer> mapTable = new HashMap<>();

        mapTable.put('I', 1);
        mapTable.put('V', 5);
        mapTable.put('X', 10);
        mapTable.put('L', 50);
        mapTable.put('C', 100);
        mapTable.put('D', 500);
        mapTable.put('M', 1000);

        int result = mapTable.get(str.charAt(str.length() - 1));

        for ( int i = str.length() - 2; i >= 0; i-- ) {

            if ( mapTable.get(str.charAt(i)) < mapTable.get(str.charAt(i + 1))){

                result = result - mapTable.get(str.charAt(i));

            } else {

                result = result + mapTable.get(str.charAt(i));

            }

        }

        return result;

    } 

}