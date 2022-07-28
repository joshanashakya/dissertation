

// Java program to find the end point of a line 
class GFG { 
      
    // CPP function to find the end point 
    // of a line 
    static void otherEndPoint(int x1, int y1,  
                               int m1, int m2) 
    { 
        // find end point for x cordinates 
        float x2 = (float)(2 * m1 - x1); 
      
        // find end point for y cordinates 
        float y2 = (float)(2 * m2 - y1); 
      
        System.out.println("x2 = " + x2 + ", "
                               + "y2 = " + y2); 
    } 
      
    // Driven Program 
    public static void main(String args[]) 
    { 
        int x1 = -4, y1 = -1, m1 = 3, m2 = 5; 
        otherEndPoint(x1, y1, m1, m2); 
    } 
} 
  
// This code is contributed by JaideepPyne. 

