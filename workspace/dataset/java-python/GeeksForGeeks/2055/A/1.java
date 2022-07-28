

// Java code to check if a  
// circle lies in the ring 
import java.io.*; 
  
class ring 
{ 
    // Function to check if circle  
    // lies in the ring 
    public static boolean checkcircle(int r, int R, 
                            int r1, int x1, int y1) 
    { 
        // distance between center of circle 
        // center of concentric circles(origin) 
        // using Pythagoras theorem 
        int dis = (int)Math.sqrt(x1 * x1 +  
                                 y1 * y1); 
          
         // Condition to check if circle 
         // is strictly inside the ring 
        return (dis - r1 >= R && dis + r1 <= r); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        // Both circle with radius 'r'  
        // and 'R' have center (0,0) 
        int r = 8, R = 4, r1 = 2, x1 = 6, y1 = 0; 
         
        if (checkcircle(r, R, r1, x1, y1)) 
            System.out.println("yes"); 
        else
            System.out.println("no"); 
    } 
} 

