

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the minimized sum 
static int MinimizeleftOverSum(int a[], int n) 
{ 
    Vector<Integer> v1 = new Vector<Integer>(),  
                    v2 = new Vector<Integer>(); 
    for (int i = 0; i < n; i++) 
    { 
  
        if (a[i] % 2 == 1) 
            v1.add(a[i]); 
        else
            v2.add(a[i]); 
    } 
  
    // If more odd elements 
    if (v1.size() > v2.size()) 
    { 
  
        // Sort the elements 
        Collections.sort(v1); 
        Collections.sort(v2); 
  
        // Left-over elements 
        int x = v1.size() - v2.size() - 1; 
  
        int sum = 0; 
        int i = 0; 
  
        // Find the sum of leftover elements 
        while (i < x) 
        { 
            sum += v1.get(i++); 
        } 
  
        // Return the sum 
        return sum; 
    } 
  
    // If more even elements 
    else if (v2.size() > v1.size()) 
    { 
  
        // Sort the elements 
        Collections.sort(v1); 
        Collections.sort(v2); 
  
        // Left-over elements 
        int x = v2.size() - v1.size() - 1; 
  
        int sum = 0; 
        int i = 0; 
  
        // Find the sum of leftover elements 
        while (i < x) 
        { 
            sum += v2.get(i++); 
        } 
  
        // Return the sum 
        return sum; 
    } 
  
    // If same elements 
    else
        return 0; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 2, 2, 2, 2 }; 
    int n = a.length; 
    System.out.println(MinimizeleftOverSum(a, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

