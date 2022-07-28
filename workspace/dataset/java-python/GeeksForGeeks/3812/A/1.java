

// Java program to removes all odd 
// frequency elements from an Array 
import java.util.*; 
  
class GFG { 
  
    // Function that removes the 
    // elements which have odd 
    // frequencies in the array 
    static void remove(int arr[], int n) { 
        // Create a map to store the 
        // frequency of each element 
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < n; i++) { 
            if (mp.containsKey(arr[i])) { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            } else { 
                mp.put(arr[i], 1); 
            } 
        } 
  
        // Remove the elements which 
        // have odd frequencies 
        for (int i = 0; i < n; i++) { 
  
            // If the element has 
            // odd frequency then skip 
            if ((mp.containsKey(arr[i]) && mp.get(arr[i]) % 2 == 1)) 
                continue; 
  
            System.out.print(arr[i] + ", "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        int arr[] = { 3, 3, 3, 2, 2, 4, 7, 7 }; 
        int n = arr.length; 
  
        // Function call 
        remove(arr, n); 
  
    } 
} 
  
// This code is contributed by Rajput-Ji 

