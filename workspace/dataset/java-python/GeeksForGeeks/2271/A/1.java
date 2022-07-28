

// Java Program to check Unusual number 
   
class GFG { 
   
    // Utility function to find largest 
    // prime factor of a number 
    static int largestPrimeFactor(int n) 
    { 
        // Initialize the maximum prime factor 
        // variable with the lowest one 
        int max = -1; 
   
        // Print the number of 2s that divide n 
        while (n % 2 == 0) { 
            max = 2; 
            n >>= 1; // equivalent to n /= 2 
        } 
   
        // n must be odd at this point, thus skip 
        // the even numbers and iterate only for 
        // odd integers 
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            while (n % i == 0) { 
                max = i; 
                n = n / i; 
            } 
        } 
   
        // This condition is to handle the case 
        // when n is a prime number greater than 2 
        if (n > 2) 
            max = n; 
   
        return max; 
    } 
   
    // Function to check Unusual number 
    static boolean checkUnusual(int n) 
    { 
        // Get the largest Prime Factor 
        // of the number 
        int factor = largestPrimeFactor(n); 
   
        // Check if largest prime factor 
        // is greater than sqrt(n) 
        if (factor > Math.sqrt(n)) { 
            return true; 
        } 
        else { 
            return false; 
        } 
    } 
   
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 14; 
   
        if (checkUnusual(n)) { 
            System.out.println("YES"); 
        } 
        else { 
            System.out.println("NO"); 
        } 
    } 
} 

