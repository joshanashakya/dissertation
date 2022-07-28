

// Java program to Count unordered pairs (i, j) 
// in array such that product of a[i] and a[j] 
// can be expressed as power of two 
  
import java.io.*; 
  
class GFG { 
  
  
/* Function to check if x is power of 2*/
static boolean isPowerOfTwo(int x)  
{  
/* First x in the below expression is 
    for the case when x is 0 */
return (x >0&& (!((x&(x-1))>0)));  
}  
  
// Function to Count unordered pairs 
static void Count_pairs(int a[], int n) 
{ 
    int count = 0; 
  
    for (int i = 0; i < n; i++) { 
  
        // is a number can be expressed 
        // as power of two 
        if (isPowerOfTwo(a[i])) 
            count++; 
    } 
  
    // count total number 
    // of unordered pairs 
    int ans = (count * (count - 1)) / 2; 
  
    System.out.println( ans); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int a[] = { 2, 5, 8, 16, 128 }; 
  
    int n = a.length; 
    Count_pairs(a, n); 
  
    } 
} 
  
// This code is contributed 
// by shs 

