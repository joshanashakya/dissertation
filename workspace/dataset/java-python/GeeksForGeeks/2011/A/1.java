

// Java program to find n terms of 
// series from given two numbers 
import java.io.*; 
  
class GFG { 
  
    // Function to find n terms 
    // of series 
    static void findSeries(int num,  
                 int first, int sec) 
    { 
      
        System.out.print(first + " " 
                       + sec + " "); 
        int counter = 0, sum; 
      
        // find next (num - 2) terms 
        // of series as first two  
        // terms are already given 
        while (counter < num - 2)  
        { 
            sum = first + sec; 
            System.out.print( sum + " "); 
            first = sec; 
            sec = sum; 
            counter++; 
        } 
    } 
      
    // Drivers code 
    public static void main (String[] args) 
    { 
        int n = 5, first = 2, sec = 4; 
          
        findSeries(n, first, sec); 
    } 
} 
  
// This code is contributed by vt_m. 

