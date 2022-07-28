

// Naive java program to count number of pairs 
// such that their sum is more than product. 
import java.*; 
  
public class GFG  
{ 
      
    // Returns the number of valid pairs 
    static int countPairs (int arr[], int n) 
    {  
        int ans = 0; // initializing answer 
      
        // Traversing the array. For each array 
        // element, checking its predecessors that 
        // follow the condition 
        for (int i = 0; i<n; i++) 
            for (int j = i-1; j>= 0; j--) 
                if (arr[i]*arr[j] > arr[i] + arr[j]) 
                    ans++; 
        return ans; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = {3, 4, 5}; 
        int n = arr.length; 
        System.out.println(countPairs(arr, n)); 
    } 
} 
  
// This code is contributed by Sam007 

