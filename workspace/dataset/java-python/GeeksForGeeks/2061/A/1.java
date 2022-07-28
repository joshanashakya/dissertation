

// java program to find if its possible  
// to rotate page or not 
import java.util.Arrays; 
  
class GFG { 
          
    // function to find if it's possible 
    // to rotate page or not 
    static void possibleOrNot(long a1,long a2, 
                              long b1,long b2,  
                              long c1,long c2) 
    { 
          
        // Calulating distance b/w points 
        long dis1 = (long)Math.pow(b1 - a1, 2) +  
                    (long) Math.pow(b2 - a2, 2); 
                      
        long dis2 = (long)Math.pow(c1 - b1, 2) +  
                     (long)Math.pow(c2 - b2, 2); 
      
        // If distance is not equal 
        if(dis1 != dis2) 
            System.out.print("No"); 
              
        // If the points are in same line 
        else if (b1 == ((a1 + c1) / 2.0) &&  
                       b2 == ((a2 + c2) / 2.0)) 
            System.out.print("No"); 
        else
            System.out.print("Yes"); 
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
          
        // Points a, b, and c 
        long a1 = 1, a2 = 0, b1 = 2, 
                b2 = 0, c1 = 3, c2 = 0; 
                  
        possibleOrNot(a1, a2, b1, b2, c1, c2); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

