

// Java implementation of the approach 
import java.util.HashMap; 
  
class GFG  
{ 
      
    // Function to return the count of 
    // minimum operations required 
    public static int minOperations(int[] a, int n, int K)  
    { 
  
        HashMap<Integer, Boolean> map = new HashMap<>(); 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // Check if the initial array 
            // already contains an equal pair 
            if (map.containsKey(a[i])) 
                return 0; 
  
            map.put(a[i], true); 
        } 
  
        // Create new array with OR operations 
        int[] b = new int[n]; 
        for (int i = 0; i < n; i++) 
            b[i] = a[i] | K; 
  
        // Clear the map 
        map.clear(); 
  
        // Check if the solution 
        // is a single operation 
        for (int i = 0; i < n; i++)  
        { 
  
            // If Bitwise OR operation between 
            // 'k' and a[i] gives 
            // a number other than a[i] 
            if (a[i] != b[i]) 
                map.put(b[i], true); 
        } 
  
        // Check if any of the a[i] 
        // gets equal to any other element 
        // of the array after the operation 
        for (int i = 0; i < n; i++)  
        { 
  
            // Single operation 
            // will be enough 
            if (map.containsKey(a[i])) 
                return 1; 
        } 
  
        // Clear the map 
        map.clear(); 
  
        // Check if the solution 
        // is two operations 
        for (int i = 0; i < n; i++)  
        { 
  
            // Check if the array 'b' 
            // contains duplicates 
            if (map.containsKey(b[i])) 
                return 2; 
            map.put(b[i], true); 
        } 
  
        // Otherwise it is impossible to 
        // create such an array with 
        // Bitwise OR operations 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int K = 3; 
        int[] a = { 1, 9, 4, 3 }; 
        int n = a.length; 
        System.out.println(minOperations(a, n, K)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

