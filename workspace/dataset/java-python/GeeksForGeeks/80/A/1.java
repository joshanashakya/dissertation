

// Java program to check if each element of 
// the given array is a product of exactly 
// K prime factors 
import java.util.*; 
  
class GFG  
{ 
  
    static int MAX = 1000000; 
  
    // initialise the global sieve array 
    static int[] Sieve = new int[MAX+1]; 
  
    // Function to generate Sieve 
    static void constructSieve()  
    { 
        // NOTE: k value is necessarily more than 1 
        // hence, 0, 1 and any prime number cannot be 
        // represented as product of 
        // two or more prime numbers 
  
        for (int i = 2; i <= MAX; i++)  
        { 
            if (Sieve[i] == 0)  
            { 
                for (int j = 2 * i; j <= MAX; j += i) 
                { 
                    int temp = j; 
                    while (temp > 1 && temp % i == 0) 
                    { 
                        Sieve[j]++; 
                        temp = temp / i; 
                    } 
                } 
            } 
        } 
    } 
  
    // Function to check if each number of array 
    // satisfies the given condition 
    static void checkElements(int A[], int n, int k)  
    { 
        for (int i = 0; i < n; i++)  
        { 
            if (Sieve[A[i]] == k) 
            { 
                System.out.println("YES"); 
            }  
            else
            { 
                System.out.println("No"); 
            } 
  
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        // first construct the sieve 
        constructSieve(); 
  
        int k = 3; 
        int A[] = {12, 36, 42, 72}; 
        int n = A.length; 
  
        checkElements(A, n, k); 
    } 
} 
  
// This code contributed by Rajput-Ji 

