

// Java implementation to count subsequences having  
// maximum distinct elements 
import java.util.HashMap; 
  
class geeks 
{ 
      
    // function to count subsequences having 
    // maximum distinct elements 
    public static long countSubseq(int[] arr, int n)  
    { 
  
        // unordered_map 'um' implemented as 
        // hash table 
        HashMap<Integer, Integer> um = new HashMap<>(); 
  
        long count = 1; 
  
        // count frequency of each element 
        for (int i = 0; i < n; i++) 
        { 
            if (um.get(arr[i]) != null) 
            { 
                int a = um.get(arr[i]); 
                um.put(arr[i], ++a); 
            } 
            else
                um.put(arr[i], 1); 
        } 
          
        // traverse 'um' 
        for (HashMap.Entry<Integer, Integer> entry : um.entrySet()) 
        { 
              
            // multiply frequency of each element 
            // and accumulate it in 'count' 
            count *= entry.getValue(); 
        } 
          
        // required number of subsequences 
        return count; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] arr = { 4, 7, 6, 7 }; 
        int n = arr.length; 
        System.out.println("Count = " + countSubseq(arr, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

