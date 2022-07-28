

// Java Program to find number of integer  
// such that integer - digSum > s 
import java.io.*; 
  
class GFG 
{ 
    // function for digit sum 
    static int digitSum(long n)  
    { 
        int digSum = 0; 
        while (n > 0)  
        { 
            digSum += n % 10; 
            n /= 10; 
        } 
        return digSum; 
    } 
  
    // function to calculate count of integer s.t. 
    // integer - digSum > s 
    public static long countInteger(long n, long s)  
    { 
        // if n < s no integer possible 
        if (n < s) 
            return 0; 
      
        // iterate for s range and then calculate  
        // total count of such integer if starting  
        // integer is found 
        for (long i = s; i <= Math.min(n, s + 163); i++) 
            if ((i - digitSum(i)) > s) 
                return (n - i + 1); 
      
        // if no integer found return 0 
        return 0; 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
            long n = 1000, s = 100; 
            System.out.println(countInteger(n, s)); 
    } 
} 
  
// This code is contributed by Anshika Goyal. 

