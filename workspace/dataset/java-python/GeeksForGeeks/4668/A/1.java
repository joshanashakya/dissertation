

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the  
// maximum number of segments 
static int countPoints(int n, int m, int a[], 
                        int[] b, int x, int y) 
{ 
    // Sort both the vectors 
    Arrays.sort(a); 
    Arrays.sort(b); 
  
    // Initially pointing to the first element of b[] 
    int j = 0; 
    int count = 0; 
    for (int i = 0; i < n; i++)  
    { 
  
        // Try to find a match in b[] 
        while (j < m)  
        { 
  
            // The segment ends before b[j] 
            if (a[i] + y < b[j]) 
                break; 
  
            // The point lies within the segment 
            if (b[j] >= a[i] - x && b[j] <= a[i] + y)  
            { 
                count++; 
                j++; 
                break; 
            } 
  
            // The segment starts after b[j] 
            else
                j++; 
        } 
    } 
  
    // Return the required count 
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int x = 1, y = 4; 
    int[] a = { 1, 5 }; 
    int n = a.length; 
    int[] b = { 1, 1, 2 }; 
    int m = a.length; 
    System.out.println(countPoints(n, m, a, b, x, y)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

