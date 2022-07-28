

// Java program to print all sides and angles of right 
// angle triangle given one side 
  
  
import java.io.*; 
  
class GFG { 
   
  
static double  PI = 3.1415926535; 
  
// Function to find angle A  
// Angle in front of side a 
static double findAnglesA(double a, double b, double c) 
{ 
    // applied cosine rule 
    double A = Math.acos((b * b + c * c - a * a) / (2 * b * c)); 
  
    // convert into degrees 
    return A * 180 / PI; 
} 
  
// Function to find angle B  
// Angle in front of side b 
static double findAnglesB(double a, double b, double c) 
{ 
    // applied cosine rule 
    double B = Math.acos((a * a + c * c - b * b) / (2 * a * c)); 
  
    // convert into degrees and return 
    return B * 180 / PI; 
} 
  
// Function to print all angles  
// of the right angled triangle 
static void printAngles(int a, int b, int c) 
{ 
    double x = (double)a; 
    double y = (double)b; 
    double z = (double)c; 
      
    // for calculate angle A 
    double A = findAnglesA(x, y, z); 
      
    // for calculate angle B 
    double B = findAnglesB(x, y, z); 
      
    System.out.println( "Angles are A = " + A + ", B = " + 
                        B + ", C = " + 90); 
} 
  
// Function to find other two sides of the 
// right angled triangle 
static void printOtherSides(int n)  
{  
    int b=0,c=0; 
      
    // if n is odd  
    if ((n & 1)>0)  
    {  
        // case of n = 1 handled separately  
        if (n == 1)  
            System.out.println( -1);  
        else
        {  
            b = (n*n-1)/2;  
            c = (n*n+1)/2;  
            System.out.println( "Side b = " + b  
                + ", Side c = " + c );  
        }  
    }  
    else
    {  
        // case of n = 2 handled separately  
        if (n == 2)  
            System.out.println( -1);  
        else
        {  
            b = n*n/4-1;  
            c = n*n/4+1;  
            System.out.println( "Side b = " + b  
                + ", Side c = " + c);  
        }  
    }  
      
    // Print angles of the triangle 
    printAngles(n,b,c); 
}  
  
// Driver Program 
  
  
    public static void main (String[] args) { 
    int a = 12; 
  
    printOtherSides(a); 
    } 
} 
  
// This code is contributed  
// by inder_verma.. 

