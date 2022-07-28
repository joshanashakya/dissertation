

// Java program to count the number of 
// prime digits in a number 
class GFG { 
      
    // Function to find the count of 
    // prime digits in a number 
    static int countDigit(int n) 
    { 
        int temp = n, count = 0; 
      
        // Loop to compute all the digits 
        // of the number 
        while (temp != 0) { 
      
            // Finding every digit of the 
            // given number 
            int d = temp % 10; 
      
            temp /= 10; 
      
            // Checking if digit is prime or not 
            // Only 2, 3, 5 and 7 are prime 
            // one-digit number 
            if (d == 2 || d == 3
                || d == 5 || d == 7) 
                count++; 
        } 
      
        return count; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 1234567890; 
      
        System.out.println(countDigit(n)) ; 
  
    } 
} 
  
// This code is contributed by AnkitRai01 

