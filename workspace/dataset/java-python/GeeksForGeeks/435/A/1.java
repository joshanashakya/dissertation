

// Java program to find number 
// of ordered pairs 
import java.util.HashMap; 
import java.util.Map; 
  
class GFG 
{ 
      
    // Function to find count of Ordered pairs 
    public static int countOrderedPairs(int[] A, int n)  
    { 
  
        // Initialize pairs to 0 
        int orderedPairs = 0; 
  
        // Store frequencies 
        HashMap<Integer, Integer> m = new HashMap<>(); 
        for (int i = 0; i < n; i++) 
        { 
            if (m.get(A[i]) == null) 
                m.put(A[i], 1); 
            else
            { 
                int a = m.get(A[i]); 
                m.put(A[i], ++a); 
            } 
        } 
  
        // Count total Ordered_pairs 
        for (int entry : m.keySet()) 
        { 
              
            int X = entry; 
            int Y = m.get(entry); 
  
            for (int j = 1; j <= Y; j++) 
            { 
                if (m.get(j) >= X) 
                    orderedPairs++; 
            } 
        } 
  
        return orderedPairs; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] A = {1, 1, 2, 2, 3}; 
        int n = A.length; 
        System.out.print(countOrderedPairs(A, n)); 
    } 
} 
  
// This code is contibuted by 
// sanjeev2552 

