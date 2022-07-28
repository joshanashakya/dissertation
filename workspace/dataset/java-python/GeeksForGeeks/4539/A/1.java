

// java program to Range query for 
// Count number of set bits 
import java.io.*; 
  
class GFG { 
  
    // 2-D array that will stored the count 
    // of bits set in element of array 
    static int BitCount[] = new int[10000]; 
      
    // Function store the set bit 
    // count in BitCount Array 
    static void fillSetBitsMatrix(int arr[], int n) 
    { 
      
        // traverse over all bits 
        for (int i = 0; i < 32; i++) { 
      
            // mark elements with i'th bit set 
            for (int j = 0; j < n; j++) { 
      
                // Check whether the current  
                // bit is set or not if it's  
                // set then mark it. 
                long temp = arr[j] >> i; 
                if (temp % 2 != 0) 
                    BitCount[j] += 1; 
            } 
        } 
      
        // store cumulative sum of bits 
        for (int i = 1; i < n; i++) 
            BitCount[i] += BitCount[i - 1]; 
    } 
      
    // Function to process queries 
    static void Query(int Q[][], int q) 
    { 
        for (int i = 0; i < q; i++) 
            System.out.println( (BitCount[Q[i][1]] 
                        - BitCount[Q[i][0] - 1])); 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int Arr[] = { 1, 5, 6, 10, 9, 4, 67 }; 
        int n = Arr.length; 
      
        fillSetBitsMatrix(Arr, n); 
      
        int q = 2; 
        int Q[][] = { { 1, 5 }, { 2, 6 } }; 
      
        Query(Q, q); 
    } 
} 
  
// This code is contributed by anuj_67. 

