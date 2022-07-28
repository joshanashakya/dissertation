

// Java program to change value of x 
// according to its current value. 
  
class GFG { 
// Function to alternate the values 
  
    static int alternate(int a, int b, int x) { 
        return x = a ^ b ^ x; 
    } 
  
// Main function 
    public static void main(String[] args) { 
        int a = -10; 
        int b = 15; 
        int x = a; 
        System.out.print("x is : " + x); 
  
        x = alternate(a, b, x); 
  
        System.out.print("\nAfter exchange "); 
        System.out.print("\nx is : " + x); 
  
    } 
}  
  
// This code is contributed by 29AjayKumar 

