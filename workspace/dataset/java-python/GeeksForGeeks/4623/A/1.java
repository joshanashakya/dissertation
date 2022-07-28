

// Java code to print fibonacci  
// numbers till n using direct formula. 
  
class GFG{ 
  
// Function to calculate fibonacci  
// using recurrence relation formula 
static void fibonacci(double n){ 
    double fib; 
    for (double i = 0; i < n; i++) 
    { 
        // Using direct formula 
        fib = (Math.pow((1 + Math.sqrt(5)), i) -  
            Math.pow((1 - Math.sqrt(5)), i)) /  
            (Math.pow(2, i) * Math.sqrt(5)); 
              
        System.out.print((int)fib+" "); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{  
    double n = 8;  
    fibonacci(n);  
} 
} 
// This code is contributed by mits 

