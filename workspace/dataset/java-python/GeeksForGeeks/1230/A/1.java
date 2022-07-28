

// Java program to calculate Volume and 
// Surface area of Sphere 
class GFG { 
      
// Initializing Value Of PI 
static float pi = 3.14159f; 
  
// Function To Calculate Volume Of Sphere 
static float volume(float r) 
{ 
    float vol; 
    vol = ((float)4 / (float)3) * (pi * r * r * r); 
    return vol; 
} 
  
// Function To Calculate Surface Area of Sphere 
static float surface_area(float r) { 
    float sur_ar; 
    sur_ar = 4 * pi * r * r; 
    return sur_ar; 
} 
  
// Driver Function 
public static void main(String[] args)  
{ 
    float radius = 12; 
    float vol, sur_area; 
  
    // Function Call 
    vol = volume(radius); 
    sur_area = surface_area(radius); 
      
    // Printing Value Of Volume And Surface Area 
    System.out.println("Volume Of Sphere :" + vol); 
    System.out.println("Surface Area Of Sphere :" + sur_area); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

