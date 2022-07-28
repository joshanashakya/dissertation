

// Java implementation of the above approach 
public class GFG { 
  
    // Function that returns true if number n 
    // is a composite number 
    static boolean isComposite(int n) 
    { 
        // Corner cases 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return false; 
  
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
            return true; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return true; 
  
        return false; 
    } 
  
    // Function that returns true if the eventual 
    // digit sum of number nm is 1 
    static boolean isDigitSumOne(int nm) 
    { 
  
        // Loop till the sum is not single  
        // digit number 
        while (nm > 9) { 
  
            // Intitialize the sum as zero 
            int sum_digit = 0; 
  
            // Find the sum of digits 
            while (nm > 0) { 
                int digit = nm % 10; 
                sum_digit = sum_digit + digit; 
                nm = nm / 10; 
            } 
            nm = sum_digit; 
        } 
  
        // If sum is eventually 1 
        if (nm == 1) 
            return true; 
        else
            return false; 
    } 
  
    // Function to print the required numbers 
    // from the given range 
    static void printValidNums(int l, int r) 
    { 
        for (int i = l; i <= r; i++) { 
  
            // If i is one of the required numbers 
            if (isComposite(i) && isDigitSumOne(i)) 
                System.out.print(i + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String arg[]) 
    { 
        int l = 10, r = 100; 
        printValidNums(l, r); 
    } 
} 

