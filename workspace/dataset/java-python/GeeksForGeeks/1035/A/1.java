

// Java implementation of above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
  
// Function to find primes 
static boolean isPrime(int n) 
{ 
    // Corner cases 
    if (n <= 1) 
        return false; 
    if (n <= 3) 
        return true; 
  
    // This is checked so that we can skip 
    // middle five numbers in below loop 
    if (n % 2 == 0 || n % 3 == 0) 
        return false; 
  
    for (int i = 5; i * i <= n; i = i + 6) 
        if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
  
    return true; 
} 
  
static Vector<Vector<Integer> > v = new Vector<Vector<Integer> >(); 
  
// Function to find factors 
static void factors(int N ) 
{ 
    for (int i = 2; i < N; i++) 
    { 
  
        // run a loop upto square root of that number 
        for (int j = 1; j * j <= i; j++) 
        { 
            if (i % j == 0)  
            { 
  
                // if the n is perfect square 
                if (i / j == j) 
                    v.get(i).add(j); 
  
                // otherwise push it's two divisors 
                else 
                { 
                    v.get(i).add(j); 
                    v.get(i).add(i / j); 
                } 
            } 
        } 
  
        // sort the divisors 
        Collections.sort(v.get(i)); 
    } 
} 
  
// Function to find max product 
static int product(int n) 
{ 
    // To store factors of 'n' 
    v.clear(); 
    for(int i = 0; i < n + 100; i++) 
        v.add(new Vector<Integer>()); 
  
    // find factors 
    factors(n + 100); 
  
    // if it is divisible by 4. 
    if (n % 4 == 0)   
    { 
        int x = n / 4; 
        x *= x; 
        return x * x; 
    } 
  
    else
    { 
  
        // if it is prime 
        if (isPrime(n)) 
            return -1; 
  
        // otherwise answer will be possible 
        else 
        { 
            int ans = -1; 
            if (v.get(n).size() > 2)  
            { 
  
                // include last third factor 
                int fac = v.get(n).get(v.get(n).size() - 3); 
  
                // nested loop to find other two factors 
                for (int i = v.get(n).size() - 1; i >= 0; i--) 
                { 
                    for (int j = v.get(n).size() - 1; j >= 0; j--)  
                    { 
                        if ((fac * 2) + (v.get(n).get(j) +  
                                         v.get(n).get(i)) == n) 
                            ans = Math.max(ans, fac * fac *  
                                          v.get(n).get(j) *  
                                          v.get(n).get(i)); 
                    } 
                } 
                return ans; 
            } 
        } 
    } 
    return 0; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 24; 
  
    // function call 
    System.out.println( product(n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

