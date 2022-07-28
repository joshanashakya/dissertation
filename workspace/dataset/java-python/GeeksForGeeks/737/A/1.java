

// Java program to check whether bitwise AND of a number 
// with any subset of an array is zero or not 
import java.io.*; 
  
public class GFG { 
  
  
// Function to check whether bitwise AND of a number 
// with any subset of an array is zero or not 
static void isSubsetAndZero(int array[], int length, int N) 
{ 
    // variable to store the 
    // AND of all the elements 
    int arrAnd = array[0]; 
  
    // find the AND of all the elements 
    // of the array 
    for (int i = 1; i < length; i++) { 
        arrAnd = arrAnd & array[i]; 
    } 
  
    // if the AND of all the array elements 
    // and N is equal to zero 
    if ((arrAnd & N) == 0) 
        System.out.println( "YES"); 
    else
        System.out.println( "NO"); 
} 
  
// Driver Code 
    public static void main (String[] args) { 
        int array[] = { 1, 2, 4 }; 
    int length = array.length; 
  
    int N = 3; 
  
    isSubsetAndZero(array, length, N); 
    } 
} 
//This code is contributed by shs.. 

