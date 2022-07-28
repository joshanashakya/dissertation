

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the smallest n-digit 
// number which is a perfect fourth power 
static int cal(int n) 
{ 
    double res = Math.pow(Math.ceil(( 
                 Math.pow(Math.pow(10,  
                (n - 1)), 1 / 4) )), 4); 
    return (int)res; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 1; 
    System.out.println(cal(n)); 
} 
} 
  
// This code is contributed by CodeMech 

