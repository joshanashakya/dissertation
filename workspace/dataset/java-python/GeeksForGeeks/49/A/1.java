

// Java program to find sum of divisors of all  
// the divisors of a natural number.  
import java.util.HashMap; 
  
class GFG  
{ 
  
    // Returns sum of divisors of all the divisors 
    // of n 
    public static int sumDivisorsOfDivisors(int n) 
    { 
  
        // Calculating powers of prime factors and 
        // storing them in a map mp[]. 
        HashMap<Integer, Integer> mp = new HashMap<>(); 
        for (int j = 2; j <= Math.sqrt(n); j++)  
        { 
            int count = 0; 
            while (n % j == 0)  
            { 
                n /= j; 
                count++; 
            } 
            if (count != 0) 
                mp.put(j, count); 
        } 
  
        // If n is a prime number 
        if (n != 1) 
            mp.put(n, 1); 
  
        // For each prime factor, calculating (p^(a+1)-1)/(p-1) 
        // and adding it to answer. 
        int ans = 1; 
  
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet())  
        { 
            int pw = 1; 
            int sum = 0; 
            for (int i = entry.getValue() + 1; i >= 1; i--) 
            { 
                sum += (i * pw); 
                pw = entry.getKey(); 
            } 
            ans *= sum; 
        } 
  
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 10; 
        System.out.println(sumDivisorsOfDivisors(n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

