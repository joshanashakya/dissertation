

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return an ArrayList containing 
    // all the perfect cubes upto n 
    static List<Integer> getPerfectcubes(int n) { 
  
        List<Integer> perfectcubes = new ArrayList<Integer>(); 
        int current = 1; 
        int i = 1; 
  
        // while current perfect cube is 
        // less than or equal to n 
        while (current <= n) { 
            perfectcubes.add(current); 
            i += 1; 
            current = (int) (Math.pow(i, 3)); 
        } 
        return perfectcubes; 
    } 
  
    // Function to print the sum of maximum 
    // two elements from the array 
    static int maxPairSum(int[] arr) { 
  
        int n = arr.length; 
        int max = 0; 
        int secondMax = 0; 
        if (arr[0] > arr[1]) { 
            max = arr[0]; 
            secondMax = arr[1]; 
        } else { 
            max = arr[1]; 
            secondMax = arr[0]; 
        } 
        for (int i = 2; i < n; i++) { 
            if (arr[i] > max) { 
                secondMax = max; 
                max = arr[i]; 
            } else if (arr[i] > secondMax) { 
                secondMax = arr[i]; 
            } 
        } 
        return (max + secondMax); 
    } 
  
    // Function to return the count of numbers that 
    // when added with n give a perfect cube 
    static int countPairsWith(int n, List<Integer>  
            perfectcubes, List<Integer> nums) { 
  
        int count = 0; 
        for (int i = 0; i < perfectcubes.size(); i++) { 
            int temp = perfectcubes.get(i) - n; 
  
            // temp > n is checked so that pairs 
            // (x, y) and (y, x) don't get counted twice 
            if (temp > n && (nums.contains(temp))) 
                count += 1; 
        } 
        return count; 
    } 
  
    // Function to count the pairs whose 
    // sum is a perfect cube 
    static int countPairs(int[] arr) { 
  
        int n = arr.length; 
  
        // Sum of the maximum two elements 
        // from the array 
        int max = maxPairSum(arr); 
  
        // List of perfect cubes upto max 
        List<Integer> perfectcubes = getPerfectcubes(max); 
  
        // Contains all the array elements 
        List<Integer> nums = new ArrayList<Integer>(); 
        for (int i = 0; i < n; i++) { 
            nums.add(arr[i]); 
        } 
        int count = 0; 
        for (int i = 0; i < n; i++) { 
  
            // Add count of the elements that when 
            // added with arr[i] give a perfect cube 
            count += countPairsWith(arr[i], perfectcubes, nums); 
        } 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] agrs) { 
        int[] arr = { 2, 6, 18, 9, 999, 1 }; 
        System.out.print(countPairs(arr)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

