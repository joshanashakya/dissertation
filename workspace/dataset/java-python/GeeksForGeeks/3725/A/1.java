

// Java implementation of the approach 
import java.util.HashMap; 
  
class GFG 
{ 
  
    // Function to return the count of 
    // all distinct valid elements 
    public static int countOccurence(int n, int[] arr, int k) 
    { 
        int ans = 0; 
  
        // To avoid duplicates 
        HashMap<Integer, Boolean> hash = new HashMap<>(); 
  
        // To store the count of arr[i] 
        // in range [i + 1, n - 1] 
        HashMap<Integer, Integer> occurence = new HashMap<>(); 
  
        for (int i = n-1; i>=0; i--) 
        { 
              
            // To avoid duplicates 
            if (hash.get(arr[i]) != null &&  
                hash.get(arr[i]) == true) 
                continue; 
              
            // If occurrence in range i+1 to n becomes 
            // equal to K then increment ans by 1 
            if (occurence.get(arr[i]) != null &&  
                occurence.get(arr[i]) >= k) 
            { 
                ans++; 
                hash.put(arr[i], true); 
            } 
  
            // Otherwise increase occurrence of arr[i] by 1 
            else
            { 
                if (occurence.get(arr[i]) == null) 
                    occurence.put(arr[i], 1); 
                else
                { 
                    int temp = occurence.get(arr[i]); 
                    occurence.put(arr[i], ++temp); 
                } 
            } 
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

