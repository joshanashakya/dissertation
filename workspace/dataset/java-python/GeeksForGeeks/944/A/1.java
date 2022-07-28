

// Java implementation of the approach 
class GFG 
{ 
static int maxLen = 30; 
  
// Array to store segment-tree 
static int []seg = new int[3 * maxLen]; 
  
// Function to build segment-tree to 
// answer range GCD queries 
static int build(int l, int r,  
                 int in, int[] arr) 
{ 
    // Base-case 
    if (l == r) 
        return seg[in] = arr[l]; 
  
    // Mid element of the range 
    int mid = (l + r) / 2; 
  
    // Merging the result of left and right sub-tree 
    return seg[in] = __gcd(build(l, mid, 2 * in + 1, arr), 
                           build(mid + 1, r, 2 * in + 2, arr)); 
} 
  
// Function to perform range GCD queries 
static int query(int l, int r,  
                 int l1, int r1, int in) 
{ 
    // Base-cases 
    if (l1 <= l && r <= r1) 
        return seg[in]; 
    if (l > r1 || r < l1) 
        return 0; 
  
    // Mid-element 
    int mid = (l + r) / 2; 
  
    // Calling left and right child 
    return __gcd(query(l, mid, l1, r1, 2 * in + 1), 
                 query(mid + 1, r, l1, r1, 2 * in + 2)); 
} 
  
// Function to find the required length 
static int findLen(int []arr, int n) 
{ 
    // Building the segment tree 
    build(0, n - 1, 0, arr); 
  
    // Two pointer variables 
    int i = 0, j = 0; 
  
    // To store the final answer 
    int ans = Integer.MAX_VALUE; 
  
    // Looping 
    while (i < n) 
    { 
  
        // Incrementing j till we don't get 
        // a gcd value of 1 
        while (j < n && query(0, n - 1,  
                              i, j, 0) != 1) 
            j++; 
  
        if (j == n) 
            break; 
  
        // Updating the final answer 
        ans = Math.min((j - i + 1), ans); 
  
        // Incrementing i 
        i++; 
  
        // Updating j 
        j = Math.max(j, i); 
    } 
  
    // Returning the final answer 
    if (ans == Integer.MAX_VALUE) 
        return -1; 
    else
        return ans; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0 ? a : __gcd(b, a % b);      
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 2, 2 }; 
    int n = arr.length; 
  
    System.out.println(findLen(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

