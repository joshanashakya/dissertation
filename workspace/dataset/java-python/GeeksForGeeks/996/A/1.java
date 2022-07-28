

// Java program to perform Q queries 
// to find longest subsequence whose 
// average is less than K 
import java.util.Arrays; 
  
class GFG  
{ 
  
    // Function to print the length for evey query 
    static void longestSubsequence(int a[], int n,  
                                    int q[], int m) 
    { 
  
        // sort array of N elements 
        Arrays.sort(a); 
        int sum = 0; 
  
        // Array to store average from left 
        int []b = new int[n]; 
  
        for (int i = 0; i < n; i++) 
        { 
            sum += a[i]; 
            double av = (double)(sum) / (double)(i + 1); 
            b[i] = ((int)(av + 1)); 
        } 
  
        // Sort array of average 
        Arrays.sort(b); 
  
        // number of queries 
  
        for (int i = 0; i < m; i++)  
        { 
            int k = q[i]; 
  
            // print answer to every query 
            // using binary search 
            int longest = upperBound(b,0, n, k); 
  
            System.out.println("Answer to Query" + (i + 1) +": "
                + longest); 
        } 
    } 
    private static int upperBound(int[] a, int low, int high, int element) 
    { 
        while(low < high) 
        { 
            int middle = low + (high - low)/2; 
            if(a[middle] > element) 
                high = middle; 
            else
                low = middle + 1; 
        } 
        return low; 
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        int a[] = { 1, 3, 2, 5, 4 }; 
        int n = a.length; 
  
        // 4 queries 
        int q[] = { 4, 2, 1, 5 }; 
        int m = q.length; 
  
        longestSubsequence(a, n, q, m);  
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

