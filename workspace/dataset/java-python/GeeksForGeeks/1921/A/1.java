

// Java implementation to find Remainder 
// when a large Number is divided by R 
  
class GFG 
{ 
    // Function to Return Remainder 
    static int Remainder(String str, int R) 
    { 
        // len is variable to store the 
        // length of Number string. 
        int len = str.length(); 
      
        int Num, Rem = 0; 
      
        // loop that find Remainder 
        for (int i = 0; i < len; i++) { 
      
            Num = Rem * 10 + (str.charAt(i) - '0'); 
            Rem = Num % R; 
        } 
      
        // Return the remainder 
        return Rem; 
    } 
      
    // Driver code 
    public static void main( String [] args) 
    { 
      
        // Get the large number as string 
        String str = "13589234356546756"; 
      
        // Get the divisor R 
        int R = 13; 
      
        // Find and print the remainder 
        System.out.println(Remainder(str, R)); 
      
          
    } 
} 
  
// This code is contributed 
// by ihritik 

