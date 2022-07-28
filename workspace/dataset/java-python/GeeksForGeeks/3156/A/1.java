

// Java program to count number of 2 x 2 
// squares in a right isosceles triangle 
  
class Squares 
{ 
  public static  int numberOfSquares(int base) 
   { 
      // removing the extra part  
      // we would always need 
      base = (base - 2); 
   
      // Since each square has  
      // base of length of 2 
      base = base / 2; 
   
      return base * (base + 1)/2; 
   } 
   
   // Driver code 
   public static void main(String args[]) 
   { 
        
      int base = 8; 
      System.out.println(numberOfSquares(base)); 
   } 
} 
  
// This code is contributed by Anshika Goyal. 

