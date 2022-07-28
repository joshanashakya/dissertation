

// java code to find absolute distinct 
// count of an array in O(n) time. 
import java.util.*; 
  
class GFG  
{ 
    // The function returns number of 
    // distinct absolute values among 
    // the elements of the array 
    static int distinctCount(int arr[], int n) 
    { 
        Set<Integer> s = new HashSet<Integer> (); 
  
        // Note that set keeps only one 
        // copy even if we try to insert 
        // multiple values 
        for (int i = 0 ; i < n; i++) 
        s.add(Math.abs(arr[i])); 
          
        return s.size(); 
          
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {-2, -1, 0, 1, 1}; 
        int n = arr.length; 
  
        System.out.println("Count of absolute distinct values : "
                           + distinctCount(arr, n)); 
          
    } 
} 
  
// This code is contributed by prerna saini 

