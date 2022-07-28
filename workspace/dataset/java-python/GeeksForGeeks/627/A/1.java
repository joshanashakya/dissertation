

// Java implementation of the approach  
import java.util.*; 
  
class GFG { 
  
    // Merge procedure to merge two 
    // vectors into a single vector 
    static Vector<Integer> merge(Vector<Integer> v1,  
                               Vector<Integer> v2)  
    { 
        int i = 0, j = 0; 
  
        // Final vector to return 
        // after merging 
        Vector<Integer> v = new Vector<>(); 
  
        // Loop continues until it reaches 
        // the end of one of the vectors 
        while (i < v1.size() && j < v2.size()) 
        { 
            if (v1.elementAt(i) <= v2.elementAt(j)) 
            { 
                v.add(v1.elementAt(i)); 
                i++; 
            }  
            else
            { 
                v.add(v2.elementAt(j)); 
                j++; 
            } 
        } 
  
        // Here, simply add the remaining 
        // elements to the vector v 
        for (int k = i; k < v1.size(); k++) 
            v.add(v1.elementAt(k)); 
        for (int k = j; k < v2.size(); k++) 
            v.add(v2.elementAt(k)); 
        return v; 
    } 
  
    // Procedure to build the segment tree 
    static void buildTree(Vector<Integer>[] tree, int[] arr,  
                        int index, int s, int e)  
    { 
  
        // Reached the leaf node 
        // of the segment tree 
        if (s == e)  
        { 
            tree[index].add(arr[s]); 
            return; 
        } 
  
        // Recursively call the buildTree 
        // on both the nodes of the tree 
        int mid = (s + e) / 2; 
        buildTree(tree, arr, 2 * index, s, mid); 
        buildTree(tree, arr, 2 * index + 1, mid + 1, e); 
  
        // Storing the final vector after merging 
        // the two of its sorted child vector 
        tree[index] = merge(tree[2 * index], tree[2 * index + 1]); 
    } 
  
    // Query procedure to get the answer 
    // for each query l and r are query range 
    static int query(Vector<Integer>[] tree, int index, int s,  
                    int e, int l, int r, int k)  
    { 
  
        // out of bound or no overlap 
        if (r < s || l > e) 
            return 0; 
  
        // Complete overlap 
        // Query range completely lies in 
        // the segment tree node range 
        if (s >= l && e <= r) 
        { 
              
            // binary search to find index of k 
            return (tree[index].size() - lowerBound(tree[index],  
                    tree[index].size(), k)); 
        } 
  
        // Partially overlap 
        // Query range partially lies in 
        // the segment tree node range 
        int mid = (s + e) / 2; 
        return (query(tree, 2 * index, s, mid, l, r, k) +  
                query(tree, 2 * index + 1, mid + 1, e, l, r, k)); 
    } 
  
    // Function to perform the queries 
    static void performQueries(int L[], int R[], int K[],  
                        int n, int q, Vector<Integer> tree[]) 
    { 
        for (int i = 0; i < q; i++) 
        { 
            System.out.println(query(tree, 1, 0, n - 1,  
                                    L[i] - 1, R[i] - 1, K[i])); 
        } 
    } 
  
    static int lowerBound(Vector<Integer> array,  
                        int length, int value) 
    { 
        int low = 0; 
        int high = length; 
        while (low < high)  
        { 
            final int mid = (low + high) / 2; 
            if (value <= array.elementAt(mid)) 
            { 
                high = mid; 
            }  
            else
            { 
                low = mid + 1; 
            } 
        } 
        return low; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int arr[] = { 7, 3, 9, 13, 5, 4 }; 
        int n = arr.length; 
        @SuppressWarnings("unchecked") 
        Vector<Integer>[] tree = new Vector[4 * n + 1]; 
        for (int i = 0; i < (4 * n + 1); i++) 
        { 
            tree[i] = new Vector<>(); 
        } 
  
        buildTree(tree, arr, 1, 0, n - 1); 
  
        // 1-based indexing 
        int L[] = { 1, 2 }; 
        int R[] = { 4, 6 }; 
        int K[] = { 6, 8 }; 
  
        // Number of queries 
        int q = L.length; 
  
        performQueries(L, R, K, n, q, tree); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

