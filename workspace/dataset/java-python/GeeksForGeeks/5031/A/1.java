

// Java implementation of the above approach 
import java.util.Vector; 
  
class GFG { 
  
// Function to print the permutation 
    static void findPermutation(int n) { 
        Vector<Integer> res = new Vector<Integer>(); 
  
        // Initial numbers to be pushed to result 
        int en = 2, on = 1; 
  
        // If n is even 
        if (n % 2 == 0) { 
            for (int i = 0; i < n; i++) { 
                if (i % 2 == 0) { 
                    res.add(en); 
                    en += 2; 
                } else { 
                    res.add(on); 
                    on += 2; 
                } 
            } 
        } // If n is odd 
        else { 
            for (int i = 0; i < n - 2; i++) { 
                if (i % 2 == 0) { 
                    res.add(en); 
                    en += 2; 
                } else { 
                    res.add(on); 
                    on += 2; 
                } 
            } 
            res.add(n); 
            res.add(n - 2); 
        } 
  
        // Print result 
        for (int i = 0; i < n; i++) { 
            System.out.print(res.get(i) + " "); 
        } 
        System.out.println(""); 
    } 
  
// Driver Code 
    public static void main(String[] args) { 
        int n = 9; 
        findPermutation(n); 
    } 
} 
// This code is contributed by PrinciRaj1992 

