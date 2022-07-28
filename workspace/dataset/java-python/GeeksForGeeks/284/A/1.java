

// An efficient Java program to count distinct elements in 
// every window of size k 
import java.util.HashMap; 
  
class maxUniqueNumWindow { 
    static int maxUniqueNum(int arr[], int M) 
    { 
        // Creates an empty hashMap hM 
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 
  
        // initialize distinct element count for 
        // current window 
        int dist_count = 0; 
  
        // Traverse the first window and store count 
        // of every element in hash map 
        for (int i = 0; i < M; i++) { 
            if (hM.get(arr[i]) == null) { 
                hM.put(arr[i], 1); 
                dist_count++; 
            } 
            else { 
                int count = hM.get(arr[i]); 
                hM.put(arr[i], count + 1); 
            } 
        } 
   
        int res = dist_count; 
  
        // Traverse through the remaining array 
        for (int i = M; i < arr.length; i++) { 
  
            // Remove first element of previous window 
            // If there was only one occurrence, then 
            // reduce distinct count. 
            if (hM.get(arr[i - M]) == 1) { 
                hM.remove(arr[i - M]); 
                dist_count--; 
            } 
  
            else // reduce count of the removed element 
            { 
                int count = hM.get(arr[i - M]); 
                hM.put(arr[i - M], count - 1); 
            } 
  
            // Add new element of current window 
            // If this element appears first time, 
            // increment distinct element count 
            if (hM.get(arr[i]) == null) { 
                hM.put(arr[i], 1); 
                dist_count++; 
            } 
            else // Increment distinct element count 
            { 
                int count = hM.get(arr[i]); 
                hM.put(arr[i], count + 1); 
            } 
  
            res = Math.max(res, dist_count); 
        } 
  
        return res; 
    } 
  
    // Driver method 
    public static void main(String arg[]) 
    { 
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 }; 
        int M = 4; 
        System.out.println(maxUniqueNum(arr, M)); 
    } 
} 

