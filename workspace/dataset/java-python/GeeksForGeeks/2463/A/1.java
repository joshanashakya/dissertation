

// Java program to find the side of the 
// largest hexagon which can be inscribed 
// within an equilateral triangle 
class CLG 
{ 
// Function to find the side 
// of the hexagon 
 static float hexagonside(float a) 
{ 
  
    // Side cannot be negative 
    if (a < 0) 
        return -1; 
  
    // Side of the hexagon 
    float x = a / 3; 
    return x; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float a = 6; 
    System.out.println(hexagonside(a)); 
      
} 
} 

