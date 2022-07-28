

// Java implementation of the approach 
  
import java.util.HashSet; 
  
class GFG  
{ 
  
    // function to count maximum 
    // XOR value for a triplet 
    static void Maximum_xor_Triplet(int n, int a[]) 
    { 
        // set is used to avoid repetitions 
        HashSet<Integer> s = new HashSet<Integer>(); 
  
        for (int i = 0; i < n; i++) 
        { 
            for (int j = i; j < n; j++) 
            { 
  
                // store all possible unique 
                // XOR value of pairs 
                s.add(a[i] ^ a[j]); 
            } 
        } 
  
        int ans = 0; 
        for (Integer i : s)  
        { 
            for (int j = 0; j < n; j++) 
            { 
  
                // store maximum value 
                ans = Math.max(ans, i ^ a[j]); 
            } 
        } 
        System.out.println(ans); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int a[] = {1, 3, 8, 15}; 
        int n = a.length; 
        Maximum_xor_Triplet(n, a); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

