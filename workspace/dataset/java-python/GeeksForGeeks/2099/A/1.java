

// Simple Java program to count n digit  
// divisible numbers. 
import java.io.*; 
  
class GFG { 
      
    // Returns count of n digit numbers 
    // divisible by 'number' 
    static int numberofterm(int n, int number) 
    { 
        // compute the first and last term 
        int firstnum = (int)Math.pow(10, n - 1); 
        int lastnum = (int)Math.pow(10, n); 
      
        // count total number of which having 
        // n digit and divisible by number 
        int count = 0; 
        for (int i = firstnum; i < lastnum; i++)  
            if (i % number == 0) 
                count++;  
        return count; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3, num = 7; 
        System.out.println(numberofterm(n, num)); 
    } 
} 
  
// This code is contributed by Ajit. 

