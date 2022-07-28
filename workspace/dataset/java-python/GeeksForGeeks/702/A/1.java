

// Java program to find the number of trailing 
// zeroes in base B representation of N! 
import java.util.*; 
class GFG  
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
// To find the power of a prime p in 
// factorial N 
static int findPowerOfP(int N, int p) 
{ 
    int count = 0; 
    int r = p; 
    while (r <= N) 
    { 
  
        // calculating floor(n/r) 
        // and adding to the count 
        count += (N / r); 
  
        // increasing the power of p 
        // from 1 to 2 to 3 and so on 
        r = r * p; 
    } 
    return count; 
} 
  
// returns all the prime factors of k 
static Vector<pair> primeFactorsofB(int B) 
{ 
    // vector to store all the prime factors 
    // along with their number of occurrence 
    // in factorization of B 
    Vector<pair> ans = new Vector<pair>(); 
  
    for (int i = 2; B != 1; i++) 
    { 
        if (B % i == 0)  
        { 
            int count = 0; 
            while (B % i == 0) 
            { 
                B = B / i; 
                count++; 
            } 
  
            ans.add(new pair(i, count)); 
        } 
    } 
    return ans; 
} 
  
// Returns largest power of B that 
// divides N! 
static int largestPowerOfB(int N, int B) 
{ 
    Vector<pair> vec = new Vector<pair>(); 
    vec = primeFactorsofB(B); 
    int ans = Integer.MAX_VALUE; 
    for (int i = 0; i < vec.size(); i++) 
  
        // calculating minimum power of all 
        // the prime factors of B 
        ans = Math.min(ans, findPowerOfP( 
                       N, vec.get(i).first) /  
                          vec.get(i).second); 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    System.out.println(largestPowerOfB(5, 2)); 
    System.out.println(largestPowerOfB(6, 9)); 
} 
} 
  
// This code is contributed by Princi Singh 

