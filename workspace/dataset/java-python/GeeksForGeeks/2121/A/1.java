

import java.util.ArrayList; 
import java.util.Collections; 
  
// Java programme to find the K'th minimum  
// element from an array concatenated M times 
class GFG  
{ 
  
    // Function to find the K-th minimum element  
    // from an array concatenated M times 
    static int KthMinValAfterMconcatenate(int[] A, int N, 
            int M, int K)  
    { 
        ArrayList V = new ArrayList(); 
  
        for (int i = 0; i < M; i++) 
        { 
            for (int j = 0; j < N; j++) 
            { 
                V.add(A[j]); 
            } 
        } 
  
        // sort the elements in ascending order 
        Collections.sort(V); 
  
        // return K'th Min element 
        // present at K-1 index 
        return ((int) V.get(K - 1)); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] A = {3, 1, 2}; 
        int M = 3, K = 4; 
        int N = A.length; 
        System.out.println(KthMinValAfterMconcatenate(A, N, M, K)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

