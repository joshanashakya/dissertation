

// JAVA program to find such number in 
// the array that all array elements 
// are divisible by it 
import java.io.*; 
  
class GFG { 
  
    // Returns GCD of two numbers 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
    // Function to return the desired 
    // number if exists 
    static int findNumber(int arr[], int n) 
    { 
        // Find GCD of array 
        int ans = arr[0]; 
        for (int i = 0; i < n; i++) 
            ans = gcd(ans, arr[i]); 
  
        // Check if GCD is present in array 
        for (int i = 0; i < n; i++) 
            if (arr[i] == ans) 
                return ans; 
  
        return -1; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int arr[] = { 2, 2, 4 }; 
        int n = arr.length; 
        System.out.println(findNumber(arr, n)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari 

