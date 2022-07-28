

//Java program to check if 4 points  
//in a 3-D plane are Coplanar  
  
public class GFG { 
  
    //Function to find equation of plane. 
    static void equation_plane(int x1,int y1,int z1,int x2,int y2,int z2, 
              int x3, int y3, int z3, int x, int y, int z) 
     { 
     int a1 = x2 - x1 ; 
     int b1 = y2 - y1 ; 
     int c1 = z2 - z1 ; 
     int a2 = x3 - x1 ; 
     int b2 = y3 - y1 ; 
     int c2 = z3 - z1 ; 
     int a = b1 * c2 - b2 * c1 ; 
     int b = a2 * c1 - a1 * c2 ; 
     int c = a1 * b2 - b1 * a2 ; 
     int d = (- a * x1 - b * y1 - c * z1) ; 
          
     // equation of plane is: a*x + b*y + c*z = 0 #  
          
     // checking if the 4th point satisfies  
     // the above equation  
     if(a * x + b * y + c * z + d == 0)  
         System.out.println("Coplanar");  
     else
         System.out.println("Not Coplanar");  
                     
     } 
        
    //Driver Code  
    public static void main(String[] args) { 
          
        int x1 = 3 ; 
        int y1 = 2 ; 
        int z1 = -5 ; 
        int x2 = -1 ; 
        int y2 = 4 ; 
        int z2 = -3 ; 
        int x3 = -3 ; 
        int y3 = 8 ; 
        int z3 = -5 ; 
        int x4 = -3 ; 
        int y4 = 2 ; 
        int z4 = 1 ; 
  
        //function calling 
        equation_plane(x1, y1, z1, x2, y2, z2, x3,   
                                 y3, z3, x4, y4, z4) ;                             
    } 
} 

