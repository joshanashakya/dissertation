

// Java program to check if the sum of distinct  
// digits of two integers are equal 
public class HelloWorld { 
  
    // Function to return the sum of 
    // distinct digits of a number 
    static int distinctDigitSum(int n) 
    { 
        boolean used[] = new boolean[10]; 
        int sum = 0; 
        while (n > 0) { 
  
            // Take last digit 
            int digit = n % 10; 
  
            // If digit has not been used before 
            if (!used[digit]) { 
  
                // Set digit as used 
                used[digit] = true; 
                sum += digit; 
            } 
  
            // Remove last digit 
            n = n / 10; 
        } 
  
        return sum; 
    } 
  
    // Function to check whether the sum of 
    // distinct digits of two numbers are equal 
    static String checkSum(int m, int n) 
    { 
        int sumM = distinctDigitSum(m); 
        int sumN = distinctDigitSum(n); 
  
        if (sumM == sumN) 
            return "YES"; 
        return "NO"; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int m = 2452, n = 9222; 
        System.out.println(checkSum(m, n)); 
    } 
} 

