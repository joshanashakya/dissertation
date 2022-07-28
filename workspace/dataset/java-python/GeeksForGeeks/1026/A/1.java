

// A Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static int []status = new int[100000]; 
  
// Function to return the required 
// number of steps 
static int countSteps(int[]val, int n) 
{ 
    int sol = 0; 
    Vector<Integer> vec = new Vector<>(1); 
    vec.add(0); 
    status[0] = -1; 
  
    // Compute the number of steps 
    for (int i = 1; i < n; ++i)  
    { 
  
        // Current status is to 
        // delete in first step 
        status[i] = 0; 
  
        // Pop the indices while 
        // condition is satisfied 
        while (vec.size() > 0
            && val[vec.lastElement()] >= val[i]) 
        { 
  
            // Inserting the correct 
            // step no to delete 
            status[i] = Math.max(status[i], 
                            status[vec.lastElement()] + 1); 
            vec.remove(vec.lastElement()); 
        } 
        if (vec.isEmpty()) 
        { 
  
            // Status changed to not delete 
            status[i] = -1; 
        } 
  
        // Pushing a new index in the vector 
        vec.add(i); 
  
        // Build the solution from 
        // smaller to larger size 
        sol = Math.max(sol, status[i] + 1); 
    } 
    return sol; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int val[] = { 6, 5, 8, 4, 7, 10, 9 }; 
    int n = val.length; 
  
    System.out.println(countSteps(val, n)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

