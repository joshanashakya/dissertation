

// Java program to swap three variables 
// without using temporary variable. 
class GFG  
{ 
    static int a, b, c; 
  
    // Assign c's value to a, a's value 
    // to b and b's value to c. 
    static void swapThree() 
    { 
        // Store XOR of all in a 
        a = a ^ b ^ c; 
  
        // After this, b has value of a 
        b = a ^ b ^ c; 
  
        // After this, c has value of b 
        c = a ^ b ^ c; 
  
        // After this, a has value of c 
        a = a ^ b ^ c; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        a = 10; 
        b = 20; 
        c = 30; 
        System.out.println("Before swapping a = " + a +  
                           ", b = " + b + ",c = " + c); 
  
        // Calling Function 
        swapThree(); 
        System.out.println("After swapping a = " + a +  
                           ", b = " + b + ", c = " + c); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

