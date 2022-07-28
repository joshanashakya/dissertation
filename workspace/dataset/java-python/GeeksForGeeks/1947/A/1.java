

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    static Vector<Integer> c = new Vector<>(); 
  
    // To store the final ans 
    static int ans = 0; 
  
    // Function to sum of all subsets of a 
    // given array 
    static void subsetSum(int i, int curr)  
    { 
  
        // Base case 
        if (i == c.size())  
        { 
            ans += curr; 
            return; 
        } 
  
        // Recursively calling subsetSum 
        subsetSum(i + 1, curr + c.elementAt(i)); 
        subsetSum(i + 1, curr); 
    } 
  
    // Function to generate the subsets 
    static void subsetGen(int[] arr, int i, int n) 
    { 
  
        // Base-case 
        if (i == n)  
        { 
  
            // Finding the sum of all the subsets 
            // of the generated subset 
            subsetSum(0, 0); 
            return; 
        } 
  
        // Recursively accepting and rejecting 
        // the current number 
        subsetGen(arr, i + 1, n); 
        c.add(arr[i]); 
        subsetGen(arr, i + 1, n); 
        c.remove(c.size() - 1); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] arr = { 1, 1 }; 
        int n = arr.length; 
  
        subsetGen(arr, 0, n); 
        System.out.println(ans); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

