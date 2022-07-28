

// Java program to find the maximum angle 
// at which we can tilt the bottle 
// without spilling any water 
class GFG  
{ 
    static float find_angle(int x, 
                     int y, int z) 
    { 
  
        // Now we have the volume 
        // of rectangular prism a*a*b 
        int volume = x * x * y; 
  
        float ans = 0; 
  
        // Now we have 2 cases! 
        if (z < volume / 2)  
        { 
            float d = (float) ((x * y * y) / (2.0 * z)); 
  
            // Taking the tangent inverse of value d 
            // As we want to take out the required angle 
            ans = (float) Math.atan(d); 
        }  
        else
        { 
            z = volume - z; 
            float d = (2 * z) / (float) (x * x * x); 
  
            // Taking the tangent inverse of value d 
            // As we want to take out the required angle 
            ans = (float) Math.atan(d); 
        } 
  
        // As of now the angle is in radian. 
        // So we have to convert it in degree. 
        ans = (float) ((ans * 180) / 3.14159265); 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        // Enter the Base square side length 
        int x = 12; 
  
        // Enter the Height of rectangular prism 
        int y = 21; 
  
        // Enter the Base square side length 
        int z = 10; 
  
        System.out.print(find_angle(x, y, z) + "\n"); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

