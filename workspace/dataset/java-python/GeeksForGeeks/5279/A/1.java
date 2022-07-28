

// Efficient Java program to find length of 
// the largest subsequence with GCD greater 
// than 1. 
import java.util.Arrays; 
  
class GFG { 
// Returns length of the largest subsequence 
// with GCD more than 1. 
static int largestGCDSubsequence(int arr[], int n) 
{ 
    int ans = 0; 
   
    // Finding the Maximum value in arr[] 
    int maxele = Arrays.stream(arr).max().getAsInt();; 
   
    // Iterate from 2 to maximum possible 
    // divisor of all give values 
    for (int i=2; i<=maxele; ++i) 
    { 
        int count = 0; 
        for (int j=0; j<n; ++j) 
        { 
            // If we found divisor, 
            // increment count 
            if (arr[j]%i == 0) 
                ++count; 
        } 
        ans = Math.max(ans, count); 
    } 
   
    return ans; 
} 
// Driver program to test above 
  
    public static void main(String[] args) { 
  
        int arr[] = {3, 6, 2, 5, 4}; 
        int size = arr.length; 
  
        System.out.println(largestGCDSubsequence(arr, size)); 
    } 
} 
  
//this code contributed by Rajput-Ji 

