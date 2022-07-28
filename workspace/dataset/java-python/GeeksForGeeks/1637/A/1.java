

    
// Java program to sort only non primes 
import java.util.*; 
class solution 
{ 
// Create a boolean array "prime[0..n]" and initialize 
// all entries it as true. A value in prime[i] will 
// finally be false if i is Not a prime, else true. 
static boolean prime[] = new boolean[100006]; 
  
static void SieveOfEratosthenes(int n) 
{ 
  
    for(int i=1;i<=n;i++) 
    prime[i]=true; 
    prime[1] = false; 
  
    for (int p = 2; p * p <= n; p++) { 
        // If prime[p] is not changed, then it is a prime 
        if (prime[p] == true) { 
            // Update all multiples of p 
            for (int i = p * 2; i <= n; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to print the array such that 
// only non primes are sorted 
static void sortedArray(int arr[], int n) 
{ 
    SieveOfEratosthenes(100005); 
  
    // vector v will store all non 
    // prime numbers 
    Vector<Integer> v = new Vector<Integer>(); 
  
    // If not prime, insert into vector 
    for (int i = 0; i < n; ++i) { 
        if (prime[arr[i]]==false) 
            v.add(arr[i]); 
    } 
  
    // sorting vector of non primes 
    Collections.sort(v); 
  
    int j = 0; 
    // print the required array 
    for (int i = 0; i < n; ++i) { 
        if (prime[arr[i]] == true) 
            System.out.print( arr[i] + " "); 
        else { 
            System.out.print( v.get(j) + " "); 
            j++; 
        } 
    } 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
  
    int n = 6; 
    int arr[] = { 100, 11, 500, 2, 17, 1 }; 
  
    sortedArray(arr, n); 
  
} 
} 
//contributed by Arnab Kundu 

