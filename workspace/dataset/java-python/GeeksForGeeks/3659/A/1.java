

// Java program to calculate 
// area of a circumscribed circle-square 
import java.io.*; 
class Gfg { 
    // Utility Function 
    static float areacircumscribed(float a) 
    { 
        float PI = 3.14159265f; 
        return (a * a * (PI / 2)); 
    } 
  
    // Driver Function 
    public static void main(String arg[]) 
    { 
        float a = 6; 
        System.out.print("Area of an circumscribed"
                         + "circle is :"); 
        System.out.println(areacircumscribed(a)); 
    } 
} 
  
// The code is contributed by Anant Agarwal. 

