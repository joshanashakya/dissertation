

// Java program to count m digit numbers having 
// n as divisor. 
  
class Main 
{ 
    // Returns count of m digit numbers having n 
    // as divisor 
    static int findCount(int m, int n) 
    {     
        // generating largest number of m digit 
        int num1 = 0; 
        for (int i = 0; i < m; i++) 
            num1 = (num1 * 10) + 9; 
       
        // generating largest number of m-1 digit 
        int num2 = 0; 
        for (int i = 0; i < (m - 1); i++) 
            num2 = (num2 * 10) + 9; 
       
        // returning number of dividend 
        return ((num1 / n) - (num2 / n)); 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        int m = 2, n = 6; 
        System.out.println(findCount(m, n)); 
    } 
} 
  
/* This code is contributed by Harsh Agarwal */

