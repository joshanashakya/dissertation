

// C# program to minimum changes required  
// in an array for k distinct elements. 
import java.util.*; 
  
class GFG 
{ 
    static int MAX = 100005; 
      
    // Function to minimum changes required  
    // in an array for k distinct elements. 
    static int Min_Replace(int [] arr,  
                           int n, int k) 
    { 
        Arrays.sort(arr); 
      
        // Store the frequency of each element 
        Integer [] freq = new Integer[MAX]; 
        Arrays.fill(freq, 0); 
        int p = 0; 
        freq[p] = 1; 
          
        // Store the frequency of elements 
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                ++freq[p]; 
            else
                ++freq[++p]; 
        } 
      
        // Sort frequencies in descending order 
        Arrays.sort(freq, Collections.reverseOrder()); 
          
        // To store the required answer 
        int ans = 0; 
        for (int i = k; i <= p; i++) 
            ans += freq[i]; 
              
        // Return the required answer 
        return ans; 
    } 
      
    // Driver code 
    public static void main (String []args) 
    { 
        int [] arr = { 1, 2, 7, 8, 2, 3, 2, 3 }; 
          
        int n = arr.length; 
          
        int k = 2; 
          
        System.out.println(Min_Replace(arr, n, k)); 
    } 
} 
  
// This code is contributed by PrinciRaj1992  

