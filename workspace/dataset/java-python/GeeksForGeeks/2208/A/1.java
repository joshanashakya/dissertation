

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the count of equal 
// elements to the right - count of equal 
// elements to the left for each of the element 
static void right_left(int a[], int n) 
{ 
  
    // Maps to store the frequency and same 
    // elements to the left of an element 
    Map<Integer, Integer> total = new HashMap<>(); 
    Map<Integer, Integer> left = new HashMap<>(); 
  
    // Count the frequency of each element 
    for (int i = 0; i < n; i++) 
        total.put(a[i],  
        total.get(a[i]) == null ? 1 :  
        total.get(a[i]) + 1); 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // Print the answer for each element 
        System.out.print((total.get(a[i]) - 1 -  
                         (2 * (left.containsKey(a[i]) == true ?  
                               left.get(a[i]) : 0))) + " "); 
  
        // Increment it's left frequency 
        left.put(a[i],  
        left.get(a[i]) == null ? 1 :  
        left.get(a[i]) + 1); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 2, 3, 2, 1 }; 
    int n = a.length; 
  
    right_left(a, n); 
} 
} 
  
// This code is contributed by Princi Singh 

