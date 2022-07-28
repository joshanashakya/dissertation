

// Java program to check if 
// a number is power of 8 
  
class GFG { 
  
    // function to check 
    // if power of 8 
    static boolean checkPowerof8(int n) 
    { 
        /* calculate log8(n) */
        double i = Math.log(n) / Math.log(8); 
  
        /* check if i is an integer or not */
        return (i - Math.floor(i) < 0.000001); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 65; 
        if (checkPowerof8(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Sam007 

