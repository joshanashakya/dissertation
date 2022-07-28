

// Java implementation for above approach 
import java.util.*; 
  
class geeks 
{ 
      
    static int N = 100005; 
  
    // To store the tree in lazy propagation 
    static int[] lazy = new int[4*N]; 
  
    // To store the different numbers 
    static Set<Integer> se = new HashSet<Integer>(); 
  
    // Function to update in the range [x, y) with given value 
    public static void update(int x, int y, int value, 
                            int id, int l, int r) 
    { 
  
        // check out of bound  
        if (x >= r || l >= y)  
            return;  
      
        // check for complete overlap  
        if (x <= l && r <= y) 
        {  
            lazy[id] = value;  
            return;  
        }  
      
        // find the mid number  
        int mid = (l + r) / 2;  
      
        // check for pending updates  
        if (lazy[id] != 0)  
            lazy[2 * id] = lazy[2 * id + 1] = lazy[id];  
      
        // make lazy[id] = 0, so that it has no pending updates  
        lazy[id] = 0;  
      
        // call for two child nodes  
        update(x, y, value, 2 * id, l, mid);  
        update(x, y, value, 2 * id + 1, mid, r);  
    } 
  
    // Function to find non-zero integers in the range [l, r) 
    public static void query(int id, int l, int r) 
    { 
          
        // if id contains positive number 
        if (lazy[id] != 0) 
        { 
            se.add(lazy[id]); 
              
            // There is no need to see the children, 
            // because all the interval have same number 
            return; 
        } 
  
        // check for out of bound 
        if (r - l < 2) 
            return; 
  
        // find the middle number 
        int mid = (l + r) / 2; 
  
        // call for two child nodes 
        query(2 * id, l, mid); 
        query(2 * id + 1, mid, r); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
          
        // size of the array and number of queries 
        int n = 5, q = 3; 
  
        // Update operation for l, r, x, id, 0, n 
        update(1, 4, 1, 1, 0, n); 
        update(0, 2, 2, 1, 0, n); 
        update(3, 4, 3, 1, 0, n); 
  
        // Query operation to get answer in the range [0, n-1] 
        query(1, 0, n); 
  
        // Print the count of non-zero elements 
        System.out.println(se.size()); 
    } 
} 
  
// This code is contibuted by 
// sanjeev2552 

