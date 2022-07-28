

//Java Program to find the biggest triangle 
//which can be inscribed within the ellipse 
  
public class GFG { 
  
    //Function to find the area 
    //of the triangle 
    static float trianglearea(float a, float b) 
    { 
  
     // a and b cannot be negative 
     if (a < 0 || b < 0) 
         return -1; 
  
     // area of the triangle 
     float area = (float)(3 * Math.sqrt(3) * Math.pow(a, 2)) / (4 * b); 
  
     return area; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
      
        float a = 4, b = 2; 
         System.out.println(trianglearea(a, b)); 
    } 
} 

