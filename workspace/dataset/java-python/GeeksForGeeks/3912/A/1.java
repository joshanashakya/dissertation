

import java.io.*; 
  
class GFG 
{ 
      
// Function to print 
// all the combinations 
static void printCombinations(int a[],  
                              int n, int m) 
{ 
  
    // Iterate for all 
    // combinations 
    for (int i = 0;  
             i < (1 << n); i++)  
    { 
        int sum = 0; 
  
        // Initially 100 in binary  
        // if n is 3 as  
        // 1<<(3-1) = 100 in binary 
        int num = 1 << (n - 1); 
  
        // Iterate in the array  
        // and assign signs to 
        // the array elements 
        for (int j = 0; j < n; j++) 
        { 
  
            // If the j-th bit  
            // from left is set 
            // take '+' sign 
            if ((i & num) > 0) 
                sum += a[j]; 
            else
                sum += (-1 * a[j]); 
  
            // Right shift to check if 
            // jth bit is set or not 
            num = num >> 1; 
        } 
  
        if (sum % m == 0)  
        { 
  
            // re-initialize 
            num = 1 << (n - 1); 
  
            // Iterate in the  
            // array elements 
            for (int j = 0; j < n; j++)  
            { 
  
                // If the jth from 
                // left is set 
                if ((i & num) > 0) 
                    System.out.print("+" +  
                                     a[j] + " "); 
                else
                    System.out.print("-" +  
                                     a[j] + " "); 
  
                // right shift 
                num = num >> 1; 
            } 
              
        System.out.println(); 
        } 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int a[] = { 3, 5, 6, 8 }; 
    int n = a.length; 
    int m = 5; 
  
    printCombinations(a, n, m); 
} 
} 
  
// This code is contributed 
// by inder_verma. 

