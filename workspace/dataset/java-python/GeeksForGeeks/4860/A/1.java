

// Java program to print n'th roots of unity 
import java.io.*; 
  
class GFG { 
  
// This function receives an integer n , and prints 
// all the nth roots of unity 
static void printRoots(int n) 
{ 
    // theta = 2*pi/n 
    double theta = 3.14*2/n; 
  
    // print all nth roots with 6 significant digits 
    for(int k=0; k<n; k++) 
    { 
        // calculate the real and imaginary part of root 
        double real = Math.cos(k*theta); 
        double img = Math.sin(k*theta); 
  
        // Print real and imaginary parts 
        System.out.println(real); 
        if (img >= 0) 
            System.out.println(" + i "); 
        else
            System.out.println(" - i "); 
        System.out.println(Math.abs(img)); 
    } 
} 
  
// Driver function to check the program 
public static void main (String[] args) 
{ 
    printRoots(1); 
    //System.out.println(); 
    printRoots(2); 
    //System.out.println(); 
    printRoots(3); 
} 
} 
// This code is conributed by Raj 

