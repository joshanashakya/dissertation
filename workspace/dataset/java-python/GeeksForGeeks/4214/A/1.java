

// JAVA program to find number of subarrays such that 
// XOR of one half is equal to the other 
import java.util.*; 
  
class GFG 
{ 
          
    // Function to find number of subarrays such that 
    // XOR of one half is equal to the other 
    static int findSubarrCnt(int arr[], int n) 
    { 
        // Variables to store answer and current XOR's 
        int ans = 0, XOR = 0; 
      
        // Array to store prefix XOR's 
        int prefix[] = new int[n]; 
      
        for (int i = 0; i < n; ++i)  
        { 
      
            // Calculate XOR until this index 
            XOR = XOR ^ arr[i]; 
      
            // Store the XOR in prefix array 
            prefix[i] = XOR; 
        } 
      
        // Create groups for odd indexes and even indexes 
        HashMap<Integer, Integer> evenGroup = new HashMap<>(); 
        HashMap<Integer, Integer> oddGroup = new HashMap<>(); 
          
  
        // Initialize occurrence of 0 in oddGroup as 1 
        // because it will be used in case our 
        // subarray has l = 0 
        oddGroup.put(0, 1); 
      
        for (int i = 0; i < n; ++i)  
        { 
      
            if (i % 2== 1)  
            { 
      
                // Check the frequency of current prefix  
                // XOR in oddGroup and add it to the  
                // answer 
                if(oddGroup.containsKey(prefix[i])) 
                { 
                    ans += oddGroup.get(prefix[i]); 
      
                    // Update the frequnecy 
                    oddGroup.put(prefix[i],oddGroup.get(prefix[i] + 1)); 
                } 
                else
                { 
                    oddGroup.put(prefix[i], 1); 
                } 
                  
            } 
            else 
            { 
      
                // Check the frequency of current prefix  
                // XOR in evenGroup and add it to the 
                // answer 
                if(evenGroup.containsKey(prefix[i])) 
                { 
                    ans += evenGroup.get(prefix[i]); 
      
                    // Update the frequnecy 
                    evenGroup.put(prefix[i],evenGroup.get(prefix[i] + 1)); 
                } 
                else
                { 
                    evenGroup.put(prefix[i], 1); 
                } 
            } 
        } 
      
        return ans; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
      
        int arr[] = { 3, 2, 2, 3, 7, 6 }; 
        int N = arr.length; 
      
        System.out.println(findSubarrCnt(arr, N)); 
    } 
} 
  
// This code is contributed by ihritik 

