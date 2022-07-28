

// Java program to find the  
// X, Y and Z intercepts of a plane 
import java.util.*; 
  
class solution{ 
  
static double[] XandYandZintercept( double A, double B,  
                            double C, double D) 
{ 
    double []rslt = new double[3]; 
      
    // For finding the x-intercept  
    // put y = 0 and z = 0 
    double x = -D / A; 
  
    // For finding the y-intercept  
    // put x = 0 and z = 0  
    double y = -D / B ; 
  
    // For finding the z-intercept  
    // put x = 0 and y = 0 
    double z = -D / C; 
    rslt[0] = x; 
    rslt[1] = y; 
    rslt[2] = z;  
      
    return rslt; 
} 
  
static void equation_plane(int []p, int []q, int []r) 
{ 
    int x1 = p[0]; 
    int y1 = p[1]; 
    int z1 = p[2]; 
    int x2 = q[0]; 
    int y2 = q[1]; 
    int z2 = q[2]; 
    int x3 = r[0]; 
    int y3 = r[1]; 
    int z3 = r[2]; 
      
    // For Finding value of A, B, C, D 
    int a1 = x2 - x1; 
    int b1 = y2 - y1; 
    int c1 = z2 - z1; 
    int a2 = x3 - x1; 
    int b2 = y3 - y1; 
    int c2 = z3 - z1; 
    int A = b1 * c2 - b2 * c1; 
    int B = a2 * c1 - a1 * c2; 
    int C = a1 * b2 - b1 * a2; 
    int D = (- A * x1 - B * y1 - C * z1); 
      
    // Calling the first created function  
    double []rslt = XandYandZintercept(A, B, C, D); 
    for(int i = 0; i < 3; i++) 
    { 
        System.out.printf(rslt[i]+" "); 
    } 
} 
      
// Driver Code  
public static void main(String args[])  
{ 
    int x1 =-1; 
    int y1 = 2; 
    int z1 = 1; 
    int x2 = 0; 
    int y2 =-3; 
    int z2 = 2; 
    int x3 = 1; 
    int y3 = 1; 
    int z3 =-4; 
          
    int []p = {x1, y1, z1}; 
    int []q = {x2, y2, z2}; 
    int []r = {x3, y3, z3}; 
    equation_plane(p, q, r); 
  
} 
} 
  
// This code is contributed by Surendra_Gangwar 

