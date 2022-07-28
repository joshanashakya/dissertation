

// Java program to check if m can  
// be represented as powers of w. 
  
class GFG 
{ 
    static boolean asPowerSum(int w, int m) 
    { 
        while (m > 0)  
        { 
            if ((m - 1) % w == 0)  
                m = (m - 1) / w; 
              
            else if ((m + 1) % w == 0)  
                m = (m + 1) / w; 
              
            else if (m % w == 0)  
                m = m / w; 
              
            else
                break; // None of 3 worked. 
        } 
      
        // If m is not zero means, it can't be  
        // represented in terms of powers of w. 
        return (m == 0); 
    }  
      
    // Driver function 
    public static void main (String[] args) 
    { 
        int w = 3, m = 7; 
        if (asPowerSum(w, m)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");  
    } 
} 
  
// This code is contributed by Anant Agarwal. 

