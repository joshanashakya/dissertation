

// JAVA Code to find Minimum element whose 
// n-th power is greater than product of 
// an array of size n 
import java.util.*; 
  
class GFG { 
      
    // function to find the minimum element 
    static int findMin(int a[], int n) 
    { 
        // loop to traverse and store the  
        // sum of log 
        double sum = 0; 
        for (int i = 0; i < n; i++) 
              
            // computes sum 
            sum += Math.log(a[i]);  
       
        // calculates the elements  
        // according to formula. 
        int x = (int)Math.exp(sum / n); 
       
        // returns the minimal element 
        return x + 1; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        // initialised array 
        int a[] = { 3, 2, 1, 4 }; 
       
        // computes the size of array 
        int n = a.length; 
       
        // prints out the minimal element 
        System.out.println(findMin(a, n)); 
          
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal.     

