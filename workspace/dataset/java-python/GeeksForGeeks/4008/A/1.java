

// Java program of above approach 
class GFG { 
  
    static void swap(int xp, int yp) 
    { 
        if (xp == yp) // Check if the two addresses are same 
            return; 
        xp = xp + yp; 
        yp = xp - yp; 
        xp = xp - yp; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int x = 10; 
        swap(x, x); 
        System.out.println("After swap(&x, &x): x = " + x); 
    } 
} 
  
// This code is Contributed by Code_Mech. 

