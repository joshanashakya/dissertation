

// Java implementation of the approach 
class GFG  
{ 
      
// Assign roots of the pell's  
// equation to p and q 
static double p = ((1 + Math.sqrt(5)) / 2); 
static double q = ((1 - Math.sqrt(5)) / 2); 
  
// Function to return the  
// nth fibonacci number 
static int fib(int n) 
{ 
    int i = n - 1; 
    int x = (int) ((Math.pow(p, i) -  
                    Math.pow(q, i)) / (p - q)); 
    return x; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5; 
    System.out.println(fib(n)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

