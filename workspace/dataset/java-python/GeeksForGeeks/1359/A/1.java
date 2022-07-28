

// Java implementation of the approach 
import java.util.*; 
class GFG { 
  
// Function to find the required prefix sum 
static void prefixSum(int[] p_arr, int[] arr, int n) 
{ 
    p_arr[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
        p_arr[i] = arr[i] + p_arr[i - 1]; 
} 
   
// Function to q all the values of prefix 
// sum array in an unordered map 
static void qPrefixSum(int[]p_arr, int n, HashSet<Integer>q) 
{ 
    for (int i = 0; i < n; i++) 
        q.add(p_arr[i]); 
} 
   
// Function to check if a range 
// can be divided into two equal parts 
static void canDivide(int[] p_arr, int n, 
               HashSet<Integer>q, int l, int r) 
{ 
    // To store the value of sum 
    // of entire range 
    int sum; 
   
    if (l == 0) 
        sum = p_arr[r]; 
    else
        sum = p_arr[r] - p_arr[l - 1]; 
   
    // If value of sum is odd 
    if (sum % 2 == 1) { 
        System.out.println("No"); 
        return; 
    } 
   
    // To store p_arr[l-1] 
    int beg = 0; 
   
    if (l != 0) 
        beg = p_arr[l - 1]; 
   
    // If the value exists in the map 
    if(q.contains(beg + sum / 2) && (beg + sum / 2)!=(int)q.toArray()[ q.size()-1 ] )  
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
   
// Driver code 
 public static void main(String[] args) { 
   int arr[] = { 1, 1, 2, 3 }; 
    int n = arr.length; 
   
    // prefix-sum array 
    int p_arr[] = new int[n]; 
   
    prefixSum(p_arr, arr, n); 
   
    // Map to store the values of prefix-sum 
    HashSet<Integer> q = new HashSet<>(); 
   
    qPrefixSum(p_arr, n, q); 
   
    // Perform queries 
    canDivide(p_arr, n, q, 0, 1); 
    canDivide(p_arr, n, q, 1, 3); 
    canDivide(p_arr, n, q, 1, 2); 
    } 
} 
  
// This code contributed by Rajput-Ji 

