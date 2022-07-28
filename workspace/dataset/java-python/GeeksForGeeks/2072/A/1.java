

// Java Program to print  
// all N primes after prime  
// P whose sum equals S 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    // vector to store prime  
    // and N primes whose sum 
    // equals given S 
    static ArrayList<Integer> set =  
                     new ArrayList<Integer>(); 
    static ArrayList<Integer> prime =  
                     new ArrayList<Integer>(); 
      
    // function to check 
    // prime number 
    static boolean isPrime(int x) 
    { 
        // square root of x 
        int sqroot = (int)Math.sqrt(x); 
  
        // since 1 is not 
        // prime number 
        if (x == 1) 
            return false; 
      
        // if any factor is 
        // found return false 
        for (int i = 2;  
                 i <= sqroot; i++) 
            if (x % i == 0) 
                return false; 
      
        // no factor found 
        return true; 
    } 
      
    // function to display N  
    // primes whose sum equals S 
    static void display() 
    { 
        int length = set.size(); 
        for (int i = 0;  
                 i < length; i++) 
            System.out.print( 
                   set.get(i) + " "); 
        System.out.println(); 
    } 
      
    // function to evaluate  
    // all possible N primes 
    // whose sum equals S 
    static void primeSum(int total, int N,  
                         int S, int index) 
    { 
        // if total equals S 
        // And total is reached 
        // using N primes 
        if (total == S &&  
            set.size() == N) 
        { 
            // display the N primes 
            display(); 
            return; 
        } 
      
        // if total is greater  
        // than S or if index  
        // has reached last 
        // element 
        // or if set size reached to maximum or greater than maximum 
        if (total > S || 
            index == prime.size() || set.size() >= N) 
            return; 
      
        // add prime.get(index)  
        // to set vector 
        set.add(prime.get(index)); 
      
        // include the (index)th  
        // prime to total 
        primeSum(total + prime.get(index), 
                         N, S, index + 1); 
      
        // remove element  
        // from set vector 
        set.remove(set.size() - 1); 
      
        // exclude (index)th prime 
        primeSum(total, N,  
                 S, index + 1); 
    } 
      
    // function to generate 
    // all primes 
    static void allPrime(int N,  
                         int S, int P) 
    { 
        // all primes less  
        // than S itself 
        for (int i = P + 1;  
                 i <= S ; i++) 
        { 
            // if i is prime add 
            // it to prime vector 
            if (isPrime(i)) 
                prime.add(i); 
        } 
      
        // if primes are  
        // less than N 
        if (prime.size() < N) 
            return; 
        primeSum(0, N, S, 0); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int S = 54, N = 2, P = 3; 
        allPrime(N, S, P); 
    } 
} 
  
// This code is contributed by  
// Manish Shaw(manishshaw1) 

