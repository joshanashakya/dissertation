

// Java program to find log(a) on 
// any base b using Recursion 
class GFG 
{ 
      
    // Recursive function to compute 
    // log a to the base b 
    static int log_a_to_base_b(int a, int b) 
    { 
        int rslt = (a > b - 1)? 1 + log_a_to_base_b(a / b, b): 0; 
        return rslt; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int a = 3; 
        int b = 2; 
        System.out.println(log_a_to_base_b(a, b)); 
      
        a = 256; 
        b = 4; 
        System.out.println(log_a_to_base_b(a, b)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

