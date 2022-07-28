

// Java program to find number of log values 
// needed to calculate all the log values 
// from 1 to N 
import java.util.*; 
  
class GFG  
{ 
  
    static int MAX = 1000005; 
  
    // In this vector prime[i] will store true 
    // if prime[i] is prime, else store false 
    static Vector<Boolean> prime = new Vector<>(MAX); 
  
    static void vecIni()  
    { 
        for (int i = 0; i < MAX; i++)  
        { 
            prime.add(i, true); 
        } 
    } 
  
    // Using sieve of Eratosthenes to find  
    // all prime upto N 
    static void seive(int N)  
    { 
        prime.add(0, false); 
        prime.add(1, false); 
  
        for (int i = 2; i <= N; i++)  
        { 
            if (prime.get(i)) 
            { 
                for (int j = 2; i * j <= N; j++) 
                { 
                    prime.add(i * j, false); 
                } 
            } 
        } 
    } 
  
    // Function to find number of log values needed  
    // to calculate all the log values from 1 to N 
    static int countLogNeeded(int N) 
    { 
        int count = 0; 
  
        // calculate primes upto N 
        seive(N); 
  
        for (int i = 1; i <= N; i++)  
        { 
            if (prime.get(i))  
            { 
                count++; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        vecIni(); 
        int N = 6; 
        System.out.println(countLogNeeded(N)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

