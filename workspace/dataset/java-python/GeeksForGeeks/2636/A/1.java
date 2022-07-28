

// Java Program to calculate  
// nth term of a series 
import java.io.*; 
  
class GFG  
{ 
    // func for calualtion 
    static int seriesFunc(int n) 
    { 
        // for summation of square  
        // of first n-natural nos. 
        int sumSquare = (n * (n + 1)  
                        * (2 * n + 1)) / 6; 
      
        // summation of first n natural nos. 
        int sumNatural = (n * (n + 1) / 2); 
      
        // return result 
        return (sumSquare + sumNatural + 1); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 8;  
        System.out.println(seriesFunc(n)); 
          
        n = 13; 
        System.out.println(seriesFunc(13)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

