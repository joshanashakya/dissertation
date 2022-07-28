

// Java program to find the number of ordered  
// pairs such that a * p + b * q = N  
// where p and q are primes  
public class GFG { 
  
    
    final static int size = 10001;  
    static int prime[] = new int[size];  
    static int freq[] = new int [size];  
      
    // Sieve of erastothenes  
    // to store the prime numbers  
    // and their frequency in form a*p+b*q  
    static void sieve(int a, int b)  
    {  
        prime[1] = 1;  
      
        // Performing Sieve of Eratosthenes  
        // to find the prime numbers unto 10001  
        for (int i = 2; i * i < size; i++) {  
            if (prime[i] == 0) {  
                for (int j = i * 2; j < size; j += i)  
                    prime[j] = 1;  
            }  
        }  
      
        // Loop to find the number of  
        // ordered pairs for every combination  
        // of the prime numbers  
        for (int p = 1; p < size; p++) {  
            for (int q = 1; q < size; q++) {  
                if (prime[p] == 0 && prime[q] == 0 
                    && a * p + b * q < size) {  
                    freq[a * p + b * q]++;  
                }  
            }  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int queries = 2, a = 1, b = 2;  
        sieve(a, b);  
        int arr[] = { 15, 25 };  
      
        // Printing the number of ordered pairs  
        // for every query  
        for (int i = 0; i < queries; i++) {  
            System.out.print(freq[arr[i]] + " ");  
        }  
      
      
    }  
} 
// This code is contributed by AnkitRai01 

