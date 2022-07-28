

// Java program to count the number of segments 
// in which all elements are greater than X 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to count number of segments 
static int countSegments(int a[], int n, int x) 
{ 
    boolean flag = false; 
  
    int count = 0; 
  
    // Iterate in the array 
    for (int i = 0; i < n; i++) { 
  
        // check if array element 
        // greater then X or not 
        if (a[i] > x) { 
            flag = true; 
        } 
        else { 
  
            // if flag is true 
            if (flag) 
                count += 1; 
  
            flag = false; 
        } 
    } 
  
    // After iteration complete 
    // check for the last segment 
    if (flag) 
        count += 1; 
  
    return count; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
        int a[] = { 8, 25, 10, 19, 19, 18, 20, 11, 18 }; 
    int n =a.length; 
    int x = 13; 
    System.out.println(countSegments(a, n, x)); 
    } 
} 
// This code is contributed by anuj_67.. 

