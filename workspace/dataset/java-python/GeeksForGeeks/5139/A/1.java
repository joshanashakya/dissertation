

// Java Program to print  
// single line command to 
// find the GCD of n integers 
class GFG 
{ 
      
// Function to print single  
// line command to find GCD  
// of n elements. 
static String recursiveFun(int n) 
{ 
    // base case 
    if (n == 1) 
        return "int"; 
  
    // Recursive Step 
    return "gcd(int, " +  
            recursiveFun(n - 1) + ")"; 
} 
  
// Driver Code 
public static void main(String [] arg) 
{ 
    int n = 5; 
  
    System.out.println(recursiveFun(n)); 
} 
} 
  
// This code is contributed  
// by Smitha 

