

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static void maxSum(int []a, int n) 
{ 
    Vector<Integer> l = new Vector<Integer>(); 
      
    // To store sum 
    int s = 0; 
  
    // To store ending indices  
    // of the chosen prefix array vect 
    for (int i = 0; i < n; i++) 
    { 
  
        // Adding the absolute  
        // value of a[i] 
        s += Math.abs(a[i]); 
        if (a[i] >= 0) 
            continue; 
  
        // If i == 0 then there is no index  
        // to be flipped in (i-1) position 
        if (i == 0) 
            l.add(i + 1); 
        else
        { 
            l.add(i + 1); 
            l.add(i); 
        } 
    } 
  
    // print the maximised sum 
    System.out.println(s); 
  
    // print the ending indices  
    // of the chosen prefix arrays 
    for (int i = 0; i < l.size(); i++) 
    System.out.print(l.get(i) + " "); 
} 
  
// Driver Code  
public static void main(String[] args)  
{ 
    int n = 4; 
    int a[] = {1, -2, -3, 4}; 
    maxSum(a, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

