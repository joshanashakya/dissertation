

// Java program to count triplets  
// with sum that lies in given  
// range [a, b]. 
import java.util.*; 
  
class GFG 
{ 
// Function to find count of  
// triplets having sum less 
// than or equal to val. 
public static int countTripletsLessThan(int []arr,  
                                        int n, int val) 
{ 
    // sort the input array. 
    Arrays.sort(arr); 
  
    // Initialize result 
    int ans = 0; 
  
    int j, k; 
  
    // to store sum 
    int sum; 
  
    // Fix the first element 
    for (int i = 0; i < n - 2; i++) 
    { 
  
        // Initialize other two elements  
        // as corner elements of subarray 
        // arr[j+1..k] 
        j = i + 1; 
        k = n - 1; 
  
        // Use Meet in the 
        // Middle concept. 
        while (j != k)  
        { 
            sum = arr[i] + arr[j] + arr[k]; 
  
            // If sum of current triplet 
            // is greater, then to reduce it 
            // decrease k. 
            if (sum > val) 
                k--; 
  
            // If sum is less than or  
            // equal to given value,  
            // then add possible  
            // triplets (k-j) to result. 
            else
            { 
                ans += (k - j); 
                j++; 
            } 
        } 
    } 
  
    return ans; 
} 
  
    // Function to return count  
    // of triplets having sum  
    // in range [a, b]. 
    public static int countTriplets(int arr[], int n,  
                                    int a, int b) 
    { 
      
        // to store count 
        // of triplets. 
        int res; 
      
        // Find count of triplets  
        // having sum less than or  
        // equal to b and subtract  
        // count of triplets having 
        // sum less than or equal  
        // to a-1. 
        res = countTripletsLessThan(arr, n, b) -  
            countTripletsLessThan(arr, n, a - 1); 
      
        return res; 
    } 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[] arr = {2, 7, 5, 3,  
                8, 4, 1, 9}; 
    int n = arr.length; 
    int a = 8, b = 16; 
    System.out.println("" + countTriplets(arr, n,  
                                        a, b)); 
} 
} 
  
// This code is contributed  
// by Harshit Saini  

