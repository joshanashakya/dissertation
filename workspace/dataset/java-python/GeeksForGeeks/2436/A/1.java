

// Simple Java program to sum of n digit 
// divisible numbers. 
import java.io.*; 
  
class GFG { 
      
    // Returns sum of n digit numbers 
    // divisible by 'number' 
    static int totalSumDivisibleByNum(int n, int number) 
    { 
        // compute the first and last term 
        int firstnum = (int)Math.pow(10, n - 1); 
        int lastnum = (int)Math.pow(10, n); 
          
        // sum of number which having 
        // n digit and divisible by number 
        int sum = 0; 
        for (int i = firstnum; i < lastnum; i++) 
            if (i % number == 0) 
                sum += i; 
        return sum; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3, num = 7; 
        System.out.println(totalSumDivisibleByNum(n, num)); 
    } 
} 
  
// This code is contributed by Ajit. 

