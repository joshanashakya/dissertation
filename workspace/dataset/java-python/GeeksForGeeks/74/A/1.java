

// Java program to remove all the 
// characters other then alphabets 
class GFG { 
      
    static boolean isPower(int n) 
    { 
        // Find Log n in different 
        // bases and check if the  
        // value is an integer 
        for (int x = 2; x <=  
               (int)Math.sqrt(n); x++)  
        { 
            float f = (float)Math.log(n) /  
                      (float) Math.log(x); 
                        
            if ((f - (int)f) == 0.0)  
                return true;      
        } 
        return false; 
    } 
      
    // Driver code  
    public static void main(String args[]) 
    { 
        for (int i = 2; i < 100; i++) 
            if (isPower(i)) 
                System.out.print( i + " "); 
    } 
} 
  
// This code is contributed by Sam007 

