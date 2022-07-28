

// Java program to check if a prime number 
// can be expressed as sum of 
// two Prime Numbers 
  
public class GFG{ 
      
    // Function to check whether a number 
    // is prime or not 
    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
      
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) 
                return false; 
        } 
      
        return true; 
    } 
      
    // Function to check if a prime number 
    // can be expressed as sum of 
    // two Prime Numbers 
    static boolean isPossible(int N) 
    { 
        // if the number is prime, 
        // and number-2 is also prime 
        if (isPrime(N) && isPrime(N - 2)) 
            return true; 
        else
            return false; 
    } 
      
     // Driver code 
     public static void main(String []args){ 
           
        int n = 13; 
      
        if (isPossible(n) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
     } 
     // This code is contributed by ANKITRAI1 
} 

