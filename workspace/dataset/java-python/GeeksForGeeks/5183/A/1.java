

// Java implementation of above approach 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// Function to check if 1 is the majority 
// element or not 
static void majority(int a[], int p, int q, int size) 
{ 
    // assuming starting and ending index of 1st subarray 
    int start = 0, ends = q; 
   
    // to store majority of p 
    int []arr = new int[p]; 
   
    // subarrays each of size q ; 
    int k = 0; 
   
    // Loop to calculate total number 
    // of 1's in subarray which will get 
    // stored in array arr[] 
    while (k < p) { 
        int one = 0; 
        for (int j = start; j < ends; j++) { 
            if (a[j] == 1) { 
                one++; 
            } 
        } 
   
        // starting index of next subarray 
        start = ends; 
   
        // ending index of next subarray 
        ends = ends + q; 
   
        // storing 1's 
        arr[k] = one; 
        k++; 
    } 
   
    start = 0; 
    ends = q; 
   
    // variable to keep a check 
    // if 1 is in majority or not 
    boolean  found = false; 
   
    // In this case, we are repeating 
    // the task of calculating 
    // total number of 1's backward 
    while (ends > 0) { 
   
        // to store the total number of 1's 
        int dist_one = 0; 
   
        // Check if 1 is in majority in 
        // this subarray 
        for (int i = 0; i < p; i++) 
            if (arr[i] > q / 2) 
                dist_one++; 
   
        // If 1 is in majority return 
        if (dist_one > p / 2) { 
            found = true; 
            System.out.println( "Yes" ); 
   
            return; 
        } 
   
        // shifting starting index of 
        // subarray by 1 unit leftwards 
        start--; 
   
        // shifting ending index of 
        // subarray by 1 unit leftwards 
        ends--; 
   
        // to ensure it is a valid index 
        // ( array is circular) -1 index means 
        // last index of a circular array 
        if (start < 0) 
            start = size + start; 
   
        int st = start, en = ends,l = 0; 
   
        // now to track changes occur 
        // due to shifting of the subarray 
        while (en < size) { 
   
            if (a[st % size] != a[en % size]) { 
   
                // st refers to starting index of 
                // new subarray and en refers to 
                // last element of same subarray 
                // but in previous iteration 
                if (a[st % size] == 1) 
                    arr[l]++; 
   
                else
                    arr[l]--; 
            } 
            l++; 
   
            // now repeating the same 
            // for other subarrays too 
            st = (st + q); 
            en = en + q; 
        } 
    } 
   
    if (found == false ) { 
        System.out.println( "No" ); 
    } 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    int p = 3, q = 3; 
    int n = p * q; 
   
    int a[] = { 0, 0, 1, 1, 0, 1, 1, 0, 0 }; 
   
    // circular array of given size 
    majority(a, p, q, n); 
   
      
} 
} 

