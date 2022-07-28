

class GFG  
{ 
    static void swap(int[] xp, int[] yp)  
    { 
        xp[0] = xp[0] ^ yp[0]; 
        yp[0] = xp[0] ^ yp[0]; 
        xp[0] = xp[0] ^ yp[0]; 
    } 
      
    // Driver code  
    public static void main(String[] args)  
    { 
        int[] x = {10}; 
        swap(x, x); 
        System.out.println("After swap(&x, &x): x = " + x[0]); 
    } 
}  
  
// This code is contributed by Rajput-Ji 

