

// Java implementation of above approach 
public class GFG { 
  
// Function to return the time when both the 
// persons will meet at the starting point 
    static int startingPoint(int Length, int Speed1, int Speed2) { 
        int result1 = 0, result2 = 0; 
  
        // Time to cover 1 round by both 
        int time1 = Length / Speed1; 
        int time2 = Length / Speed2; 
  
        result1 = __gcd(time1, time2); 
  
        // Finding LCM to get the meeting point 
        result2 = time1 * time2 / (result1); 
  
        return result2; 
    } 
  
    static int __gcd(int a, int b) { 
        if (b == 0) { 
            return a; 
        } 
        return __gcd(b, a % b); 
  
    } 
// Function to return the time when both 
// the persons will meet for the first time 
  
    static float firstTime(int Length, int Speed1, int Speed2) { 
        float result = 0; 
  
        int relativeSpeed = Math.abs(Speed1 - Speed2); 
  
        result = ((float) Length / relativeSpeed); 
  
        return result; 
    } 
  
// Driver Code 
    public static void main(String[] args) { 
        int L = 30, S1 = 5, S2 = 2; 
  
        // Calling function 
        float first_Time = firstTime(L, S1, S2); 
        int starting_Point = startingPoint(L, S1, S2); 
  
        System.out.println("Met first time after "
                + first_Time + " hrs"); 
        System.out.println("Met at starting point after "
                + starting_Point + " hrs"); 
  
    } 
} 

