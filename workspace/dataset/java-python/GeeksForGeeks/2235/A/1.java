

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the minimum number 
// of elements that must be removed 
// to make the given array good 
static int minimumRemoval(int n, int a[]) 
{ 
  
    Map<Integer,Integer> c = new HashMap<>(); 
  
    // Count frequency of each element 
    for (int i = 0; i < n; i++) 
        if(c.containsKey(a[i])) 
        { 
            c.put(a[i], c.get(a[i])+1); 
        } 
        else
        { 
            c.put(a[i], 1); 
        } 
  
    int ans = 0; 
  
    // For each element check if there 
    // exists another element that makes 
    // a valid pair 
    for (int i = 0; i < n; i++)  
    { 
        boolean ok = false; 
        for (int j = 0; j < 31; j++) 
        { 
            int x = (1 << j) - a[i]; 
            if ((c.get(x) != null && (c.get(x) > 1)) || 
                c.get(x) != null && (c.get(x) == 1 && x != a[i]))  
            { 
                ok = true; 
                break; 
            } 
        } 
  
        // If does not exist then 
        // increment answer 
        if (!ok) 
            ans++; 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 4, 7, 1, 5, 4, 9 }; 
    int n = a.length; 
    System.out.println(minimumRemoval(n, a)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

