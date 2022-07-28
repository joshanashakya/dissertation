

// Java program to find N numbers such that 
// their product is a perfect cube 
import java.util.*; 
  
class GFG  
{ 
      
// Function to find the N numbers such  
//that their product is a perfect cube 
static void findNumbers(int N) 
{ 
    int i = 1; 
  
    // Loop to traverse each  
    //number from 1 to N 
    while (i <= N) { 
  
        // Print the cube of i  
        //as the ith term of the output 
        System.out.print( (i * i * i) 
            + " "); 
  
        i++; 
    } 
} 
  
// Driver Code 
public static void main (String []args) 
{ 
    int N = 4; 
  
    // Function Call 
    findNumbers(N); 
} 
} 
  
// This code is contributed by chitranayal 

