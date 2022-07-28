

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG  
{ 
  
    // Function to return the number of triplets 
    static int NoofTriplets(int N, int K)  
    { 
        int[] cnt = new int[K]; 
  
        // Initializing the count array 
        Arrays.fill(cnt, 0, cnt.length, 0); 
  
        // Storing the frequency of each modulo class 
        for (int i = 1; i <= N; i += 1) 
        { 
            cnt[i % K] += 1; 
        } 
  
        // If K is odd 
        if ((K & 1) != 0)  
        { 
            return cnt[0] * cnt[0] * cnt[0]; 
        }  
        // If K is even 
        else 
        { 
            return (cnt[0] * cnt[0] * cnt[0] 
                    + cnt[K / 2] * cnt[K / 2] * cnt[K / 2]); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
  
        int N = 3, K = 2; 
  
        // Function Call 
        System.out.println(NoofTriplets(N, K)); 
    } 
} 
  
// This code is contributed by Princi Singh 

