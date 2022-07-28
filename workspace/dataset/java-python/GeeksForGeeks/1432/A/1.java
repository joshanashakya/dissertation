

// Java implementation of the approach 
class GFG { 
  
    static final int MAX = 100000; 
    static long prefix[] = new long[MAX]; 
  
    // Function to calculate the prefix sum 
    // of all the even factors 
    static void sieve_modified() 
    { 
        for (int i = 2; i < MAX; i += 2) { 
  
            // Add i to all the multiples of i 
            for (int j = i; j < MAX; j += i) 
                prefix[j] += i; 
        } 
  
        // Update the prefix sum 
        for (int i = 1; i < MAX; i++) 
            prefix[i] += prefix[i - 1]; 
    } 
  
    // Function to return the sum of 
    // all the even factors of the 
    // numbers in the given range 
    static long sumEvenFactors(int L, int R) 
    { 
        return (prefix[R] - prefix[L - 1]); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        sieve_modified(); 
        int l = 6, r = 10; 
        System.out.print(sumEvenFactors(l, r)); 
    } 
} 

