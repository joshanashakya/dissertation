

// Java to check whether  
// the number has only 
// first and last bits set 
  
class GFG 
{ 
// function to check whether 
// the number has only 
// first and last bits set 
static boolean onlyFirstAndLastAreSet(int n) 
{ 
    if (n == 1) 
        return true; 
    if (n == 2) 
        return false; 
    return (((n - 1) &  
             (n - 2)) == 0); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 9; 
    if (onlyFirstAndLastAreSet(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed 
// by Smitha 

