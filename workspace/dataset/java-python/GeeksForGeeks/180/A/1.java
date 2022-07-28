

// Java program to check if the 
// concatenation of two numbers 
// is a perfect cube or not 
class GFG { 
      
    // Function to check if a number is 
    // a perfect Cube or not 
    static boolean isPerfectCube(int x) 
    { 
        long cr = Math.round(Math.cbrt(x)); 
      
        return (cr * cr * cr == x); 
    } 
      
    // Function to check if 
    // concatenation of two numbers 
    // is a perfect cube or not 
    static void checkCube(int a, int b) 
    { 
      
        // Convert numbers to string 
        // using to_string() 
        String s1 = Integer.toString(a); 
        String s2 = Integer.toString(b); 
      
        // Concatenate the numbers and 
        // convert it into integer 
        int c = Integer.parseInt(s1 + s2); 
      
        // Check if concatenated value 
        // is perfect cube or not 
        if (isPerfectCube(c)) { 
                System.out.println("Yes"); 
        } 
        else { 
                System.out.println("No"); 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int a = 6; 
        int b = 4; 
      
        checkCube(a, b);    
    } 
} 
  
// This code is contributed by Yash_R 

