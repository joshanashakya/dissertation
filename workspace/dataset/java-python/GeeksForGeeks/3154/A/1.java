

// Java program to determine the numer  
// of squares that line will pass through 
class GFG 
{ 
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
}  
  
// Function to return the required position 
static void noOfSquares(int x1, int y1,  
                        int x2, int y2) 
{ 
    int dx = Math.abs(x2 - x1); 
    int dy = Math.abs(y2 - y1); 
  
    int ans = dx + dy - __gcd(dx, dy); 
  
    System.out.println(ans); 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int x1 = 1, y1 = 1, x2 = 4, y2 = 3; 
  
    noOfSquares(x1, y1, x2, y2); 
} 
} 
  
// This code contributed by Rajput-Ji 

