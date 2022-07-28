

// Java implementation of the  
// above approach 
class Main  
{ 
   
    // The total number of ways  
    // is equal to the (n+2)th  
    // Fibonacci term, hence we  
    // only need to find that. 
    public static int nth_term(int n) 
    { 
        int a = 1, b = 1, c = 1; 
           
        // Construct fibonacci upto  
        // (n+2)th term the first 
        // two terms being 1 and 1 
        for (int i = 0; i < n; i++)  
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
           
        return c; 
    } 
       
    // Driver program 
    public static void main(String[] args) 
    { 
        // Take input n 
        int n = 10; 
        int c = nth_term(n); 
           
        // printing output 
        System.out.println(c); 
    } 
} 

