

// Java implementation of the approach  
import java.util.*; 
  
class GFG { 
  
    // Size of the array (MAX) 
    static int N = (int) 2e5 + 10; 
  
    // To store the sum of 
    // the array elements 
    static int[] bit = new int[N]; 
  
    // To keep track of how many type 3 
    // queries have been performed before 
    // a particular index 
    static int[] idx = new int[N]; 
  
    // Function to perform the point 
    // update in Fenwick tree 
    static void update(int idx, int val, int[] bitt) { 
        while (idx < N) { 
            bitt[idx] += val; 
            idx += idx & (-idx); 
        } 
    } 
  
    // Function to return the sum 
    // of the elements A[1...idx] 
    // from BIT 
    static int sum(int idx, int[] bitt) { 
  
        int res = 0; 
        while (idx > 0) { 
            res += bitt[idx]; 
            idx -= idx & (-idx); 
        } 
  
        return res; 
    } 
  
    // Function to perform the queries and 
    // return the answer vector 
    static Vector<Integer> peformQueries(Vector<Integer> A, int[][] B) { 
  
        // For 1 bases indexing 
        // insert 0 in the vector 
        A.insertElementAt(0, 0); 
  
        // Updated size of the vector 
        int n = (int) A.size(); 
  
        // Updating the bit tree 
        for (int i = 1; i < n; ++i) { 
            update(i, A.elementAt(i), bit); 
        } 
  
        // Vector to store the answers 
        // of range sum 
        Vector<Integer> ans = new Vector<>(); 
  
        // Iterating in the query 
        // vector 
        for (int[] i : B) { 
  
            int type = i[0]; 
            int x = i[1], v = i[2]; 
  
            // If the query is of 
            // type 1 
            if (type == 1) { 
  
                // Updating the tree 
                // with x in the last 
                update(n, x, bit); 
  
                // Pushing back the value 
                // in the original vector 
                A.add(x); 
  
                // Incrementing the size 
                // of the vector by 1 
                n++; 
            } 
  
            // If the query is of type 2 
            else if (type == 2) { 
  
                // Getting the updated index 
                // in case of any query of 
                // type 3 occured before it 
                int id = x + sum(x, idx); 
  
                // Making the effect to that 
                // value to 0 by subtracting 
                // same vaule from the tree 
                update(id, -A.elementAt(id), bit); 
  
                // Updating the A[id] to v 
                A.set(id, v); 
  
                // Now update the 
                // bit by v at x 
                update(id, v, bit); 
            } 
  
            // If the query is of type 3 
            else if (type == 3) { 
  
                // Get the current index 
                int id = x + sum(x, idx); 
  
                // Remove the effect of that 
                // index from the bit tree 
                update(id, -A.elementAt(id), bit); 
  
                // Update the idx tree 
                // because one element has 
                // been deleted 
                update(x, 1, idx); 
  
                // Update the idx val to 0 
                A.set(id, 0); 
            } 
  
            // If the query is of type 4 
            else { 
  
                // Get the updated range 
                int xx = x + sum(x, idx); 
                int vv = v + sum(v, idx); 
  
                // Push_back the value 
                ans.add(sum(vv, bit) - sum(xx - 1, bit)); 
            } 
        } 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args) { 
        Integer[] a = { 1, 2, 5, 3, 4 }; 
        Vector<Integer> A = new Vector<Integer>(Arrays.asList(a)); 
  
        // Queries 
        int[][] B = { { 4, 2, 4 }, { 3, 3, 0 }, { 1, 6, 0 }, { 4, 3, 5 } }; 
  
        // Get the answer array 
        Vector<Integer> ans = peformQueries(A, B); 
  
        // printing the answer 
        for (int i : ans) 
            System.out.println(i); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

