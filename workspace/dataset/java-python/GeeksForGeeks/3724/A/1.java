

// Java implementation of the approach 
import java.util.HashMap; 
  
class GFG 
{ 
  
    // Function to return the count of 
    // all distinct valid elements 
    public static int countOccurence(int n, int[] arr, int k)  
    { 
        int cnt, ans = 0; 
  
        // To avoid duplicates 
        HashMap<Integer, Boolean> hash = new HashMap<>(); 
  
        // Traverse the complete array  
        for (int i = 0; i < n; i++)  
        {  
            cnt = 0;  
  
            // If current element is previously checked  
            // don't check it again 
            if (hash.get(arr[i]) != null && hash.get(arr[i]) == true) 
                continue; 
  
                // To avoid duplicates 
                hash.put(arr[i], true); 
  
                // Count occurrence of arr[i] in range [i + 1, n - 1]  
                for (int j = i + 1; j < n; j++) 
                {  
                    if (arr[j] == arr[i])  
                        cnt++;  
  
                    // If count becomes equal to K  
                    // break the loop  
                    if (cnt >= k)  
                    break;  
                }  
  
                // If cnt >= K  
                // increment ans by 1  
                if (cnt >= k)  
                    ans++;  
        }  
  
        return ans;  
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] arr = {1, 2, 1, 3}; 
        int n = arr.length; 
        int k = 1; 
        System.out.println(countOccurence(n, arr, k)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

