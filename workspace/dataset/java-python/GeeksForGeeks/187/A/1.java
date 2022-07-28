

// Java program to count number of digits 
// which is prime and also divides number 
class GFG { 
      
    // Function to find the number of 
    // digits in number which divides the 
    // number and is also a prime number 
    static int countDigit(int n) 
    { 
        boolean prime[]  = new boolean[10]; 
          
        for (int i = 0; i < 10; i++) 
            prime[i] = false; 
  
        // Only 2, 3, 5 and 7 are prime  
        // one-digit number 
        prime[2] = prime[3] = true; 
        prime[5] = prime[7] = true; 
      
        int temp = n, count = 0; 
          
        // Loop to compute all the digits 
        // of the number untill it  
        // is not equal to the zero 
        while (temp != 0) { 
      
            // Fetching each digit 
            // of the number 
            int d = temp % 10; 
      
            temp /= 10; 
      
            // Checking if digit is greater than 0 
            // and can divides n and is prime too 
            if (d > 0 && n % d == 0 && prime[d] == true) 
                count++; 
        } 
      
        return count; 
    } 
      
    // Driven Code 
    public static void main (String[] args) 
    { 
        int n = 1032; 
      
        System.out.println(countDigit(n)) ; 
    } 
} 
  
// This code is contributed by Yash_R 

