

// Java implementation of the approach 
class GFG 
{ 
  
static final int MAX = 15; 
  
static int tree[] = new int[MAX]; 
static boolean lazy[] = new boolean[MAX]; 
  
// Function to build the segment tree 
static void build(int arr[],int node, int a, int b) 
{ 
    if (a == b) 
    { 
        tree[node] = arr[a]; 
        return; 
    } 
  
    // left child 
    build(arr,2 * node, a, (a + b) / 2);  
  
    // right child 
    build(arr,2 * node + 1, 1 + (a + b) / 2, b);  
  
    tree[node] = tree[node * 2] +  
                        tree[node * 2 + 1]; 
} 
  
static void update_tree(int node, int a,  
                int b, int i, int j) 
{ 
  
    // If lazy of node is 1 then  
    // value in current node  
    // needs to be flipped 
    if (lazy[node] != false)  
    { 
  
        // Update it 
        tree[node] = tree[node] * (-1);  
  
        if (a != b) 
        { 
  
            // flip value in lazy 
            lazy[node * 2] = 
                        !(lazy[node * 2]);  
  
            // flip value in lazy 
            lazy[node * 2 + 1] =  
                    !(lazy[node * 2 + 1]); 
        } 
      
        // Reset the node lazy value 
        lazy[node] = false;  
    } 
  
    // Current segment is not 
    // within range [i, j] 
    if (a > b || a > j || b < i) 
        return; 
  
    // Segment is fully 
    // within range 
    if (a >= i && b <= j)  
    { 
        tree[node] = tree[node] * (-1); 
  
        // Not leaf node 
        if (a != b)  
        { 
  
            // Flip the value as if lazy is  
            // 1 and again asked to flip  
            // value then without flipping  
            // value two times 
            lazy[node * 2] =  
                        !(lazy[node * 2]); 
            lazy[node * 2 + 1] =  
                    !(lazy[node * 2 + 1]); 
        } 
  
        return; 
    } 
  
    // Updating left child 
    update_tree(node * 2, a, 
                        (a + b) / 2, i, j); 
  
    // Updating right child 
    update_tree(1 + node * 2, 1 +  
                    (a + b) / 2, b, i, j);  
  
    // Updating root with  
    // sum of its child 
    tree[node] = tree[node * 2] + 
                    tree[node * 2 + 1]; 
} 
  
static int query_tree(int node, int a,  
                    int b, int i, int j) 
{ 
    // Out of range  
    if (a > b || a > j || b < i) 
        return 0; 
  
    // If lazy of node is 1 then value 
    // in current node needs to be flipped 
    if (lazy[node] != false)  
    { 
  
      
        tree[node] = tree[node] * (-1);  
        if (a != b) 
        { 
            lazy[node * 2] =  
                        !(lazy[node * 2]);  
  
            // flip value in lazy 
            lazy[node * 2 + 1] =  
                    !(lazy[node * 2 + 1]);  
        } 
  
        lazy[node] = false; 
    } 
  
    // Current segment is totally  
    // within range [i, j] 
    if (a >= i && b <= j) 
        return tree[node]; 
      
    // Query left child 
    int q1 = query_tree(node * 2, a, 
                        (a + b) / 2, i, j);  
  
    // Query right child 
    int q2 = query_tree(1 + node * 2,  
                1 + (a + b) / 2, b, i, j);  
  
    // Return final result 
    return q1 + q2; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    int arr[]={1, 2, 3, 4, 5}; 
  
    int n=arr.length; 
  
    // Building segment tree 
    build(arr,1, 0, n - 1); 
  
    // Array is { 1, 2, 3, 4, 5 } 
    System.out.print(query_tree(1, 0, n - 1, 0, 4) +"\n"); 
  
    // Flip range 0 to 4 
    update_tree(1, 0, n - 1, 0, 4); 
  
    // Array becomes { -1, -2, -3, -4, -5 } 
    System.out.print(query_tree(1, 0, n - 1, 0, 4) +"\n"); 
  
    // Flip range 0 t0 2 
    update_tree(1, 0, n - 1, 0, 2); 
  
    // Array becomes { 1, 2, 3, -4, -5 } 
    System.out.print(query_tree(1, 0, n - 1, 0, 4) +"\n"); 
} 
} 
  
// This code contributed by Rajput-Ji 

