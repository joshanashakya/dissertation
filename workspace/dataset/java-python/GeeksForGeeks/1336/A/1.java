

// Efficient Java program to count all 
// pairs with GCD and LCM. 
public class GCD 
{ 
    // A function to find number of distinct 
    // prime factors of a given number n 
    static int totalPrimeFactors(int n) 
    { 
        // To keep track of count 
        int count = 0; 
          
        // 2s that divide n 
        if ((n%2 == 0)) 
        { 
            count++; 
            while ((n%2 == 0)) 
               n /= 2; 
        } 
        // n must be odd at this point. So we can skip 
        // one element (Note i = i +2) 
        for (int i = 3; i*i <= n; i = i+2) 
        { 
            // i divides n 
            if ((n%i == 0)) 
                count++; 
                while ((n%i == 0)) 
                    n /= 2; 
        } 
        // This condition is to handle the case when n 
        // is a prime number greater than 2 
        if (n > 2) 
            count++; 
         
       return count;  
    } 
    // Java function to count number 
    // of pair with given GCD and LCM 
    static int countPairs(int G, int L) 
    { 
        if (L % G != 0) 
            return 0; 
          
        int div = L/G; 
          
        // answer is 2^totalPrimeFactors(L/G) 
        return (1 << totalPrimeFactors(div)); 
    } 
      
    // Driver function 
    public static void main (String[] args) 
    { 
        int G = 2, L = 12; 
        System.out.print("Total possible pair with GCD " + G); 
        System.out.print(" & LCM " + L); 
        System.out.print(" = " + countPairs(G, L)); 
    } 
} 
  
// This code is contributed by Saket Kumar 

