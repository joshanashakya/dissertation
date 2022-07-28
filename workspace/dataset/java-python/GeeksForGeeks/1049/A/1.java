

// Java program to find maximum sum  
// of odd subsequence if it exists. 
import java.io.*; 
  
class GFG { 
      
// Returns maximum sum odd subsequence, 
// if exists Else returns -1 
static int findMaxOddSubarraySum(int arr[], int n) 
{ 
    // Here min_odd is the minimum odd number  
    // (in absolute terms). Initializing with  
    // max value of int . 
    int min_odd = Integer.MAX_VALUE; 
  
    // To check if there is al-least 
    // one odd number. 
    boolean isOdd = false; 
      
    // To store sum of all positive elements 
    int sum = 0;  
    for (int i = 0 ; i < n ; i++) 
    { 
        // Adding positive number would 
        // increase the sum. 
        if (arr[i] > 0) 
            sum = sum + arr[i]; 
  
        // To find the minimum odd number 
        // (absolute) in the array. 
        if (arr[i] % 2 != 0) 
        { 
            isOdd = true; 
            if (min_odd > Math.abs(arr[i])) 
                min_odd = Math.abs(arr[i]); 
        } 
    } 
  
    // If there was no odd number 
    if (isOdd == false) 
    return -1; 
  
    // Now, sum will be either odd or even. 
    // If even, changing it to odd.  
    // As, even - odd = odd. 
    // since m is the minimum odd 
    // number(absolute). 
    if (sum % 2 == 0) 
        sum = sum - min_odd; 
  
    return sum; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr[] = {2, -3, 5, -1, 4}; 
    int n = arr.length; 
    System.out.println(findMaxOddSubarraySum(arr, n)); 
          
} 
} 
  
// This code is contributed by vt_m 

