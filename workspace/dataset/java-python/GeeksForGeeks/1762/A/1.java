

// Java code to find intersection when 
// elements may not be distinct 
  
import java.io.*; 
  
class GFG { 
      
// Function to find intersection 
static void intersection(int a[], int b[], int n, int m) 
{ 
    int i = 0, j = 0; 
      
    while (i < n && j < m)  
    { 
                  
        if (a[i] > b[j])  
        { 
            j++; 
        }  
                  
        else
        if (b[j] > a[i])  
        { 
            i++; 
        }  
        else
        { 
            // when both are equal 
            System.out.print(a[i] + " "); 
            i++; 
            j++; 
        } 
    } 
} 
  
// Driver Code 
    public static void main (String[] args) { 
    int a[] = {1, 2, 3, 3, 4, 5, 5, 6}; 
    int b[] = {3, 3, 5}; 
      
    int n = a.length; 
    int m = b.length; 
    intersection(a, b, n, m); 
    } 
} 

