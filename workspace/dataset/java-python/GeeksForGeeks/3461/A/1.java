

// Java code for the above approach 
import java.util.*; 
  
class GFG  
{ 
    static void min_visible_bottles(int[] arr, int n) 
    { 
        HashMap<Integer,  
                Integer> mp = new HashMap<Integer, 
                                          Integer>(); 
        int ans = 0; 
        for (int i = 0; i < n; i++)  
        { 
            if (mp.containsKey(arr[i])) 
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else 
            { 
                mp.put(arr[i], 1); 
            } 
            ans = Math.max(ans, mp.get(arr[i])); 
        } 
  
        System.out.print("Minimum number of " +  
                      "Visible Bottles are: " +  
                                   ans + "\n"); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 8; 
        int arr[] = { 1, 1, 2, 3, 4, 5, 5, 4 }; 
  
        // Find the solution 
        min_visible_bottles(arr, n); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

