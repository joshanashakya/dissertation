

// Java implementation of the approach 
import java.util.HashMap; 
import java.util.HashSet; 
  
class GFG  
{ 
  
    // Function to return the count 
    // of minimum stacks 
    static int countPiles(int n, int[] a)  
    { 
  
        // Keep track of occurrence 
        // of each capacity 
        HashMap<Integer,  
                Integer> occ = new HashMap<>(); 
  
        // Fill the occurrence map 
        for (int i = 0; i < n; i++) 
            occ.put(a[i], occ.get(a[i]) == null ? 1 :  
                          occ.get(a[i]) + 1); 
  
        // Number of piles is 0 initially 
        int pile = 0; 
  
        // Traverse occurrences in increasing 
        // order of capacities. 
        while (!occ.isEmpty())  
        { 
  
            // Adding a new pile 
            pile++; 
            int size = 0; 
            HashSet<Integer> toRemove = new HashSet<>(); 
  
            // Traverse all piles in increasing 
            // order of capacities 
            for (HashMap.Entry<Integer, 
                               Integer> tm : occ.entrySet()) 
            { 
                int mx = tm.getKey(); 
                int ct = tm.getValue(); 
  
                // Number of boxes of capacity mx 
                // that can be added to current pile 
                int use = Math.min(ct, mx - size + 1); 
  
                // Update the occurrence 
                occ.put(mx, occ.get(mx) - use); 
  
                // Update the size of the pile 
                size += use; 
                if (occ.get(mx) == 0) 
                    toRemove.add(mx); 
            } 
  
            // Remove capacities that are 
            // no longer available 
            for (int tm : toRemove) 
                occ.remove(tm); 
        } 
        return pile; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] a = { 0, 0, 1, 1, 2 }; 
        int n = a.length; 
  
        System.out.println(countPiles(n, a)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

