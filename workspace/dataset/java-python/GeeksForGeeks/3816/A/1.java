

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the chosen indices 
static Vector<Integer> solve(int X, Vector<Integer> A) 
{ 
    int min = Integer.MAX_VALUE; 
    int ind = -1; 
  
    for (int i = 0; i < A.size(); i++)  
    { 
        if (A.get(i) < min)  
        { 
            min = A.get(i); 
            ind = i; 
        } 
    } 
  
    // Maximum indices chosen 
    int maxIndChosen = X / min; 
  
    Vector<Integer> ans = new Vector<>(); 
  
    if (maxIndChosen == 0)  
    { 
        return ans; 
    } 
  
    for (int i = 0; i < maxIndChosen; i++)  
    { 
        ans.add(ind); 
    } 
  
    int temp = maxIndChosen; 
    int sum = maxIndChosen * A.get(ind); 
  
    // Try to replace the first element in ans by i, 
    // making the order lexicographically smaller 
    for (int i = 0; i < ind; i++) { 
  
        // If no further replacement possible return 
        if (sum - X == 0 || temp == 0) 
            break; 
  
        // If found an index smaller than ind and sum 
        // not exceeding X then remove index of smallest 
        // value from ans and then add index i to ans 
        while ((sum - A.get(ind) + A.get(i)) <= X && temp != 0)  
        { 
            ans.remove(0); 
            ans.add(i); 
            temp--; 
            sum += (A.get(i) - A.get(ind)); 
        } 
    } 
  
    Collections.sort(ans); 
  
    return ans; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    Integer arr[] = { 5, 6, 4, 8 }; 
    Vector<Integer> A = new Vector<Integer>(Arrays.asList(arr)); 
    int X = 18; 
  
    Vector<Integer> ans = solve(X, A); 
  
    // Print the chosen indices 
    for (int i = 0; i < ans.size(); i++) 
        System.out.print(ans.get(i)+" "); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

