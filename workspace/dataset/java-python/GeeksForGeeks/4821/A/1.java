

// Efficient Java program to find sum of cubes 
// of first n natural numbers that avoids 
// overflow if result is going to be withing 
// limits. 
import java.util.*; 
import java.lang.*; 
class GFG { 
    /* Returns the sum of series */
    public static int sumOfSeries(int n) 
    { 
        int x; 
        if (n % 2 == 0) 
            x = (n / 2) * (n + 1); 
        else
            x = ((n + 1) / 2) * n; 
        return x * x; 
    } 
  
    // Driver Function 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.println(sumOfSeries(n)); 
    } 
} 
// Code Contributed by Mohit Gupta_OMG <(0_o)> 

