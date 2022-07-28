

// Java implementation to find sum of all 
// proper divisor of numbers up to N 
   
// Utility function to find sum of 
// all proper divisor of number up to N 
  
class GFG 
{ 
    static int properDivisorSum(int n) 
    { 
        int sum = 0; 
        int i; 
        // Loop to find the proper 
        // divisor of every number 
        // from 1 to N 
        for (i = 1; i <= n; ++i) 
            sum += (n / i) * i; 
       
        return sum - n * (n + 1) / 2; 
    } 
       
    // Driver Code 
    public static void main(String []args) 
    { 
        int n = 4; 
        System.out.println(properDivisorSum(n)); 
       
        n = 5; 
        System.out.println(properDivisorSum(n)); 
          
    } 
} 

