

// Java program to find the number of values 
// of b such that a = b + (a^b) 
  
import java.io.*; 
  
class GFG { 
  
  
// function to return the number of solutions 
 static int countSolutions(int a) 
{ 
    int count = 0; 
  
    // check for every possible value 
    for (int i = 0; i <= a; i++) { 
        if (a == (i + (a ^ i))) 
            count++; 
    } 
  
    return count; 
} 
  
// Driver Code 
  
  
    public static void main (String[] args) { 
        int a = 3; 
    System.out.println( countSolutions(a)); 
    } 
} 
// This code is contributed by inder_verma 

