

// Efficient Java program to find the sum 
// divisible numbers. 
import java.io.*; 
  
class GFG { 
      
    // find the Sum of having n digit and 
    // divisible by the number 
    static int totalSumDivisibleByNum(int digit,  
                                      int number) 
    { 
        // compute the first and last term 
        int firstnum = (int)Math.pow(10, digit - 1); 
        int lastnum = (int)Math.pow(10, digit); 
      
        // first number which is divisible 
        // by given number 
        firstnum = (firstnum - firstnum % number) 
                   + number; 
      
        // last number which is divisible 
        // by given number 
        lastnum = (lastnum - lastnum % number); 
      
        // total divisible number 
        int count = ((lastnum - firstnum) / 
                                number + 1); 
      
        // return the total sum 
        return ((lastnum + firstnum) * count) / 2; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3, number = 7; 
        System.out.println(totalSumDivisibleByNum(n, number)); 
    } 
} 
  
// This code is contributed by Ajit. 

