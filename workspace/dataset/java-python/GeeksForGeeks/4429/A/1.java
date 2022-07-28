

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the maximum length array 
static void maxLengthArr(int x, int y) 
{ 
    // To store if an element is 
    // already taken or not 
    boolean[] ex = new boolean[(1 << x)]; 
  
    // To store visited numbers 
    ex[0] = true; 
    Vector<Integer> pre = new Vector<Integer>(); 
    pre.add(0); 
      
    // For all possible values of pre[] 
    for (int i = 1; i < (1 << x); i++)  
    { 
  
        // If it is already taken 
        if (ex[i ^ y]) 
            continue; 
  
        pre.add(i); 
        ex[i] = true; 
    } 
  
    // Not possible 
    if (pre.size() == 1) 
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // Print the array constructing it 
    // from the prefix-xor array 
    for (int i = 1; i < pre.size(); i++) 
        System.out.print((pre.get(i) ^ 
                          pre.get(i - 1)) + " "); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int X = 3, Y = 5; 
  
    maxLengthArr(X, Y); 
} 
} 
  
// This code is contributed by 29AjayKumar 

