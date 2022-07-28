

// Java program to find if all  
// prime factors of y divide x. 
class Divisible  
{ 
    public static int gcd(int a, int b) {  
      return b == 0 ? a : gcd(b, a % b); } 
      
    // Returns true if all prime factors 
    // of y divide x. 
    static boolean isDivisible(int x, int y) 
    { 
        if (y == 1) 
            return true; 
              
        int z = gcd(x, y); 
      
        if (z == 1) 
            return false; 
      
        return isDivisible(x, y / z); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 
        int x = 18, y = 12; 
        if (isDivisible(x, y)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
// This code is contributed by Prerna Saini 

