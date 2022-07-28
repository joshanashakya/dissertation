

// Java implementation to  
// check whether the array 
// contains a set of  
// contiguous integers 
import java.util.*; 
  
class GFG { 
      
    // function to check  
    // whether the array 
    // contains a set of 
    // contiguous integers 
    static boolean areElementsContiguous(int arr[], 
                                         int n) 
    {  
        // Find maximum and  
        // minimum elements. 
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 
          
        for(int i = 0; i < n; i++) 
        { 
            max = Math.max(max, arr[i]); 
            min = Math.min(min, arr[i]); 
        } 
       
        int m = max - min + 1; 
       
        // There should be at least  
        // m elements in aaray to 
        // make them contiguous. 
        if (m > n) 
            return false; 
           
        // Create a visited array  
        // and initialize false. 
        boolean  visited[] = new boolean[n]; 
          
       
        // Mark elements as true. 
        for (int i = 0; i < n; i++)     
           visited[arr[i] - min] = true; 
       
        // If any element is not  
        // marked, all elements 
        // are not contiguous. 
        for (int i = 0; i < m; i++) 
           if (visited[i] == false) 
                return false; 
       
        return true; 
    } 
      
    /* Driver program  */
    public static void main(String[] args)  
    { 
        int arr[] = { 5, 2, 3, 6, 
                      4, 4, 6, 6 }; 
                        
        int n = arr.length; 
          
        if (areElementsContiguous(arr, n)) 
            System.out.println("Yes"); 
          
        else
            System.out.println("No"); 
           
      } 
} 

