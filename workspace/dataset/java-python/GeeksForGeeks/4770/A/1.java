

// Java program to calculate sum of Bit-wise  
// and sum of all subsets of an array 
class GFG { 
      
    static final int BITS = 32; 
      
    static int andSum(int arr[], int n) 
    { 
        int ans = 0; 
      
        // assuming representation of each 
        // element is in 32 bit 
        for (int i = 0; i < BITS; i++) { 
            int countSetBits = 0; 
      
            // iterating array element 
            for (int j = 0; j < n; j++) { 
      
                // Counting the set bit of 
                // array in ith position 
                if ((arr[j] & (1 << i)) != 0) 
                    countSetBits++; 
            } 
      
            // counting subset which produce 
            // sum when particular bit  
            // position is set. 
            int subset = (1 << countSetBits) - 1; 
      
            // multiplying every position  
            // subset with 2^i to count the 
            // sum. 
            subset = (subset * (1 << i)); 
      
            ans += subset; 
        } 
      
        return ans; 
    } 
      
    // Drivers code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3}; 
        int size = 3; 
        System.out.println (andSum(arr, size)); 
      
    } 
} 
  
// This code is contributed by Arnab Kundu. 

