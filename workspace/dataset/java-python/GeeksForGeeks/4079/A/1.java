

// Java program to find two vertices of an 
// isosceles triangle in which there is 
// rectangle with opposite side (0, 0) and (x, y) 
class GFG 
{ 
  
// Function to find two vertices of an 
// isosceles triangle in which there is 
// rectangle with opposite side (0, 0) and (x, y) 
static void Vertices(int x, int y) 
{ 
    // Required value; 
    int val = Math.abs(x) + Math.abs(y); 
  
    // print x1 and y1 
    System.out.print(val * (x < 0 ? -1 : 1) + " 0 "); 
  
    // print x2 and y3 
    System.out.print("0 " + val * (y < 0 ? -1 : 1)); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int x = 3, y = 3; 
  
    // Function call 
    Vertices(x, y); 
} 
} 
  
// This code is contributed by Rajput-Ji 

