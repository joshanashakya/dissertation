

// Java implementation of the approach 
class GFG 
{ 
  
    // Function that returns true if A can be 
    // converted to B with the given operations 
    static boolean canConvert(int a, int b) 
    { 
        while (b > a)  
        { 
  
            // If the current number ends with 1 
            if (b % 10 == 1)  
            { 
                b /= 10; 
                continue; 
            } 
  
            // If the current number is divisible by 2 
            if (b % 2 == 0) 
            { 
                b /= 2; 
                continue; 
            } 
  
            // If above two conditions fail 
            return false; 
        } 
  
        // If it is possible to convert A to B 
        if (b == a) 
            return true; 
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
  
        int A = 2, B = 82; 
  
        if (canConvert(A, B)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    } 
} 
  
// This code contributed by Rajput-Ji 

