

// Java program to find the side of the 
// largest square that can be inscribed  
// within the hexagon which in return is  
// incsribed within an equilateral triangle 
class cfg  
{ 
      
// Function to find the side 
// of the square 
static float squareSide(float a) 
{ 
  
    // Side cannot be negative 
    if (a < 0) 
        return -1; 
  
    // side of the square 
    float x = (0.423f * a); 
    return x; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float a = 8; 
    System.out.println(squareSide(a)); 
  
} 
} 
  
// This code is contributed by  
// Mukul Singh. 

