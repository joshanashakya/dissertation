

// Java program to find n^2 - m^2 
// is prime or not. 
  
class GFG 
{ 
        // Check if a number is prime or not 
        static boolean isprime(int x) 
        { 
            // run a loop upto square of given number 
            for (int i = 2; i * i <= x; i++) 
                if (x % i == 0) 
                    return false; 
            return true; 
        } 
          
        // Check if n^2 - m^2 is prime 
        static boolean isNSqMinusnMSqPrime(int m, int n) 
        { 
            if (n - m == 1 && isprime(m + n)) 
                return true; 
            else
                return false; 
        } 
          
        // Driver code 
        public static void  main(String [] args) 
        { 
            int m = 13, n = 16; 
            if (isNSqMinusnMSqPrime(m, n)) 
                System.out.println("YES"); 
            else
                System.out.println("NO"); 
          
        } 
} 
  
// This code is contributed 
// by ihritik 

