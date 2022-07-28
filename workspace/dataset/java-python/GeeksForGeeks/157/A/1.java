

// Java program to find largest number 
// divisible by 90 that can be made 
// using 0 and 5 
  
import java.io.*; 
  
class GFG { 
  
// Function to find largest number 
// divisible by 90 that can be made 
// using 0 and 5 
static void printLargestDivisible(int n, int a[]) 
{ 
    // Count of 0s and 5s 
    int i, c0 = 0, c5 = 0; 
    for (i = 0; i < n; i++) { 
        if (a[i] == 0) 
            c0++; 
        else
            c5++; 
    } 
  
    // The number of 5s that can be used 
    c5 = (int)Math.floor(c5 / 9) * 9; 
    if (c0 == 0) // The number can't be 
        System.out.print(-1); // made multiple of 10 
    else if (c5 == 0) // The only multiple of 90 
        System.out.println(0); // that can be made is 0 
    else { 
        for (i = 0; i < c5; i++) 
            System.out.print(5); 
        for (i = 0; i < c0; i++) 
            System.out.print(0); 
    } 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
        int a[] = { 5, 5, 5, 5, 5, 5, 5, 5, 0, 5, 5 }; 
  
    int n = a.length; 
  
    printLargestDivisible(n, a); 
    } 
} 
// This code is contributed 
// by shs 

