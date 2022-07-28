

// Java Program to find the  
// smallest number that divides 
// all numbers in an array 
import java.io.*; 
  
class GFG { 
  
    // function to find the smallest element 
    static int min_element(int a[]) 
    { 
        int min = Integer.MAX_VALUE, i; 
        for (i = 0; i < a.length; i++)  
        { 
            if (a[i] < min) 
                min = a[i]; 
        } 
          
        return min; 
    } 
      
    // function to find smallest num 
    static int findSmallest(int a[], int n)  
    { 
        // Find the smallest element 
        int smallest = min_element(a); 
      
        // Check if all array elements 
        // are divisible by smallest. 
        for (int i = 1; i < n; i++) 
        if (a[i] % smallest >= 1) 
            return -1; 
      
        return smallest; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int a[] = {25, 20, 5, 10, 100}; 
        int n = a.length; 
        System.out.println(findSmallest(a, n)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

