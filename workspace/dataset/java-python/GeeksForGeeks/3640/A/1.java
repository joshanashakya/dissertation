

// Java function to find number of diagonals 
// in n sided convex polygon 
  
public class Diagonals { 
  
    static int numberOfDiagonals(int n) 
    { 
        return n * (n - 3) / 2; 
    } 
  
    // driver code to test above function 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.print(n + " sided convex polygon have "); 
        System.out.println(numberOfDiagonals(n) + " diagonals"); 
    } 
} 
  
// This code is contributed by Saket Kumar 

