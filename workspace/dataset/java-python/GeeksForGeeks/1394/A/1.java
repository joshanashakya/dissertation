

// An simple Java program to find 
// minimum number formed by bits  
// of a given number. 
import java.io.*; 
  
class GFG 
{ 
    private static int _popcnt32(long number) 
    { 
        int counter = 0; 
          
        while(number > 0) 
        { 
            if(number % 2 == 1) 
            { 
                counter++; 
            } 
              
            //or number = number >> 1 
            number = number / 2;  
        } 
        return counter; 
    }  
      
    // Returns maximum number formed  
    // by bits of a given number. 
    static long maximize(long a) 
    { 
        // _popcnt32(a) gives number  
        // of 1's present in binary  
        // representation of a. 
        int n = _popcnt32(a); 
                  
        // Set most significant 
        // n bits of res. 
        long res = 0; 
        for (int i = 1; i <= n; i++) 
        res = (int)res | (1 << (32 - i)); 
      
        return Math.abs(res); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        long a = 1; 
        System.out.print(maximize(a)); 
    } 
} 
  
// This code is contributed by  
// Manish Shaw(manishshaw1) 

