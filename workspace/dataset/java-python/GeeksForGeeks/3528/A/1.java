

// Java Program to find the 
// the biggest rectangle 
// which can be inscribed 
// within the semicircle 
class GFG  
{ 
  
// Function to find the area 
// of the biggest rectangle 
static float rectanglearea(float r) 
{ 
  
// the radius cannot be negative 
if (r < 0) 
    return -1; 
  
// area of the rectangle 
float a = r * r; 
  
return a; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float r = 5; 
    System.out.println((int)rectanglearea(r)); 
} 
} 
  
// This code is contributed 
// by ChitraNayal 

