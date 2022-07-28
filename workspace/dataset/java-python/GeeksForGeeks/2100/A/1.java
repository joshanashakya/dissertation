

// Efficient Java program to count n digit  
// divisible numbers. 
import java.io.*; 
  
class GFG { 
      
    // find the number of term 
    static int numberofterm(int digit, int number) 
    { 
        // compute the first and last term 
        int firstnum = (int)Math.pow(10, digit - 1); 
        int lastnum = (int)Math.pow(10, digit); 
      
        // first number which is divisible by given number 
        firstnum = (firstnum - firstnum % number) + number; 
      
        // last number which is divisible by given number 
        lastnum = (lastnum - lastnum % number); 
      
        // Apply the formula here 
        return ((lastnum - firstnum) / number + 1); 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3; 
        int number = 7; 
        System.out.println(numberofterm(n, number)); 
    } 
} 
  
// This code is contributed by Ajit. 

