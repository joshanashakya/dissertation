

// Java implementation of the approach 
class GFG { 
  
    // Function that return true if n 
    // can be represented as the sum 
    // of powers of 2 without using 2^0 
    static boolean isSumOfPowersOfTwo(int n) 
    { 
        if (n % 2 == 1) 
            return false; 
        else
            return true; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        if (isSumOfPowersOfTwo(n)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 

