

// Java implementation to find the 
// minimum cost tree 
import java.util.*; 
  
class GFG{ 
  
// Function to find minimum cost tree 
static int MinCostTree(int arr[], int n) 
{ 
    int ans = 0; 
  
    // Stack 
    Vector<Integer> st = new Vector<Integer>(); 
    st.add(Integer.MAX_VALUE); 
  
    // Loop to traverse the array elements 
    for (int i = 0; i < n; i++) { 
          
        // Keep array elements  
        // in decreasing order by poping out 
        // the elements from stack till the top 
        // element is less than current element 
        while (st.get(st.size()-1) <= arr[i]) { 
              
            // Get top element 
            int x = st.get(st.size()-1); 
  
            // Remove it 
            st.remove(st.size()-1); 
  
            // Get the minimum cost to remove x 
            ans += x * Math.min(st.get(st.size()-1), arr[i]); 
        } 
  
        // Push current element 
        st.add(arr[i]); 
    } 
  
    // Find cost for all remaining elements 
    for (int i = 2; i < st.size(); i++) 
        ans += st.get(i) * st.get(i-1); 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 2, 3 }; 
  
    int n = arr.length; 
  
    // Function call 
    System.out.print(MinCostTree(arr, n)); 
} 
} 
  
// This code is contributed by sapnasingh4991 

