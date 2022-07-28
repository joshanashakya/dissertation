

// Java program to change value of x 
// according to its current value. 
import java.util.*; 
  
class solution 
{ 
  
// Function to alternate the values 
static void alternate(int a, int b, int x) 
{ 
    x = a + b - x; 
    System.out.println("After change"+"\n"+" x is : "+x); 
} 
  
// Main function 
public static void main(String args[]) 
{ 
    int a = -10; 
    int b = 15; 
    int x = a;  
    System.out.println("x is : "+x); 
    alternate(a, b, x);  
} 
} 

