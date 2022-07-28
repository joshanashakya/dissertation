

// Java program to create a sorted array 
// using Binary Search 
import java.util.*; 
  
class GFG 
{ 
  
// Function to create a new sorted array 
// using Binary Search 
static void createSorted(int a[], int n) 
{ 
    // Auxilary Array 
    Vector<Integer> b = new Vector<>(); 
  
    for (int j = 0; j < n; j++) 
    { 
        // if b is empty any element can be at 
        // first place 
        if (b.isEmpty()) 
            b.add(a[j]); 
        else 
        { 
  
            // Perform Binary Search to find the correct 
            // position of current element in the 
            // new array 
            int start = 0, end = b.size() - 1; 
  
            // let the element should be at first index 
            int pos = 0; 
  
            while (start <= end)  
            { 
  
                int mid = start + (end - start) / 2; 
  
                // if a[j] is already present in the new array 
                if (b.get(mid) == a[j]) 
                { 
                    // add a[j] at mid+1. you can add it at mid 
                    b.add((Math.max(0, mid + 1)), a[j]); 
                    break; 
                } 
                  
                // if a[j] is lesser than b[mid] go right side 
                else if (b.get(mid) > a[j]) 
                    // means pos should be between start and mid-1 
                    pos = end = mid - 1; 
                else
                    // else pos should be between mid+1 and end 
                    pos = start = mid + 1; 
  
                // if a[j] is the largest push it at last 
                if (start > end)  
                { 
                    pos = start; 
                    b.add(Math.max(0, pos), a[j]); 
  
                    // here max(0, pos) is used because sometimes 
                    // pos can be negative as smallest duplicates 
                    // can be present in the array 
                    break; 
                } 
            } 
        } 
    } 
  
    // Print the new generated sorted array 
    for (int i = 0; i < n; i++) 
        System.out.print(b.get(i) + " "); 
} 
  
// Driver Code 
public static void main(String args[])  
{ 
    int a[] = { 2, 5, 4, 9, 8 }; 
    int n = a.length; 
  
    createSorted(a, n); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

