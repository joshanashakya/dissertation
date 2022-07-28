

// Java program to get 
// maximum sum of Numbers 
// with condition that 
// their LCM should be N 
  
class GFG { 
    // Method returns maximum 
    // sum f distinct number 
    // whose LCM is N 
    static int getMaximumSumWithLCMN(int N) 
    { 
        int sum = 0; 
        int LIM = (int)Math.sqrt(N); 
  
        // find all divisors which divides 'N' 
        for (int i = 1; i <= LIM; i++) { 
            // if 'i' is divisor of 'N' 
            if (N % i == 0) { 
                // if both divisors are same then add 
                // it only once else add both 
                if (i == (N / i)) 
                    sum += i; 
                else
                    sum += (i + N / i); 
            } 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 12; 
        System.out.println(getMaximumSumWithLCMN(N)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

