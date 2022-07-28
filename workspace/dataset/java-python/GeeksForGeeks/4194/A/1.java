

// Java Program to find the 180 degree  
// reflection of one point around  
// another point. 
class GFG { 
      
    static void findPoint(int x1, int y1, 
                          int x2, int y2) 
    { 
        System.out.println("(" + (int)(2 * x2 - x1) 
               + "," + (int)(2 * y2 - y1 ) + " )"); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int x1 = 0, y1 = 0, x2 = 1, y2 = 1; 
          
        findPoint(x1, y1, x2, y2); 
    } 
} 
  
// This code is contributed by Arnab Kundu. 

