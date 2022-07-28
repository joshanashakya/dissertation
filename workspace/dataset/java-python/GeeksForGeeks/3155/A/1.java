

// Java program to find minimum number of 
// squares to make a given rectangle. 
  
class GFG{ 
static int __gcd(int a, int b) { 
   if (b==0) return a; 
   return __gcd(b,a%b); 
} 
static int countRectangles(int l, int w) 
{ 
    // if we take gcd(l, w), this 
    // will be largest possible 
    // side for suare, hence minimum 
    // number of square. 
    int squareSide = __gcd(l, w); 
  
    // Number of squares. 
    return (l * w) / (squareSide * squareSide); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 4, w = 6; 
    System.out.println(countRectangles(l, w)); 
} 
} 
// This code is contributed by mits 

