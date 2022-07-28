

// Java program to find the diagonal of a regular decdiagonal 
import java.util.*;  
import java.lang.*;  
import java.io.*;  
  
public class GFG {  
  
    // Function to return the diagonal of a regular decdiagonal 
    static double decdiagonal(double a)  
    {  
  
//side cannot be negative 
        if(a<0) 
        return -1; 
  
        // length of the diagonal 
        double d=1.902*a; 
          
        return d;  
    }  
  
    // Driver code  
    public static void main(String[] args)  
    {  
        int a = 9;  
        System.out.println(decdiagonal(a));  
    }  
}  

