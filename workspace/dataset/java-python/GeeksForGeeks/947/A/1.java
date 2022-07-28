

// Java program to calculate sum of lengths of subarrays  
// of distinct elements.  
import java.util.*; 
  
class geeks 
{ 
  
    // Returns sum of lengths of all subarrays 
    // with distinct elements. 
    public static int sumoflength(int[] arr, int n)  
    { 
  
        // For maintaining distinct elements. 
        Set<Integer> s = new HashSet<>(); 
  
        // Initialize ending point and result 
        int j = 0, ans = 0; 
  
        // Fix starting point 
        for (int i = 0; i < n; i++) 
        { 
            while (j < n && !s.contains(arr[j])) 
            { 
                s.add(arr[i]); 
                j++; 
            } 
  
            // Calculating and adding all possible length 
            // subarrays in arr[i..j] 
            ans += ((j - i) * (j - i + 1)) / 2; 
  
            // Remove arr[i] as we pick new stating point 
            // from next 
            s.remove(arr[i]); 
        } 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] arr = { 1, 2, 3, 4 }; 
        int n = arr.length; 
  
        System.out.println(sumoflength(arr, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

