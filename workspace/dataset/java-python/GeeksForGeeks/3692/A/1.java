

class GFG { 
  
    // Function to calculate 
    // GCD of a and b 
    public static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        else
            return gcd(b % a, a); 
    } 
  
    // Function to calculate the 
    // coordinates of the rectangle 
    public static void solve(int n, int m, 
                             int x, int y, 
                             int a, int b) 
    { 
  
        int k, g; 
        int x1, y1, x2, y2; 
        g = gcd(a, b); 
  
        // Reducing the ratio to 
        // lowest irreducible form 
        a /= g; 
        b /= g; 
  
        // Finding the maximum multiple 
        // of length that can be chosen 
        k = Math.min(n / a, m / b); 
  
        // Assuming the point (X, Y) as the 
        // centre of the required rectangle 
        // Finding the lower X coordinate by 
        // subtracting half of total length 
        // from X 
        x1 = x - (k * a - k * a / 2); 
  
        // Finding the upper X coordinate 
        // by adding half of total length 
        // to X 
        x2 = x + k * a / 2; 
  
        // Finding lower Y coordinate by 
        // subtracting half of breadth 
        // from Y 
        y1 = y - (k * b - k * b / 2); 
  
        // Finding upper Y coordinate 
        // by adding half of breadth 
        // to Y 
        y2 = y + k * b / 2; 
  
        // If lower X coordinate 
        // goes below 0 then we shift 
        // the lower coordinate to 0 
        // and the upper coordinate 
        // accordingly to bring lower 
        // coordinate in range 
        // and to keep center as 
        // close as possible to X, Y 
        if (x1 < 0) { 
            x2 -= x1; 
            x1 = 0; 
        } 
  
        // If upper X coordinate goes 
        // beyond n, then we shift the 
        // upper X coordinate ton 
        // and we shift the lower coordinate 
        // accordingly to bring the upper 
        // coordinate in range 
        if (x2 > n) { 
            x1 -= x2 - n; 
            x2 = n; 
        } 
  
        // If lower Y coordinate goes 
        // below 0 then we shift the 
        // lower coordinate to 0 
        // and the upper coordinate 
        // accordingly to bring lower 
        // coordinate in range 
        // and to keep center as 
        // close as possible to X, Y 
        if (y1 < 0) { 
            y2 -= y1; 
            y1 = 0; 
        } 
  
        // If upper Y coordinate goes 
        // beyond n, then we shift the 
        // upper X coordinate 
        // to n and we shift the lower 
        // coordinate accordingly to 
        // bring the upper 
        // coordinate in range 
        if (y2 > m) { 
            y1 -= y2 - m; 
            y2 = m; 
        } 
  
        System.out.println(x1 + " " + y1 + " " + x2 
                           + " " + y2); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 70, m = 10; 
        int x = 20, y = 5; 
        int a = 5, b = 3; 
        solve(n, m, x, y, a, b); 
    } 
} 
  
// This code is contributed by - vkz6198 

