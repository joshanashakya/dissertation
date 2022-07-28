

// Efficient Java program to 
// find sum of the series  
// 1.2.3 + 2.3.4 + 3.4.5 + .. 
import java.io.*; 
import java.math.*; 
  
class GFG  
{ 
    static int sumofseries(int n) 
    { 
    return (n * (n + 1) *  
           (n + 2) * (n + 3) / 4); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        System.out.println(sumofseries(3)); 
    }  
} 

