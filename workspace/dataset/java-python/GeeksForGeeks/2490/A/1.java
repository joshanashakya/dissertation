

// A brute force approach based implementation 
// to find if a number can be written as sum 
// of two squares. 
  
class GFG { 
      
    // function to check if there exist two 
    // numbers sum of whose squares is n. 
    static boolean sumSquare(int n) 
    { 
        for (long i = 1; i * i <= n; i++) 
            for (long j = 1; j * j <= n; j++) 
                if (i * i + j * j == n) { 
                    System.out.println(i + "^2 + "
                                       + j + "^2"); 
                    return true; 
     } 
  
        return false; 
    } 
       
    // driver Program 
    public static void main(String args[]) 
    { 
        int n = 25; 
        if (sumSquare(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
  
/*This code is contributed by Nikita Tiwari.*/

