

// Java  implementation to find the  
// number of grey tiles 
  
import java.io.*; 
  
class GFG { 
    // Function to count the number 
// of grey tiles  
static int findTileCount(int x, int y,  
                         int l, int r)  
{  
    int lcm = (x * y) / __gcd(x, y);  
  
    // Number multiple of lcm less than L  
    int countl = (l - 1) / lcm;  
  
    // Number of multiples of  
    // lcm less than R+1  
    int countr = r / lcm;  
    return countr - countl;  
}  
  
static int __gcd(int a, int b)  
{  
      
    // Everything divides 0  
    if (a == 0)  
    return b;  
    if (b == 0)  
    return a;  
  
    // base case  
    if (a == b)  
        return a;  
  
    // a is greater  
    if (a > b)  
        return __gcd(a - b, b);  
          
    return __gcd(a, b - a);  
} 
  
// Driver code  
      
      
    public static void main (String[] args) { 
  
    int x = 2, y = 3, l = 6, r = 18;  
        System.out.println(findTileCount(x, y, l, r));  
} 
}  
  
// This code is contributed ajit 

