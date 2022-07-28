

// Java program to calculate volume  
// and surface area of Torus 
class Test { 
  
    public static void main(String args[]) 
    { 
  
        // radius of inner circle 
        double r = 3; 
  
        // distance from origin to center of inner circle 
        // radius of black circle in figure 
        double R = 7; 
  
        // Value of Pi 
        float pi = (float)3.14159; 
        double Volume = 0; 
        Volume = 2 * pi * pi * R * r * r; 
        System.out.printf("Volume: %f", Volume); 
  
        double Surface = 4 * pi * pi * R * r; 
        System.out.printf("\nSurface: %f", Surface); 
    } 
} 

