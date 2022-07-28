

// Java Program to check if the nth is odd or even in a 
// sequence where each term is sum of previous two term 
  
class GFG{ 
// Return if the nth term is even or odd. 
static boolean findNature(int a, int b, int n) 
{ 
    if (n == 0) 
        return (a & 1)==1?true:false; 
  
    if (n == 1) 
        return (b & 1)==1?true:false; 
  
    // If a is even 
    if ((a & 1)==0) { 
  
        // If b is even 
        if ((b & 1)==0)  
            return false; 
          
        // If b is odd 
        else
            return (n % 3 != 0); 
    } 
  
    // If a is odd 
    else { 
        // If b is odd 
        if ((b & 1)==0)  
            return ((n - 1) % 3 != 0); 
  
        // If b is eve 
        else
            return ((n + 1) % 3 != 0); 
    } 
} 
  
// Driven Program 
public static void main(String[] args) 
{ 
    int a = 2, b = 4; 
    int n = 3; 
  
    if(findNature(a, b, n)) 
    System.out.println("Odd"); 
    else
    System.out.println("Even"); 
  
} 
} 
// This Code is contributed by mits 

