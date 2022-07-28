

// Java implementation of the approach 
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Set; 
  
class GFG  
{ 
      
    // Function that returns the 
    // minimum value of X 
    static int findMinimumX(int a[], int n) 
    { 
  
        // Declare a set 
        Set<Integer> st = new HashSet<>(); 
  
        // Iterate in the array element 
        // and insert them into the set 
        for (int i = 0; i < n; i++) 
            st.add(a[i]); 
  
        // If unique elements is 1 
        if (st.size() == 1) 
            return 0; 
  
        // Unique elements is 2 
        if (st.size() == 2)  
        { 
            // Get both el2 and el1 
            Iterator<Integer> it = st.iterator(); 
            int el1 = it.next(); 
            int el2 = it.next(); 
  
            // Check if they are even 
            if ((el2 - el1) % 2 == 0) 
                return (el2 - el1) / 2; 
            else
                return (el2 - el1); 
        } 
  
        // If there are 3 unique elements 
        if (st.size() == 3)  
        { 
            // Get three unique elements 
            Iterator<Integer> it = st.iterator(); 
            int el1 = it.next(); 
            int el2 = it.next(); 
            int el3 = it.next(); 
  
            // Check if their difference is same 
            if ((el2 - el1) == (el3 - el2)) 
                return el2 - el1; 
            else
                return -1; 
        } 
  
        // More than 3 unique elements 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int a[] = {1, 4, 4, 7, 4, 1}; 
        int n = a.length; 
        System.out.println(findMinimumX(a, n)); 
    } 
} 
  
// This code is contributed by 
// Rajnis09 

