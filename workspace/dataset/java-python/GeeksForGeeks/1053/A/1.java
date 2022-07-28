

// Java program to find 
// subsequence of size 
// k with maximum possible GCD 
import java .io.*; 
import java .util.*; 
  
class GFG 
{ 
  
// function to find GCD of  
// sub sequence of size k 
// with max GCD in the array 
static int findMaxGCD(int []arr, 
                      int n, int k) 
{ 
    Arrays.sort(arr); 
      
    // Computing highest element 
    int high = arr[n - 1]; 
  
    // Array to store the  
    // count of divisors 
    // i.e. Potential GCDs 
    int []divisors = new int[high + 1]; 
  
    // Iterating over  
    // every element 
    for (int i = 0; i < n; i++) 
    { 
  
        // Calculating all the divisors 
        for (int j = 1;              
                 j <= Math.sqrt(arr[i]);  
                 j++) 
        { 
  
            // Divisor found 
            if (arr[i] % j == 0)  
            { 
  
                // Incrementing count 
                // for divisor 
                divisors[j]++; 
  
                // Element/divisor is  
                // also a divisor Checking 
                // if both divisors are 
                // not same 
                if (j != arr[i] / j) 
                    divisors[arr[i] / j]++; 
            } 
        } 
    } 
  
    // Checking the highest 
    // potential GCD 
    for (int i = high; i >= 1; i--) 
  
        // If this divisor can divide  
        // at least k numbers, it is  
        // a GCD of at least one sub  
        // sequence of size k 
        if (divisors[i] >= k) 
            return i; 
            return 0 ; 
} 
  
// Driver code 
static public void main (String[] args) 
{ 
    // Array in which sub sequence  
    // with size k with max GCD is  
    // to be found 
    int []arr = { 1, 2, 4,  
                  8, 8, 12 }; 
    int k = 3; 
  
    int n = arr.length; 
    System.out.println(findMaxGCD(arr, n, k)); 
} 
} 
  
// This code is contributed  
// by anuj_67. 

