

// Java program to count number of digits 
// that divides the number. 
  
class Test { 
    // Return the number of digits that divides 
    // the number. 
    static int countDigit(int n) 
    { 
        int temp = n, count = 0; 
        while (temp != 0) { 
            // Fetching each digit of the number 
            int d = temp % 10; 
            temp /= 10; 
  
            // Checking if digit is greater than 0 
            // and can divides n. 
            if (d > 0 && n % d == 0) 
                count++; 
        } 
  
        return count; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int n = 1012; 
        System.out.println(countDigit(n)); 
    } 
} 

