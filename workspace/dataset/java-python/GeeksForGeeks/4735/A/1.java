

// Java program to  
// find total bit 
// in given number 
import java.io.*; 
  
class GFG  
{ 
    static int countBits(int number) 
    {  
          
        // log function in base 2  
        // take only integer part 
        return (int)(Math.log(number) /  
                     Math.log(2) + 1); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int num = 65; 
          
        System.out.println(countBits(num)); 
                                  
    } 
} 
  
// This code is contributed by vij 

