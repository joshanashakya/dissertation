

// JavaProgram to find the area 
// of the smallest square which 
// can be formed with rectangles 
// of given dimensions 
class GFG  
{ 
  
// Recursive function to  
// return gcd of a and b 
static int gcd(int a, int b) 
{ 
// Everything divides 0 
if (a == 0 || b == 0) 
    return 0; 
  
// Base case 
if (a == b) 
    return a; 
  
// a is greater 
if (a > b) 
    return gcd(a - b, b); 
return gcd(a, b - a); 
} 
  
// Function to find the area 
// of the smallest square 
static int squarearea(int l, int b) 
{ 
  
// the length or breadth or side 
// cannot be negative 
if (l < 0 || b < 0) 
    return -1; 
  
  
    // LCM of length and breadth  
    int n = (l * b) / gcd(l, b);  
  
    // squaring to get the area 
    return n * n;  
  
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int l = 6, b = 4; 
    System.out.println(squarearea(l, b)); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

