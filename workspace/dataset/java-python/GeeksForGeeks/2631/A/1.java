

// Java Program to find Nth term 
  
class GFG 
{ 
      
    // Function that will return nth term 
    static int getValue(int n) 
    { 
        int i = 0, k = 1; 
      
        while (i < n) { 
            i = i + k; 
            k = k * 2; 
        } 
      
        return k / 2; 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
      
        // Get n 
        int n = 9; 
      
        // Get the value 
        System.out.println(getValue(n)); 
          
        // Get n 
        n = 1025; 
      
        // Get the value 
        System.out.println(getValue(n)); 
    } 
} 

