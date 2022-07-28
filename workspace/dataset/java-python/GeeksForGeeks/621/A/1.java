

// Java program to find sum  
// of bitwise ors of all subarrays. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
static int totalSum(int a[], int n) 
{ 
    int i, sum = 0, sum1 = 0, j; 
  
    for (i = 0; i < n; i++)  
    { 
        sum1 = 0; 
  
        // perform Bitwise OR operation 
        // on all the subarray present  
        // in array 
        for (j = i; j < n; j++)  
        { 
  
            // OR operation 
            sum1 = (sum1 | a[j]); 
  
            // now add the sum after  
            // performing the Bitwise 
            // OR operation 
            sum = sum + sum1; 
        } 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int a[] = { 1, 2, 3, 4, 5 }; 
    int n = a.length; 
    System.out.println(totalSum(a,n)); 
} 
} 
  
// This code is contributed  
// by Subhadeep 

