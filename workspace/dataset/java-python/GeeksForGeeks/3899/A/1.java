

// Java program to check if a destination is  
// reachable from source with two movements  
// allowed 
  
class GFG { 
      
    static boolean isReachable(int sx, int sy, 
                                 int dx, int dy) 
    { 
          
        // base case 
        if (sx > dx || sy > dy) 
            return false; 
      
        // current point is equal to destination 
        if (sx == dx && sy == dy) 
            return true; 
      
        // check for other 2 possibilities 
        return (isReachable(sx + sy, sy, dx, dy) ||  
                isReachable(sx, sy + sx, dx, dy)); 
    } 
      
    //driver code 
    public static void main(String arg[]) 
    { 
        int source_x = 2, source_y = 10; 
        int dest_x = 26, dest_y = 12; 
        if (isReachable(source_x, source_y, dest_x, 
                                           dest_y)) 
            System.out.print("True\n"); 
        else
            System.out.print("False\n"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

