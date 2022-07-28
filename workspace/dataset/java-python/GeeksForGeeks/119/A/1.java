

//Java Program to find sum of all  
//factors of a given number 
public class GFG { 
  
    //Using SieveOfEratosthenes to find smallest prime 
    //factor of all the numbers. 
    //For example, if N is 10, 
    //s[2] = s[4] = s[6] = s[10] = 2 
    //s[3] = s[9] = 3 
    //s[5] = 5 
    //s[7] = 7 
    static void sieveOfEratosthenes(int N, int s[]) 
    { 
     // Create a boolean array "prime[0..n]" and 
     // initialize all entries in it as false. 
     boolean[] prime = new boolean[N + 1]; 
       
     for(int i = 0; i < N+1; i++) 
         prime[i] = false; 
  
     // Initializing smallest factor equal to 2 
     // for all the even numbers 
     for (int i = 2; i <= N; i += 2) 
         s[i] = 2; 
  
     // For odd numbers less then equal to n 
     for (int i = 3; i <= N; i += 2) { 
         if (prime[i] == false) { 
  
             // s(i) for a prime is the number itself 
             s[i] = i; 
  
             // For all multiples of current prime number 
             for (int j = i; j * i <= N; j += 2) { 
                 if (prime[i * j] == false) { 
                     prime[i * j] = true; 
  
                     // i is the smallest prime factor for 
                     // number "i*j". 
                     s[i * j] = i; 
                 } 
             } 
         } 
     } 
    } 
  
    //Function to find sum of all prime factors 
    static int findSum(int N) 
    { 
     // Declaring array to store smallest prime 
     // factor of i at i-th index 
     int[] s = new int[N + 1]; 
  
     int ans = 1; 
  
     // Filling values in s[] using sieve 
     sieveOfEratosthenes(N, s); 
        
     int currFactor = s[N]; // Current prime factor of N 
     int power = 1; // Power of current prime factor 
  
     while (N > 1) { 
         N /= s[N]; 
  
         // N is now N/s[N]. If new N als has smallest 
         // prime factor as currFactor, increment power 
         if (currFactor == s[N]) { 
             power++; 
             continue; 
         } 
  
         int sum = 0; 
            
         for(int i=0; i<=power; i++) 
             sum += Math.pow(currFactor,i); 
            
         ans *= sum; 
            
            
         // Update current prime factor as s[N] and 
         // initializing power of factor as 1. 
         currFactor = s[N]; 
         power = 1; 
     } 
  
     return ans; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
        int n = 12; 
  
         System.out.print("Sum of the factors is : "); 
  
         System.out.print(findSum(n)); 
    } 
}  

