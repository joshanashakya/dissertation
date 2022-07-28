

// Java program to swap 4 variables  
// without using temporary variable. 
class GFG { 
      
    static void swap(int a, int b, int c, 
                                   int d) 
    { 
          
        // swapping a and b variables 
        a = a + b; 
        b = a - b; 
        a = a - b; 
      
        // swapping b and c variables 
        b = b + c; 
        c = b - c; 
        b = b - c; 
      
        // swapping c and d variables 
        c = c + d; 
        d = c - d; 
        c = c - d; 
      
        System.out.println("values after "
                     + "swapping are : "); 
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 
        System.out.println("c = " + c); 
        System.out.println("d = " + d); 
    } 
      
    // Driver function 
    public static void main(String[] args) 
    { 
          
        // initialising variables 
        int a = 1; 
        int b = 2; 
        int c = 3; 
        int d = 4; 
      
        System.out.println("values before "
                      + "swapping are : "); 
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 
        System.out.println("c = " + c); 
        System.out.println("d = " + d); 
        System.out.println(""); 
        swap(a, b, c, d); 
      
    } 
} 
  
// This code is contributed by Smitha. 

