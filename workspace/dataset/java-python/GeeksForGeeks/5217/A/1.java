

// Java program to print a,  
// b and c such that a+b+c=N 
import java.io.*; 
  
class GFG 
{ 
  
// Function to print a, b and c 
static void printCombination(int n) 
{ 
    // first loop 
    for (int i = 1; i < n; i++)  
    { 
  
        // check for 1st number 
        if (i % 3 != 0)  
        { 
  
            // second loop 
            for (int j = 1; j < n; j++) 
            { 
  
                // check for 2nd number 
                if (j % 3 != 0)  
                { 
  
                    // third loop 
                    for (int k = 1; k < n; k++)  
                    { 
  
                        // Check for 3rd number 
                        if (k % 3 != 0 && (i + j + k) == n)  
                        { 
                            System.out.println( i + " " +  
                                                j + " " + k); 
                            return; 
                        } 
                    } 
                } 
            } 
        } 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 233; 
      
    printCombination(n); 
} 
} 
  
// This code is contributed  
// by anuj_67. 

