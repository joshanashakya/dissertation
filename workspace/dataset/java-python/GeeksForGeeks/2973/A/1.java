

// Maximum possible sum of array after repeated 
// subtraction operation. 
  
import java.io.*; 
  
class GFG { 
  
    static int GCD(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return GCD(b, a % b); 
    } 
      
    static int findMaxSumUtil(int arr[], int n) 
    { 
        int finalGCD = arr[0]; 
        for (int i = 1; i < n; i++) 
            finalGCD = GCD(arr[i], finalGCD); 
      
        return finalGCD; 
    } 
      
    // This function basically calls  
    // findMaxSumUtil() to find GCD of all  
    // array elements, then it returns 
    // GCD * (Size of array) 
    static int findMaxSum(int arr[], int n) 
    { 
        int maxElement = findMaxSumUtil(arr, n); 
        return (maxElement * n); 
    } 
  
    // Driver code 
    public static void main (String[] args) { 
          
        int arr[] = {8, 20, 12, 36}; 
        int n = arr.length; 
          
        System.out.println(findMaxSum(arr, n)); 
    } 
} 
  
//This code is contributed by vt_m. 

