

// Java code for finding greater 
// between the a^b and b^a 
  
public class GFG{ 
  
    // Function to find the greater value 
    static void findGreater(int a, int b) 
    { 
        double x = (double)a * (double)(Math.log((double)(b))); 
        double y = (double)b * (double)(Math.log((double)(a))); 
        if (y > x) { 
            System.out.println("a^b is greater") ; 
        } 
        else if (y < x) { 
            System.out.println("b^a is greater") ; 
        } 
        else { 
            System.out.println("Both are equal") ; 
        } 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int a = 3, b = 5, c = 2, d = 4; 
        findGreater(a, b); 
        findGreater(c, d); 
    } 
    // This code is contributed by Ryuga 
} 

