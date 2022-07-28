

// Java program to verify Legendre's Conjecture 
// for a given n. 
class GFG { 
  
  // prime checking 
  static boolean isprime(int n) 
  {  
     for (int i = 2; i * i <= n; i++) 
        if (n % i == 0) 
            return false; 
     return true; 
  } 
  
  static void LegendreConjecture(int n) 
  { 
     System.out.println("Primes in the range "+n*n 
        +" and "+(n+1)*(n+1) 
        +" are:"); 
      
     for (int i = n*n; i <= ((n+1)*(n+1)); i++) 
     { 
       // searching for primes 
       if (isprime(i)) 
         System.out.println(i); 
     } 
  } 
  
  // Driver program 
  public static void main(String[] args) 
  { 
     int n = 50; 
     LegendreConjecture(n); 
  } 
} 
//This code is contributed by 
//Smitha Dinesh Semwal 

