

// Java program to implement Collatz 
// Conjecture 
class GFG { 
      
    // Function to find if n reaches 
    // to 1 or not. 
    static boolean isToOne(int n) 
    { 
          
        // Return true if n is positive 
        return (n > 0); 
    } 
      
    // Drivers code 
    public static void main(String[] args) 
    { 
        int n = 5; 
          
        if(isToOne(n) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Smitha. 

