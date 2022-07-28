

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to find n positive integers 
// that satisfy the given conditions 
static void findIntegers(int n, int x, int y) 
{ 
  
    // To store n positive integers 
    ArrayList<Integer> ans = new ArrayList<Integer>(); 
  
    // Place N - 1 one's 
    for (int i = 0; i < n - 1; i++) 
        ans.add(1); 
  
    // If can not place (y - (n - 1)) 
    // as the Nth integer 
    if (y - (n - 1) <= 0) 
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // Place Nth integer 
    ans.add(y - (n - 1)); 
  
    // To store the sum of 
    // squares of N integers 
    int store = 0; 
    for (int i = 0; i < n; i++) 
        store += ans.get(i) * ans.get(i); 
  
    // If it is less than x 
    if (store < x)  
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // Print the required integers 
    for (int i = 0; i < n; i++) 
        System.out.print(ans.get(i)+" "); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 3, x = 254, y = 18; 
    findIntegers(n, x, y); 
} 
} 
  
// This code is contributed by mits 

