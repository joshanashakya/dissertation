

// Java program to find Minimum number  
// of changes to make array distinct  
import java.util.*; 
  
class geeks 
{ 
  
    // Fucntion that returns minimum number of changes 
    public static int minimumOperations(int[] a, int n) 
    { 
  
        // Hash-table to store frequency 
        HashMap<Integer, Integer> mp = new HashMap<>(); 
  
        // Increase the frequency of elements 
        for (int i = 0; i < n; i++) 
        { 
            if (mp.get(a[i]) != null) 
            { 
                int x = mp.get(a[i]); 
                mp.put(a[i], ++x); 
            } 
            else
                mp.put(a[i], 1); 
        } 
  
        int count = 0; 
  
        // Traverse in the map to sum up the (occurrences-1) 
        // of duplicate elements 
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) 
        { 
            if (entry.getValue() > 1) 
            { 
                count += (entry.getValue() - 1); 
            } 
        } 
  
        return count; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] a = { 2, 1, 2, 3, 3, 4, 3 }; 
        int n = a.length; 
  
        System.out.println(minimumOperations(a, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

