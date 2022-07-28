

// java program to find any one of them 
// can overtake the other 
import java.util.Arrays; 
  
public class GFG { 
      
    // function to find if any one of 
    // them can overtake the other 
    static boolean sackRace(int p1, int s1, 
                            int p2, int s2) 
    { 
      
        // Since starting points are  
        // always different, they will 
        // meet if following conditions 
        // are met. 
        // (1) Speeds are not same 
        // (2) Difference between speeds 
        // divide the total distance  
        // between initial points.  
        return ( (s1 > s2 && (p2 - p1) % 
                    (s1 - s2) == 0) || 
                    (s2 > s1 && (p1 - p2) 
                    % (s2 - s1) == 0)); 
    } 
      
    public static void main(String args[]) 
    { 
        int p1 = 4, s1 = 4, p2 = 8, s2 = 2; 
          
        if(sackRace(p1, s1, p2, s2)) 
            System.out.println("Yes" ); 
        else
            System.out.println("No"); 
  
    } 
} 
  
// This code is contributed by Sam007. 

