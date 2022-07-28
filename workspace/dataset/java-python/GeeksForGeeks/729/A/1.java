

// Java program to Find the number of  
// rectangles of size 2*1 can be placed  
// inside a rectangle of size n*m  
  
public class GFG { 
      
    // function to Find the number of  
    // rectangles of size 2*1 can be placed  
    // inside a rectangle of size n*m  
    static int NumberOfRectangles(int n, int m)  
    {  
        // if n is even  
        if (n % 2 == 0)  
            return (n / 2) * m;  
        
        // if m is even  
        else if (m % 2 == 0)  
            return (m / 2) * n;  
        
        // if both are odd  
        return (n * m - 1) / 2;  
    }  
    public static void main(String args[]) 
    { 
         int n = 3, m = 3;  
            
            // function call  
            System.out.println(NumberOfRectangles(n, m));  
            
    } 
    // This Code is contributed by ANKITRAI1 
} 

