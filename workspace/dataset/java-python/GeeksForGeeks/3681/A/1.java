

// JAVA Code to find minimum  
// perimeter using n blocks 
import java.util.*; 
  
class GFG  
{ 
    public static long minPerimeter(int n) 
    { 
        int l = (int) Math.sqrt(n); 
        int sq = l * l; 
      
        // if n is a perfect square 
        if (sq == n)  
            return l * 4; 
        else
        { 
            // Number of rows  
            long row = n / l;  
      
            // perimeter of the  
            // rectangular grid  
            long perimeter  
                  = 2 * (l + row);  
      
            // if there are blocks left  
            if (n % l != 0)  
                perimeter += 2; 
            return perimeter; 
        } 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 10; 
        System.out.println(minPerimeter(n)); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal 

