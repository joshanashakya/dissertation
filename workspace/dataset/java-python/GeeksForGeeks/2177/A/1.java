

// Java implementation of above approach 
  
  
class GFG{ 
   
// Function calculate cummalative sum 
// of x, y, x^2, y^2 coordinates. 
static void cumm(int [] x, int [] y, 
        int [] cummx, int [] cummy, 
        int [] cummx2, int [] cummy2, int n) 
{ 
    for (int i = 1; i <= n; i++) { 
        cummx[i] = cummx[i - 1] + x[i]; 
        cummy[i] = cummy[i - 1] + y[i]; 
        cummx2[i] = cummx2[i - 1] + x[i] * x[i]; 
        cummy2[i] = cummy2[i - 1] + y[i] * y[i]; 
    } 
} 
   
// Function ot calculate the hammered distance 
static int calHammeredDistance(int n, int [] x, int [] y) 
{ 
    // cummx conatins cummulative sum of x 
    // cummy conatins cummulative sum of y 
    int []cummx = new int[n + 1]; 
    int []cummy = new int[n + 1]; 
   
    // cummx2 conatins cummulative sum of x^2 
    // cummy2 conatins cummulative sum of y^2 
    int []cummx2 = new int[n + 1]; 
    int []cummy2 = new int[n + 1]; 
   
    // calculate cummalative of x 
    //, y, x^2, y^2, because these terms 
    // required in formula to reduce complexity. 
   
    // this function calculate all required terms. 
    cumm(x, y, cummx, cummy, cummx2, cummy2, n); 
   
    // hdx calculate hammer distance for x coordinate 
    // hdy calculate hammer distance for y coordinate 
    int hdx = 0, hdy = 0; 
   
    for (int i = 1; i <= n; i++) { 
   
        // came from formula describe in explanation 
        hdx += (i - 1) * x[i] * x[i] + cummx2[i - 1] 
               - 2 * x[i] * cummx[i - 1]; 
   
        // came from formula describe in explanation 
        hdy += (i - 1) * y[i] * y[i] + cummy2[i - 1] 
               - 2 * y[i] * cummy[i - 1]; 
    } 
   
    // total is the sum of both x and y. 
    int total = hdx + hdy; 
    return total; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // number of points 
    int n = 3; 
   
    // x contains the x coordinates 
    // y conatins the y coordinates 
    int []x = new int[n + 1]; 
    int []y = new int[n + 1]; 
    x[2] = 1; 
    y[0] = 1; 
   
    System.out.print(calHammeredDistance(n, x, y)); 
   
} 
} 
  
// This code contributed by Rajput-Ji 

