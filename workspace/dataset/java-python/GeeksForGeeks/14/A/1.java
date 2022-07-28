

// Java program to validate above logic 
  
class GFG { 
  
// Function to check if the number 
// is divisible by 41 or not 
    static boolean isDivisible(long n) { 
        while (n / 100 != 0) { 
// Extracting the last digit 
            int d = (int) (n % 10); 
  
// Truncating the number 
            n /= 10; 
  
// Subtracting the four times 
// the last digit from the 
// remaining number 
            n -= d * 4; 
        } 
  
// return true if number 
// is divisible by 41 
        return (n % 41 == 0); 
    } 
  
    public static void main(String[] args) { 
        long n = 104413920565933L; 
        if (isDivisible(n)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
  
    } 
} 
// This code is contributed by RAJPUT-JI 

