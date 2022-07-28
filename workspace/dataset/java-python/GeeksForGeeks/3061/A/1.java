

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the sum  
    // of the digits of num^2  
    static long squareDigitSum(String s)  
    {  
        // To store the number of 1's  
        long lengthN = s.length();  
      
        // Find the sum of the digits of num^2  
        long result = (lengthN / 9) * 81 +  
                      (long)Math.pow((lengthN % 9), 2);  
      
        return result;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String s = "1111";  
      
        System.out.println(squareDigitSum(s));  
  
    }  
} 
  
// This code is contributed by AnkitRai01 

