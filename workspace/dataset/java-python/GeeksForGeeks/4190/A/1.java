

// Java program to find the minimum absolute 
// difference between a number and its closest prime 
class GFG { 
  
    // Function to check if a number is prime or not 
    static boolean isPrime(int N) 
    { 
        for (int i = 2; i <= Math.sqrt(N); i++) { 
            if (N % i == 0) 
                return false; 
        } 
        return true; 
    } 
  
    // Function to find the minimum absolute difference 
    // between a number and its closest prime 
    static int getDifference(int N) 
    { 
        if (N == 0) 
            return 2; 
        else if (N == 1) 
            return 1; 
        else if (isPrime(N)) 
            return 0; 
  
        // Variables to store first prime  
        // above and below N 
        int aboveN = -1, belowN = -1; 
        int n1; 
  
        // Finding first prime number greater than N 
        n1 = N + 1; 
        while (true) { 
            if (isPrime(n1)) { 
                aboveN = n1; 
                break; 
            } 
            else
                n1++; 
        } 
  
        // Finding first prime number less than N 
        n1 = N - 1; 
        while (true) { 
            if (isPrime(n1)) { 
                belowN = n1; 
                break; 
            } 
            else
                n1--; 
        } 
  
        // Variables to store the differences 
        int diff1 = aboveN - N; 
        int diff2 = N - belowN; 
  
        return Math.min(diff1, diff2); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 25; 
        System.out.println(getDifference(N)); 
    } 
} 

