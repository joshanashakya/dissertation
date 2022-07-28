

// Java program to find the 
// largest non perfect  
// square number among n numbers 
  
import java.io.*; 
   
class GfG{ 
       
static Boolean check(int n) 
{ 
    // takes the sqrt of the number 
    int d = (int)Math.sqrt(n); 
   
    // checks if it is a perfect square number 
    if (d * d == n) 
        return true; 
   
    return false; 
} 
   
// fucntion to find the largest 
// non perfect square number 
static int largestNonPerfectSquareNumber(int a[], int n) 
{ 
    // stores the maximum of all 
    // non perfect square numbers 
    int maxi = -1; 
   
    // traverse for all elements in the array 
    for (int i = 0; i < n; i++) { 
   
        // store the maximum if 
        // not a perfect square 
        if (!check(a[i])) 
            maxi = Math.max(a[i], maxi); 
    } 
    return maxi; 
} 
  
    public static void main (String[] args) { 
  
        int a[] = { 16, 20, 25, 2, 3, 10 }; 
        int n = a.length; 
  
        // function call 
        System.out.println(largestNonPerfectSquareNumber(a, n)); 
    } 
} 
  
// This code is contributed by Gitanjali. 

