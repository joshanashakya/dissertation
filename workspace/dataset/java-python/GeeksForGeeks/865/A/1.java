

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function that returns true if 
    // the product of all the array elements 
    // is a perfect square 
    static boolean isPerfectSquare(int [] arr, int n) 
    { 
          
        HashMap<Integer, Integer> umap = new HashMap<>();  
          
        // Update the frequencies of 
        // all the array elements 
        for (int i = 0; i < n; i++) 
        { 
            if(umap.containsKey(arr[i])) 
                umap.put(arr[i], umap.get(arr[i]) + 1 ); 
            else
                umap.put(arr[i], 1); 
              
        } 
          
        Iterator<Map.Entry<Integer, Integer> >  
                iterator = umap.entrySet().iterator();  
  
        while(iterator.hasNext()) 
        { 
            Map.Entry<Integer, Integer> entry = iterator.next(); 
              
            // If frequency of some element 
            // in the array is odd 
            if (entry.getValue() % 2 == 1) 
                return false; 
        } 
        return true; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
  
        int arr [] = { 2, 2, 7, 7 }; 
        int n = arr.length; 
      
        if (isPerfectSquare(arr, n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by ihritik 

