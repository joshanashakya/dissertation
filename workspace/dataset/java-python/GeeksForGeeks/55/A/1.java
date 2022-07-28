

// JAVA implementation of Naive method 
// to count all divisors 
import java.io.*; 
import java.math.*; 
  
class GFG { 
  
    // function to count the divisors 
    static int countDivisors(int n) 
    { 
        int cnt = 0; 
        for (int i = 1; i <= Math.sqrt(n); i++) 
        { 
            if (n % i == 0) { 
                // If divisors are equal, 
                // count only one 
                if (n / i == i) 
                    cnt++; 
  
                else // Otherwise count both 
                    cnt = cnt + 2; 
            } 
        } 
        return cnt; 
    } 
  
    /* Driver program to test above function */
    public static void main(String args[]) 
    { 
        System.out.println("Total distinct "
                  + "divisors of 100 are : "  
                       + countDivisors(100)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

