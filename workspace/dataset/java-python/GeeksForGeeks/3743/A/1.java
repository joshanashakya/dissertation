

// Java program to print 
// Number of odd/even  
// results for every value 
// of x in range [min, end] 
// after performing N steps 
import java.io.*; 
  
class GFG  
{ 
  
// Function that prints  
// the number of odd and  
// even results 
static void count_even_odd(int min, 
                           int max, 
                           int steps[][]) 
{ 
    int a, b, even, odd; 
  
    // If constant at layer i  
    // is even, beven is true, 
    // otherwise false. If the 
    // coefficient of x at layer 
    // i is even, aeven is true, 
    // otherwise false. 
    boolean beven = true,  
            aeven = false; 
    int n = 2; 
    for (int i = 0; i < n; i++) 
    { 
  
        a = steps[i][0]; 
        b = steps[i][1]; 
  
        // If any of the coefficients  
        // at any layer is found to be 
        // even, then the product of 
        // all the coefficients will  
        // always be even. 
        if (!(aeven || (a & 1) > 0)) 
            aeven = true; 
  
        // Checking whether the  
        // constant added after all 
        // layers is even or odd. 
        if (beven)  
        { 
            if ((b & 1) > 0) 
                beven = false; 
        } 
        else if (!((a & 1) > 0))  
        { 
            if (!((b & 1) > 0)) 
                beven = true; 
        } 
        else 
        { 
            if ((b & 1) > 0) 
                beven = true; 
        } 
    } 
  
    // Counting the number 
    // of even and odd. 
  
    // Assuming input x is even. 
    if (beven)  
    { 
        even = (int)max / 2 -  
               (int)(min - 1) / 2; 
        odd = 0; 
    } 
    else 
    { 
        even = (int)max / 2 -  
               (int)(min - 1) / 2; 
        odd = 0; 
    } 
  
    // Assuming input x is odd. 
    if (!(beven ^ aeven)) 
        even += max - min + 1 -  
                (int)max / 2 +  
                (int)(min - 1) / 2; 
    else
        odd += max - min + 1 -  
               (int)max / 2 +  
               (int)(min - 1) / 2; 
  
    // Displaying the counts. 
    System.out.print("even = " + even +  
                     ", odd = " + odd); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int min = 1, max = 4; 
    int steps[][] = {{1, 2}, 
                     {3, 4}}; 
  
    count_even_odd(min, max, steps); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

