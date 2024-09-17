
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class A{

    public final int[] indexNumber(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for ( int i = 0; i < nums.length; i++ ) {

            int compliment = target - nums[i];

            if ( map.containsKey(compliment) )
            
                return new int[] {i, map.get(compliment)};

            map.put(nums[i], i);

        }

        return new int[] {-1, -1};

    }

}

public class LeetCode02TwoSum{

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        int target = 9;               

        A obj1 = new A();
        
        int[] values = obj1.indexNumber(nums, target);    
        
        System.out.println(Arrays.toString(values));

        int[] nums2 = {3,2,4};

        int target2 = 6;       
        
        A obj2 = new A();
        
        int[] values2 = obj2.indexNumber(nums2, target2);    
        
        System.out.println(Arrays.toString(values2));

        int[] nums3 = {2, 7, 11, 15};

        int target3 = 9;   
        
        A obj3 = new A();
        
        int[] values3 = obj3.indexNumber(nums3, target3);    
        
        System.out.println(Arrays.toString(values3));

    }

}

// import java.util.Arrays;

// public class LeetCode02TwoSum {

//     public static void main(String[] args) {
        
//         int[] solution = twoSum(new int[]{2, 7, 11, 15}, 9);

//         System.out.println(Arrays.toString(solution));

//     }

//     public static int[] twoSum(int[] nums, int target) {
        
//         int i;
//         int j;

//         for ( i = 0; i < nums.length; i++ ) {

//             for ( j = 0; j < nums.length; j++ ) {

//                 if ( i == j )

//                     continue;

//                 if ( nums[i] + nums[j] == target ) {

//                     return new int[] {i, j};

//                 }

//             }

//         }

//         //No Elements sum is not equal to target

//         return new int[0];

//     }

// }

// // import java.util.Arrays;

// // class Solution {

// //  public static void main(String[] args) {
        
// //         int[] solution = twoSum(new int[]{2, 7, 11, 15}, 9);

// //         System.out.println(Arrays.toString(solution));

// //     }

// //     public static int[] twoSum(int[] nums, int target) {
        
// //         int i;
// //         int j;

// //         for ( i = 0; i < nums.length; i++ ) {

// //             for ( j = 1; j < nums.length; j++ ) {

// //                 if ( nums[i] + nums[j] == target ) {

// //                     return new int[] {i,j};

// //                 }

// //             }

// //         }

// //         //No Elements sum is not equal to target

// //         return new int[0];

// //     }

// // }

class TestFile{

    public void test(){

        int num1 = 121;

        String str = Integer.toString(num1);

    }

}
