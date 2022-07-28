

// Java implementation of the approach 
class GFG  
{ 
  
    // Function that returns true if  
    // the sequence will contain B  
    static boolean doesContainB(int a, int b, int c)  
    { 
        if (a == b)  
        { 
            return true; 
        } 
  
        if ((b - a) * c > 0 && (b - a) % c == 0)  
        { 
            return true; 
        } 
  
        return false; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int a = 1, b = 7, c = 3; 
  
        if (doesContainB(a, b, c))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

