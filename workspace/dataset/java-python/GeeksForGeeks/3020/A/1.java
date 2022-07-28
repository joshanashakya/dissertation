

import java.io.*; 
  
class GFG { 
  
    // function to find double factorial 
    // of given number 
    static long doublefactorial(long n) 
    { 
        if (n == 0 || n==1) 
            return 1; 
              
        return n * doublefactorial(n - 2); 
    } 
  
    // Driver code 
    static public void main (String[] args) 
    { 
        System.out.println("Double factorial"
            + " is " + doublefactorial(5)); 
    } 
} 
  
// This code is contributed by anuj_67. 

