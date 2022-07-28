

// Java implementation of the approach 
import java.util.*; 
  
class geeks 
{ 
  
    // Function to count the 
    // minimum operations required. 
    public static int minOperations(int[] a, int n, int K) 
    { 
        HashMap<Integer, Boolean> map = new HashMap<>(); 
          
        for (int i = 0; i < n; i++) 
        { 
  
            // check if the initial array 
            // already contains an equal pair 
            // try-catch is used so that 
            // nullpointer exception can be handeled 
            try 
            { 
                if (map.get(a[i])) 
                    return 1; 
            }  
            catch (Exception e)  
            { 
                //TODO: handle exception 
            } 
              
            try 
            { 
                map.put(a[i], true); 
            } catch (Exception e) {} 
        } 
  
        // create new array with AND operations 
        int[] b = new int[n]; 
        for (int i = 0; i < n; i++) 
            b[i] = a[i] & K; 
  
        // clear the map 
        map.clear(); 
  
        // Check if the solution 
        // is a single operation 
        for (int i = 0; i < n; i++) 
        { 
  
            // If Bitwise operation between 
            // 'k' and a[i] gives 
            // a number other than a[i] 
            if (a[i] != b[i]) 
            { 
                try 
                { 
                    map.put(b[i], true); 
                } 
                catch (Exception e) {} 
            } 
        } 
  
        // Check if any of the a[i] 
        // gets equal to any other element 
        // of the array after the operation. 
        for (int i = 0; i < n; i++) 
        { 
  
            // Single operation 
            // will be enough 
            try 
            { 
                if (map.get(a[i])) 
                    return 1; 
            } 
            catch (Exception e)  
            { 
                //TODO: handle exception 
            } 
        } 
  
        // clear the map 
        map.clear(); 
  
        // Check if the solution 
        // is two operations 
        for (int i = 0; i < n; i++) 
        { 
  
            // Check if the array 'b' 
            // contains duplicates 
            try
            { 
                if (map.get(b[i])) 
                    return 2; 
            }  
            catch (Exception e)  
            { 
                //TODO: handle exception 
            } 
  
            try
            { 
                map.put(b[i], true); 
            }  
            catch (Exception e)  
            { 
                //TODO: handle exception 
            } 
        } 
  
        // otherwise it is impossible to 
        // create such an array with 
        // Bitwise AND operations 
        return -1; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int K = 3; 
        int[] a = { 1, 2, 3, 7 }; 
        int n = a.length; 
  
        // Function call to compute the result 
        System.out.println(minOperations(a, n, K)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

