

// Java implementation to find the number  
// of Subsequences with Even and Odd Sum  
import java.util.*;  
import java.lang.*; 
  
class GFG  
{ 
    public static int[] countSum(int arr[], int n) 
    { 
        int result = 0;  
  
        // Arrays to store the count of even  
        // subsequences and odd subsequences  
        int[] countODD = new int[n + 1]; 
        int[] countEVEN = new int[n + 1]; 
          
        // Initialising countEVEN[0] and countODD[0] to 0  
        // since as there is no subsequence before the  
        // iteration with even or odd count.  
        countODD[0] = 0;  
        countEVEN[0] = 0;  
          
        // Find sum of all subsequences with even count  
        // and odd count storing them as we iterate.  
      
        // Here countEVEN[i] denotes count of  
        // even subsequences till i  
      
        // Here countODD[i] denotes count of  
        // odd subsequences till i  
        for (int i = 1; i <= n; i++)  
        {  
  
            // if the number is even  
            if (arr[i - 1] % 2 == 0) 
            {  
                countEVEN[i] = countEVEN[i - 1] +  
                               countEVEN[i - 1] + 1;  
      
                countODD[i] = countODD[i - 1] +  
                              countODD[i - 1];  
            }  
              
            // if the number is odd  
            else
            {  
                countEVEN[i] = countEVEN[i - 1] +  
                               countODD[i - 1];  
      
                countODD[i] = countODD[i - 1] +  
                              countEVEN[i - 1] + 1;  
            }  
        } 
          
        int[] ans = new int[2]; 
        ans[0] = countEVEN[n]; 
        ans[1] = countODD[n]; 
        return ans; 
    }  
  
    // Driver Code 
    public static void main (String[] args)  
    { 
        int[] arr = new int[]{ 1, 2, 2, 3 };  
        int n = 4; 
        int[] ans = countSum(arr, n); 
        System.out.println("EvenSum = " + ans[0]); 
        System.out.println("OddSum = " + ans[1]); 
    } 
} 
  
// This code is contributed by Shivam Sharma  

