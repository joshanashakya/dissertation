

// Java program to find  
// optimal number of trials 
// for k floors and 2 eggs. 
import java.io.*; 
  
class GFG  
{ 
    static int twoEggDrop(int k) 
    { 
        return (int)Math.ceil((-1.0 + 
                    Math.sqrt(1 + 8 * k)) / 2.0); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int k = 100; 
        System.out.println(twoEggDrop(k)); 
    } 
} 
  
// This code is contributed 
// by Mahadev. 

