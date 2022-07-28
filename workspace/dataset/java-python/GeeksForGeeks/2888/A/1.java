

// Java implementation of the approach 
class GFG { 
  
    // Function to find the X and Y intercepts 
    // of the line passing through 
    // the given points 
    static void getXandYintercept(int P[], 
                                  int Q[]) 
    { 
        int a = P[1] - Q[1]; 
        int b = P[0] - Q[0]; 
  
        // if line is parallel to y axis 
        if (b == 0) { 
  
            // x - intercept will be p[0] 
            System.out.println(P[0]);  
  
            // y - intercept will be infinity 
            System.out.println("infinity"); 
            return; 
        } 
  
        // if line is parallel to x axis 
        if (a == 0) { 
  
            // x - intercept will be infinity   
            System.out.println("infinity");  
  
            // y - intercept will be p[1] 
            System.out.println(P[1]);  
            return; 
        } 
  
        // Slope of the line 
        double m = a / (b * 1.0); 
  
        // y = mx + c in where c is unknown 
        // Use any of the given point to find c 
        int x = P[0]; 
        int y = P[1]; 
        double c = y - m * x; 
  
        // For finding the x-intercept put y = 0 
        y = 0; 
        double r = (y - c) / (m * 1.0); 
        System.out.println(r); 
  
        // For finding the y-intercept put x = 0 
        x = 0; 
        y = (int)(m * x + c); 
        System.out.print(c); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int p1[] = { 5, 2 }; 
        int p2[] = { 2, 7 }; 
        getXandYintercept(p1, p2); 
    } 
} 
  
// This code is contributed by kanugargng 

