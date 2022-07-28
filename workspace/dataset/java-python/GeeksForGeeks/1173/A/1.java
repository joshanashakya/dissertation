

// Java program to find if a number is 
// positive, negative or zero using 
// bit wise operators. 
class GFG { 
      
    // function to return 1 if it is zero 
    // returns 0 if it is negative 
    // returns 2 if it is positive 
    static int index(int i) 
    { 
        return 1 + (i >> 31) - (-i >> 31); 
    } 
  
    static void check(int n) 
    { 
          
        // string array to store all kinds 
        // of number 
        String s[] = { "negative", "zero",  
                              "positive" }; 
  
        // function call to check the sign  
        // of number 
        int val = index(n); 
  
        System.out.println(n + " is " + s[val]); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        check(30); 
        check(-20); 
        check(0); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

