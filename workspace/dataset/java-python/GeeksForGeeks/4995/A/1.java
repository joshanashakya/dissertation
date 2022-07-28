

// Java program to remove the elements whose 
// frequency appears in the range [l, r] 
import java.util.HashMap; 
  
class GFG { 
  
    static void removeElements(int arr[], int n, int l, int r) 
    { 
        // Hash map which will store the 
        // frequency of the elements of the array. 
        HashMap<Integer, Integer> mp = new HashMap<>(); 
  
        for (int i = 0; i < n; ++i) { 
  
            // Incrementing the frequency 
            // of the element by 1. 
            // mp[arr[i]]++; 
            int val = 0; 
            if (mp.get(arr[i]) == null) { 
                val = 1; 
            } 
            else { 
                val = mp.get(arr[i]) + 1; 
            } 
            // System.out.println("--"+mp.get(arr[i])); 
            mp.put(arr[i], val); 
        } 
  
        for (int i = 0; i < n; ++i) { 
  
            // Print the element whose frequency 
            // is not in the range [l, r] 
            if (mp.get(arr[i]) < l || mp.get(arr[i]) > r) { 
                System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 3, 2, 2, 5 }; 
        int n = arr.length; 
        int l = 2, r = 3; 
        removeElements(arr, n, l, r); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

