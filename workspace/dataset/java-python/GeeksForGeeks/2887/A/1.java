

// Java program to find  
// Pythagoras triplet  
// with one side as  
// given number. 
import java.io.*; 
  
class GFG 
{ 
      
// Function, to evaluate  
// the Pythagoras triplet 
// with includes 'n' if  
// possible 
static void evaluate( int n) 
{ 
    if (n == 1 || n == 2) 
        System.out.println("No Pythagoras " +  
                           "Triplet exists"); 
  
    else if (n % 2 == 0)  
    { 
  
        // Calculating for even case 
        int var = 1 * n * n / 4; 
        System.out.print("Pythagoras Triplets " + 
                                  "exist i.e. "); 
        System.out.print(n + " "); 
        System.out.print(var - 1+ " "); 
        System.out.println(var + 1 +" "); 
    } 
  
    else if (n % 2 != 0)  
    { 
  
        int var = 1 * n * n + 1; 
        System.out.print("Pythagoras Triplets " +  
                                  "exist i.e. "); 
        System.out.print(n + " "); 
        System.out.print(var / 2 - 1 + " "); 
        System.out.println(var / 2 + " "); 
    } 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 22; 
    evaluate(n); 
} 
} 
  
// This code is contributed 
// by ajit 

