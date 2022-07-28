

// Java program to find the largest, good 
// number in the divisors of given number N. 
  
import java.util.*; 
  
class GFG { 
    // function to return distinct prime factors 
  
    static Vector<Integer> PrimeFactors(int n) 
    { 
  
        // to store distinct prime factors 
        Vector<Integer> v = new Vector<Integer>(); 
        int x = n; 
  
        // run a loop upto sqrt(n) 
        for (int i = 2; i * i <= n; i++) { 
            if (x % i == 0) { 
  
                // place this prime factor in vector 
                v.add(i); 
                while (x % i == 0) 
                    x /= i; 
            } 
        } 
  
        // This condition is to handle the case when n 
        // is a prime number greater than 1 
        if (x > 1) 
            v.add(x); 
  
        return v; 
    } 
  
    // function that returns good number 
    static int GoodNumber(int n) 
    { 
        // distinct prime factors 
        Vector<Integer> v = new Vector<Integer>(PrimeFactors(n)); 
  
        // to store answer 
        int ans = 1; 
  
        // product of all distinct prime 
        // factors is required answer 
        for (int i = 0; i < v.size(); i++) 
            ans *= v.get(i); 
  
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 12; 
  
        // function call 
        System.out.println(GoodNumber(n)); 
    } 
} 
  
// This code is contributed by ihritik 

