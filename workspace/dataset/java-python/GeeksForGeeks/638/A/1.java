

// A simple Java program to check if 
// n-th Fibonacci number is multiple 
// of 10. 
class Fibonacci 
{ 
    static int fibonacci(int n) 
    { 
        int a = 0; 
        int b=1; 
        int c=0; 
        if (n <= 1) 
            return n; 
          
        for (int i = 2; i<= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
          
        return c; 
    } 
      
    // Returns true if n-th Fibonacci number  
    // is multiple of 10. 
    static boolean isMultipleOf10(int n) 
    { 
        int f = fibonacci(30); 
        return  (f % 10 == 0); 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        int n = 30; 
        if (isMultipleOf10(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}  

