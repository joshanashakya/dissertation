

// Java program Count total number of sub-arrays 
// having total distinct elements same as that 
// original array. 
  
import java.util.HashMap; 
  
class Test 
{ 
    // Method to calculate distinct sub-array 
    static int countDistictSubarray(int arr[], int n) 
    { 
        // Count distinct elements in whole array 
        HashMap<Integer, Integer>  vis = new HashMap<Integer,Integer>(){ 
            @Override
            public Integer get(Object key) { 
                if(!containsKey(key)) 
                    return 0; 
                return super.get(key); 
            } 
        }; 
          
        for (int i = 0; i < n; ++i) 
            vis.put(arr[i], 1); 
        int k = vis.size(); 
       
        // Reset the container by removing all elements 
        vis.clear(); 
       
        // Use sliding window concept to find 
        // count of subarrays having k distinct 
        // elements. 
        int ans = 0, right = 0, window = 0; 
        for (int left = 0; left < n; ++left) 
        { 
            while (right < n && window < k) 
            { 
                vis.put(arr[right], vis.get(arr[right]) + 1); 
       
                if (vis.get(arr[right])== 1) 
                    ++window; 
       
                ++right; 
            } 
       
            // If window size equals to array distinct  
            // element size, then update answer 
            if (window == k) 
                ans += (n - right + 1); 
       
            // Decrease the frequency of previous element 
            // for next sliding window 
            vis.put(arr[left], vis.get(arr[left]) - 1); 
       
            // If frequency is zero then decrease the 
            // window size 
            if (vis.get(arr[left]) == 0) 
                    --window; 
        } 
        return ans; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {2, 1, 3, 2, 3}; 
  
        System.out.println(countDistictSubarray(arr, arr.length)); 
    } 
} 

