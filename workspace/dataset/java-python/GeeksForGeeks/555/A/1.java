

// Java program to find product of 
// unique prime factors of a number. 
  
class GFG { 
    public static long productPrimeFactors(int n) 
    { 
        long product = 1; 
  
        for (int i = 2; i <= n; i++) { 
            // Checking if 'i' is factor of num 
            if (n % i == 0) { 
  
                // Checking if 'i' is a Prime number 
                boolean isPrime = true; 
                for (int j = 2; j <= i / 2; j++) { 
                    if (i % j == 0) { 
                        isPrime = false; 
                        break; 
                    } 
                } 
  
                // condition if 'i' is Prime number 
                // as well as factor of num 
                if (isPrime) { 
                    product = product * i; 
                } 
            } 
        } 
        return product; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 44; 
        System.out.print(productPrimeFactors(n)); 
    } 
} 
  
// This code is contributed by _omg 

