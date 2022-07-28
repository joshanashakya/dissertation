

//Java implementation of the approach  
  
public class GFG { 
  
// Function to return the multiple of x  
// which is closest to a^b  
    static long getClosest(int a, int b, int x) { 
        long num = (long) Math.pow(a, b); 
  
        int floor = (int) (num / x); 
  
        // Closest element on the left  
        long numOnLeft = x * floor; 
  
        // Closest element on the right  
        long numOnRight = x * (floor + 1); 
  
        // If numOnLeft is closer than numOnRight  
        if ((num - numOnLeft) < (numOnRight - num)) { 
            return numOnLeft; 
        } // If numOnRight is the closest  
        else { 
            return numOnRight; 
        } 
    } 
  
    public static void main(String[] args) { 
        int a = 349, b = 1, x = 4; 
        System.out.println(getClosest(a, b, x)); 
  
    } 
} 

