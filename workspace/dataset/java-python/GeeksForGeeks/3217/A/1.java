

// Java program to find maximum 
// possible value K such that  
// array has at-least K elements  
// that are greater than or equals to K. 
import java.io.*; 
  
class GFG  
{ 
  
// Function to return maximum  
// possible value K such that  
// array has atleast K elements  
// that are greater than or equals to K 
static int findMaximumNum(int arr[],  
                          int n) 
{ 
    // output can contain any  
    // number from n to 0 where 
    // n is length of the array 
  
    // We start a loop from n  
    // as we need to find 
    // maximum possible value 
    for (int i = n; i >= 1; i--) 
    { 
        // count contains total  
        // number of elements 
        // in input array that  
        // are more than equal to i 
        int count = 0; 
  
        // traverse the input  
        // array and find count 
        for (int j = 0; j < n; j++) 
            if (i <= arr[j]) 
                count++; 
  
        if (count >= i) 
        return i; 
    }  
    return 1; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
int arr[] = {1, 2, 3, 8, 10 }; 
int n = arr.length;  
System.out.println(findMaximumNum(arr, n)); 
} 
} 
  
// This code is contributed by aj_36 

