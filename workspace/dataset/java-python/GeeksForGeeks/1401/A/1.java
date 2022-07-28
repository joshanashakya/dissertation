

class GFG 
{ 
static int factorial(int n) 
{ 
    int fact = 1; 
    for (int i = 2; i <= n; i++) 
        fact = fact * i ; 
    return (fact); 
} 
  
static int result(int n, int m) 
{ 
    return(factorial(n) -  
           factorial(n - m + 1) *  
           factorial(m)); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    System.out.println(result(5, 3)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

