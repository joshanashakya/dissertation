

// Java program to calculate area of  
// triangle if vectors of  
// 2 adjacent sides are given 
import java.util.*; 
  
class solution 
{ 
// function to calculate area of triangle  
static float area(int x1, int y1, int z1, int x2, int y2, int z2) 
{ 
  double a =Math.pow((y1 * z2 - y2 * z1),2)  
            + Math.pow((x1 * z2 - x2 * z1),2) + 
                Math.pow((x1 * y2 - x2 * y1),2); 
float area = (float)Math.sqrt(a) ; 
      
    area = area / 2; 
    return area ; 
} 
  
//Driver program 
public static void main(String arr[]) 
{ 
    int x1 = -2 ; 
    int y1 = 0 ;  
    int z1 = -5 ; 
    int x2 = 1 ; 
    int y2 = -2 ; 
    int z2 = -1 ; 
    float a = area(x1, y1, z1, x2, y2, z2) ;  
    System.out.println("Area= "+a); 
} 
  
} 
//This code is contributed by 
//Surendra_Gangwar 

