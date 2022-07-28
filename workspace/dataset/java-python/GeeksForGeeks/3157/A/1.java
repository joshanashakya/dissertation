

// Java program for finding maximum squares 
// that can fit in right angle isosceles 
// triangle 
public class GFG  
{      
    // function for finding max squares 
    static int maxSquare(int b, int m) 
    { 
        // return in O(1) with derived  
        // formula 
        return (b / m - 1) * (b / m) / 2; 
    } 
       
    // driver program 
    public static void main(String args[]) 
    { 
        int b = 10, m = 2; 
        System.out.println(maxSquare (b,m)); 
    }  
} 
  
// This code is contribute by Sumit Ghosh 

