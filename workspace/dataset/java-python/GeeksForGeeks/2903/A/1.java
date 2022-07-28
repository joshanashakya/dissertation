

// Java program to print all pairs 
class GFG 
{ 
// Function to print all pairs 
static boolean checkPairs(int l, int r) 
{ 
    // check if even 
    if ((l - r) % 2 == 0)  
        return false; 
  
    /* We can print all adjacent pairs 
    for (int i = l; i < r; i += 2)  
    { 
        System.out.print("{"+i+", "+i + 1+"}, "); 
    } */
      
    return true; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int l = 1, r = 8; 
    if (checkPairs(l, r)) 
    System.out.println("Yes"); 
    else
    System.out.println("No"); 
} 
} 
  
// This code is contributed by mits 

