

// Java program to find minimum 
// number of segments required 
import java.io.*; 
  
class GFG { 
      
// Precomputed values of segment  
// used by digit 0 to 9. 
static int []seg = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6}; 
  
// Return the number of segments used by x. 
static int computeSegment(int x) 
{ 
    if (x == 0) 
        return seg[0]; 
  
    int count = 0; 
  
    // Finding sum of the segment used by 
    // each digit of a number. 
    while (x > 0) 
    { 
        count += seg[x % 10]; 
        x /= 10; 
    } 
  
    return count; 
} 
  
static int elementMinSegment(int []arr, int n) 
{ 
    // Initalising the minimum segment  
    // and minimum number index. 
    int minseg = computeSegment(arr[0]); 
    int minindex = 0; 
  
    // Finding and comparing segment used 
    // by each number arr[i]. 
    for (int i = 1; i < n; i++) 
    { 
        int temp = computeSegment(arr[i]); 
  
        // If arr[i] used less segment then update 
        // minimum segment and minimum number. 
        if (temp < minseg) 
        { 
            minseg = temp; 
            minindex = i; 
        } 
    } 
  
    return arr[minindex]; 
} 
  
    // Driver program  
    static public void main (String[] args) 
    { 
       int []arr = {489, 206, 745, 123, 756}; 
       int n = arr.length; 
       System.out.println(elementMinSegment(arr, n)); 
    } 
} 
  
//This code is contributed by vt_m. 

