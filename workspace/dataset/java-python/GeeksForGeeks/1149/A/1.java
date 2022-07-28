

// Java program to check if it is possible to 
// choose a subarray that contains exactly 
// K even integers 
import java.util.*; 
   
class GFG{ 
// Function to check if it is possible to 
// choose a subarray that contains exactly 
// K even integers 
static void isPossible(int []A, int n, int k) 
{ 
    // Variable to store the count of 
    // even numbers 
    int countOfTwo = 0; 
    for (int i = 0; i < n; i++) { 
        if (A[i] % 2 == 0) { 
            countOfTwo++; 
        } 
    } 
  
    // If we have to select 0 even numbers 
    // but there is all odd numbers in the array 
    if (k == 0 && countOfTwo == n) 
        System.out.print("NO"); 
  
    // If the count of even numbers is greater than 
    // or equal to K then we can select a 
    // subarray with exactly K even integers 
    else if (countOfTwo >= k) { 
        System.out.print("YES"); 
    } 
  
    // If the count of even numbers is less than K 
    // then we cannot select any subarray with 
    // exactly K even integers 
    else
        System.out.print("No"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int []arr = { 1, 2, 4, 5 }; 
    int K = 2; 
    int n = arr.length; 
  
    isPossible(arr, n, K); 
} 
} 
  
// This code is contributed by shivanisinghss2110 

