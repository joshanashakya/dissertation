

// Java program to find the sum of the elements 
// from an array which have even parity 
  
import java.io.*; 
  
class GFG { 
  
// Function that returns true if x has even parity 
static boolean checkEvenParity(int x) 
{ 
    // We basically count set bits  
    // https://www.geeksforgeeks.org/count-set-bits-in-an-integer/ 
    int parity = 0; 
    while (x != 0) { 
        x = x & (x - 1); 
        parity++; 
    } 
  
    if (parity % 2 == 0) 
        return true; 
    else
        return false; 
} 
  
// Function to return the sum of the elements 
// from an array which have even parity 
static long sumlist(int a[], int n) 
{ 
    long sum = 0; 
  
    for (int i = 0; i < n; i++) { 
  
        // If a[i] has even parity 
        if (checkEvenParity(a[i])) 
            sum += a[i]; 
    } 
    return sum; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int arr[] = { 2, 4, 3, 5, 9 }; 
  
    int n =arr.length; 
  
    System.out.println(sumlist(arr, n)); 
    } 
} 
// This code is contributed by  inder_verma.. 

