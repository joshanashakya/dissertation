

// Java program to find maximum value of  
// an integer for which factorial can be 
// calculated on your system 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    public static int findMaxValue() 
    { 
        int res = 2; 
        long fact = 2; 
        while (true) 
        { 
            // when fact crosses its size,  
            // it gives negative value 
            if (fact < 0) 
                break; 
            res++; 
            fact = fact * res; 
        } 
        return res - 1; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        System.out.println("Maximum value of"+ 
                                 " integer " +  
                              findMaxValue()); 
    } 
} 

