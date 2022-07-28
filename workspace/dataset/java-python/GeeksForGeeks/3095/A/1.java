

// Java implementation to find the number 
// of sub-arrays ending with arr[i] which 
// is the minimum element of the subarray  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Main 
{  
    static class Pair 
    { 
        int first; 
        int second; 
        public Pair(int x, int y) 
        { 
            this.first = x; 
            this.second = y; 
        } 
    } 
      
// Function to find the number 
// of sub-arrays ending with arr[i] which 
// is the minimum element of the subarray 
static void min_subarray(int []a, int n) 
{ 
    Stack<Pair> st = new Stack<Pair>(); 
      
    for (int i = 0; i < n; ++i) 
    { 
          
        // There exsits a subarray of 
        // size 1 for each element 
        int count = 1; 
  
        // Remove all greater elements 
        while (st.empty() == false &&  
            st.peek().first > a[i])  
        { 
              
            // Increment the count 
            count += st.peek().second; 
  
            // Remove the element 
            st.pop(); 
        } 
  
        // Push the current element 
        // and it's count 
        st.push(new Pair (a[i], count )); 
  
        System.out.print(count + " "); 
    } 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int []a = {5, 4, 3, 2, 1}; 
    int n = a.length; 
  
    min_subarray(a, n); 
} 
} 
  
// This code is contributed by tufan_gupta2000 

