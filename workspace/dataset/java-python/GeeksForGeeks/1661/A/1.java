

// Java program to find minimum 
// changes required to make 
// all elements of the array equal 
import java.util.*; 
  
class GFG { 
  
    // Function to count of minimum changes 
    // required to make all elements equal 
    static int minChanges(int arr[], int n) 
    { 
  
        Map<Integer, Integer> mp = new HashMap<>(); 
  
        // Store the count of each element 
        // as key value pair in map 
        for (int i = 0; i < n; i++) { 
            if (mp.containsKey(arr[i])) { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            } 
  
            else { 
                mp.put(arr[i], 1); 
            } 
        } 
  
        int maxElem = 0; 
  
        // Traverse through map and 
        // find the maximum occurring element 
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) { 
  
            maxElem = Math.max(maxElem, entry.getValue()); 
        } 
  
        // Return count of all element minus 
        // count of maximum occurring element 
        return n - maxElem; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int arr[] = { 2, 3, 3, 4 }; 
  
        int n = arr.length; 
  
        System.out.println(minChanges(arr, n)); 
    } 
} 

