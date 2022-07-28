

// Java implementation of the approach  
class GFG  
{ 
      
    static double[] find_Centroid(double v[][])  
    {  
        double []ans = new double[2];  
          
        int n = v.length;  
        double signedArea = 0;  
          
        // For all vertices  
        for (int i = 0; i < n; i++) 
        {  
              
            double x0 = v[i][0], y0 = v[i][1];  
            double x1 = v[(i + 1) % n][0], y1 = v[(i + 1) % n][1];  
                                  
            // Calculate value of A  
            // using shoelace formula  
            double A = (x0 * y1) - (x1 * y0);  
            signedArea += A;  
              
            // Calculating coordinates of  
            // centroid of polygon  
            ans[0] += (x0 + x1) * A;  
            ans[1] += (y0 + y1) * A;  
        }  
      
        signedArea *= 0.5;  
        ans[0] = (ans[0]) / (6 * signedArea);  
        ans[1]= (ans[1]) / (6 * signedArea);  
      
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        // Coordinate of the vertices  
        double vp[][] = { { 1, 2 },  
                            { 3, -4 },  
                            { 6, -7 } };  
                                              
        double []ans = find_Centroid(vp);  
          
        System.out.println(ans[0] + " " + ans[1]);  
    }  
} 
  
// This code is contributed by AnkitRai01 

