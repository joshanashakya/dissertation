

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to map numbers using  
// coordinate compression 
static void coordinateCompression(int arr[], 
                                  int n) 
{ 
  
    // Set will store 
    // all unique numbers 
    Set<Integer> s = new HashSet<>(); 
    for (int i = 0; i < n; i++)  
    { 
        s.add(arr[i]); 
    } 
  
    // Map will store 
    // the new elements 
    int index = 0; 
    HashMap<Integer, Integer> mp = 
         new HashMap<Integer, Integer>(); 
  
    for (int itr : s) 
    { 
        // For every new number in the set, 
        index++; 
          
        // Increment the index of the 
        // current number and store it 
        // in a hashmap. Here index 
        // for every element is the 
        // new value with with the 
        // current element is replaced 
        mp.put(itr, index); 
    } 
    for (int i = 0; i < n; i++)  
    { 
        // now change the current element  
        // to range 1 to N. 
        arr[i] = mp.get(arr[i]);  
    } 
} 
  
// Function to calculate length of maximum 
// increasing sequence till i'th index 
static int query(int BIT[], int index, int n) 
{ 
    int ans = 0; 
    while (index > 0) 
    { 
        ans = Math.max(ans, BIT[index]); 
          
        // Go to parent node 
        index -= index & (-index); 
    } 
    return ans; 
} 
  
// Function for updating BIT array for  
// maximum increasing sequence till 
// i'th index 
static void update(int BIT[], 
                   int index, int n) 
{ 
  
    // If 4 is inserted in BIT, 
    // check for maximum length 
    // subsequence till element 3. 
    // Let this subsequence length be x. 
    // If x + 1 is greater than 
    // the current element in BIT, 
    // update the BIT array 
    int x = query(BIT, index - 1, n); 
    int value = x + 1; 
    while (index <= n)  
    { 
  
        // Store maximum length subsequence length  
        // till index. Here index is the 
        // coordinate compressed element 
        BIT[index] = Math.max(BIT[index], value); 
  
        // Go to child node and update that node 
        index += index & (-index); 
    } 
} 
  
// Function to calculate maximum  
// Longest Increasing Sequene length 
static int findLISLength(int arr[], int n) 
{ 
  
    coordinateCompression(arr, n); 
    int []BIT = new int[n + 1]; 
  
    // Intialising BIT array 
    for (int i = 0; i <= n; i++)  
    { 
        BIT[i] = 0; 
    } 
  
    for (int i = 0; i < n; i++) 
    { 
        // Add elements from left to right 
        // in BIT 
        update(BIT, arr[i], n); 
    } 
  
    int ans = query(BIT, n, n); 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 6, 5, 1, 3, 2, 4, 8, 7 }; 
    int n = arr.length; 
    int ans = findLISLength(arr, n); 
  
    System.out.println(ans); 
} 
} 
  
// This code is contributed by Rajput-Ji 

