

// Java program to calculate minimum 
// product of a pair 
import java.util.*; 
  
class GFG { 
      
    // Function to calculate minimum product 
    // of pair 
    static int printMinimumProduct(int arr[], int n) 
    { 
        // Initialize first and second 
        // minimums. It is assumed that the 
        // array has at least two elements. 
        int first_min = Math.min(arr[0], arr[1]); 
        int second_min = Math.max(arr[0], arr[1]); 
       
        // Traverse remaining array and keep 
        // track of two minimum elements (Note 
        // that the two minimum elements may 
        // be same if minimum element appears 
        // more than once) 
        // more than once) 
        for (int i = 2; i < n; i++) 
        { 
           if (arr[i] < first_min) 
           { 
              second_min = first_min; 
              first_min = arr[i]; 
           } 
           else if (arr[i] < second_min) 
              second_min = arr[i]; 
        } 
       
        return first_min * second_min; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int a[] = { 11, 8 , 5 , 7 , 5 , 100 }; 
        int n = a.length; 
        System.out.print(printMinimumProduct(a,n)); 
       
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

