

// Java implementation of the approach 
class GFG 
{ 
  
static class pair 
{  
    double F, S;  
    public pair(double F, double S)  
    {  
        this.F = F;  
        this.S = S;  
    } 
    public pair() { 
    }  
} 
  
// Function to return the minimum distance 
// between a line segment AB and a point E 
static double minDistance(pair A, pair B, pair E) 
{ 
  
    // vector AB 
    pair AB = new pair(); 
    AB.F = B.F - A.F; 
    AB.S = B.S - A.S; 
  
    // vector BP 
    pair BE = new pair(); 
    BE.F = E.F - B.F; 
    BE.S = E.S - B.S; 
  
    // vector AP 
    pair AE = new pair(); 
    AE.F = E.F - A.F; 
    AE.S = E.S - A.S; 
  
    // Variables to store dot product 
    double AB_BE, AB_AE; 
  
    // Calculating the dot product 
    AB_BE = (AB.F * BE.F + AB.S * BE.S); 
    AB_AE = (AB.F * AE.F + AB.S * AE.S); 
  
    // Minimum distance from 
    // point E to the line segment 
    double reqAns = 0; 
  
    // Case 1 
    if (AB_BE > 0)  
    { 
  
        // Finding the magnitude 
        double y = E.S - B.S; 
        double x = E.F - B.F; 
        reqAns = Math.sqrt(x * x + y * y); 
    } 
  
    // Case 2 
    else if (AB_AE < 0) 
    { 
        double y = E.S - A.S; 
        double x = E.F - A.F; 
        reqAns = Math.sqrt(x * x + y * y); 
    } 
  
    // Case 3 
    else 
    { 
  
        // Finding the perpendicular distance 
        double x1 = AB.F; 
        double y1 = AB.S; 
        double x2 = AE.F; 
        double y2 = AE.S; 
        double mod = Math.sqrt(x1 * x1 + y1 * y1); 
        reqAns = Math.abs(x1 * y2 - y1 * x2) / mod; 
    } 
    return reqAns; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    pair A = new pair(0, 0); 
    pair B = new pair(2, 0); 
    pair E = new pair(1, 1); 
  
    System.out.print((int)minDistance(A, B, E)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

