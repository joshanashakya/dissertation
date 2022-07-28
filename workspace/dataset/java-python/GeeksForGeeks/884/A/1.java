

// Java Program to find the distinct 
// elements in a range 
import java.util.*; 
  
class GFG{ 
   
// Function to perform queries in a range 
static long query(int start, int end, int left, int right, 
                int node, long seg[]) 
{ 
    // No overlap 
    if (end < left || start > right) { 
        return 0; 
    } 
   
    // Totally Overlap 
    else if (start >= left && end <= right) { 
        return seg[node]; 
    } 
   
    // Parital Overlap 
    else { 
        int mid = (start + end) / 2; 
   
        // Finding the Answer 
        // for the left Child 
        long leftChild = query(start, mid, left, 
                                    right, 2 * node, seg); 
   
        // Finding the Answer 
        // for the right Child 
        long rightChild = query(mid + 1, end, left, 
                                     right, 2 * node + 1, seg); 
   
        // Combining the BitMasks 
        return (leftChild | rightChild); 
    } 
} 
   
// Function to perform update operation 
// in the Segment seg 
static void update(int left, int right, int index, int Value, 
            int node, int ar[], long seg[]) 
{ 
    if (left == right) { 
        ar[index] = Value; 
   
        // Forming the BitMask 
        seg[node] = (1L << Value); 
        return; 
    } 
   
    int mid = (left + right) / 2; 
    if (index > mid) { 
   
        // Updating the left Child 
        update(mid + 1, right, index, Value, 2 * node + 1, ar, seg); 
    } 
    else { 
   
        // Updating the right Child 
        update(left, mid, index, Value, 2 * node, ar, seg); 
    } 
   
    // Updating the BitMask 
    seg[node] = (seg[2 * node] | seg[2 * node + 1]); 
} 
   
// Building the Segment Tree 
static void build(int left, int right, int node, int ar[], 
           long seg[]) 
{ 
    if (left == right) { 
   
        // Building the Initial BitMask 
        seg[node] = (1L << ar[left]); 
   
        return; 
    } 
   
    int mid = (left + right) / 2; 
   
    // Building the left seg tree 
    build(left, mid, 2 * node, ar, seg); 
   
    // Building the right seg tree 
    build(mid + 1, right, 2 * node + 1, ar, seg); 
   
    // Forming the BitMask 
    seg[node] = (seg[2 * node] | seg[2 * node + 1]); 
} 
   
// Utility Function to answer the queries 
static void getDistinctCount(int  [][]queries, 
                      int ar[], long seg[], int n) 
{ 
   
    for (int i = 0; i < queries.length; i++) { 
   
        int op = queries[i][0]; 
   
        if (op == 2) { 
   
            int l = queries[i][1], r = queries[i][2]; 
   
            long tempMask = query(0, n - 1, l - 1, 
                                       r - 1, 1, seg); 
   
            int countOfBits = 0; 
   
            // Counting the set bits which denote the 
            // distinct elements 
            for (int s = 63; s >= 0; s--) { 
   
                if ((tempMask & (1L << s))>0) { 
   
                    countOfBits++; 
                } 
            } 
   
            System.out.println(countOfBits); 
        } 
        else { 
   
            int index = queries[i][1]; 
            int val = queries[i][2]; 
   
            // Updating the value 
            update(0, n - 1, index - 1, val, 1, ar, seg); 
        } 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 7; 
    int ar[] = { 1, 2, 1, 3, 1, 2, 1 }; 
   
    long seg[] = new long[4 * n]; 
    build(0, n - 1, 1, ar, seg); 
   
    int [][]queries = { 
        { 2, 1, 4 }, 
        { 1, 4, 2 }, 
        { 1, 5, 2 }, 
        { 2, 4, 6 }, 
        { 2, 1, 7 } 
    }; 
   
    getDistinctCount(queries, ar, seg, n); 
   
} 
} 
  
// This code is contributed by PrinciRaj1992 

