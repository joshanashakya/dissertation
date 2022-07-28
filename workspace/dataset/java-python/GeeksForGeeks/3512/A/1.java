

// Java program to count minimum  
// steps to reduce a number 
class Geeks { 
  
static int countways(int n) 
{ 
    if (n == 1) 
        return 0; 
    else if (n % 2 == 0) 
        return 1 + countways(n / 2); 
    else
        return 1 + Math.min(countways(n - 1), 
                            countways(n + 1)); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 15; 
  
    System.out.println(countways(n)); 
  
} 
} 
  
// This code is contributed by ankita_saini 

