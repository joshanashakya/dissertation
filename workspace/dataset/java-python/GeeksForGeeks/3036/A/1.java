

// Java program to find sub-set with 
// maximum possible size 
import java.util.*; 
  
class GFG 
{ 
      
// Function to find sub-set with 
// maximum possible size 
static void PowerOfTwo(int []x, int n) 
{ 
    // Sort the given array 
    Arrays.sort(x); 
  
    // To store required sub-set 
    ArrayList<Integer> res = new ArrayList<Integer>(); 
  
    for (int i = 0; i < n; ++i)  
    { 
  
        // Iterate for all powers of two 
        for (int j = 1; j < 31; ++j)  
        { 
  
            // Left number 
            int lx = x[i] - (1 << j); 
  
            // Right number 
            int rx = x[i] + (1 << j); 
  
            // Predefined binary search in Java 
            boolean isl = Arrays.binarySearch(x,lx) < 
                                    0 ? false : true; 
            boolean isr = Arrays.binarySearch(x,rx) <  
                                    0 ? false : true; 
  
            // If possible to get sub-set of size 3 
            if (isl && isr && res.size() < 3) 
            { 
                res.clear(); 
                res.add(lx); 
                res.add(x[i]); 
                res.add(rx); 
            } 
  
            // If possible to get sub-set of size 2 
            if (isl && res.size() < 2) 
            { 
                res.clear(); 
                res.add(lx); 
                res.add(x[i]); 
            } 
            // If possible to get sub-set of size 2 
            if (isr && res.size() < 2) 
            { 
                res.clear(); 
                res.add(x[i]); 
                res.add(rx); 
            } 
        } 
    } 
  
    // If not possible to get sub-set 
    if (res.size() == 0) 
    { 
        System.out.println("-1"); 
        return; 
    } 
  
    // Print the sub-set 
    for (int i = 0; i < res.size(); i++) 
        System.out.print(res.get(i) + " "); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int[] a = {3, 4, 5, 6, 7}; 
    int n = a.length; 
    PowerOfTwo(a, n); 
} 
} 
  
// This code is Contributed by chandan_jnu 

