

// Java implementation of the approach 
class GFG  
{ 
  
static int maxN = 20; 
static int maxM = 64; 
  
// Function to return the required count 
static int cntSplits(String s) 
{ 
    // If the splitting is not possible 
    if (s.charAt(s.length() - 1) == '1') 
        return 0; 
  
    // To store the count of zeroes 
    int c_zero = 0; 
  
    // Counting the number of zeroes 
    for (int i = 0; i < s.length(); i++) 
        c_zero += (s.charAt(i) == '0') ? 1 : 0; 
  
    // Return the final answer 
    return (int)Math.pow(2, c_zero - 1); 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String s = "10010"; 
  
    System.out.println(cntSplits(s)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

