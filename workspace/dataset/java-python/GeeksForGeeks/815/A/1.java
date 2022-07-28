

//Java Program to find the area of the biggest square 
//which can fit inside the right angled traingle 
public class GFG { 
  
    //Function to find the area of the biggest square 
    static float squareArea(float l, float b, float h) 
    { 
  
     // the height or base or hypotenuse 
     // cannot be negative 
     if (l < 0 || b < 0 || h < 0) 
         return -1; 
  
     // side of the square 
     float a = (l * b) / (l + b); 
  
     // squaring to get the area 
     return a * a; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
         float l = 5, b = 12, h = 13; 
         System.out.println(squareArea(l, b, h)); 
    } 
} 

