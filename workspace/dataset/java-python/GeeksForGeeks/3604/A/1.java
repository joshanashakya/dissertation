

// Java program to split a number into three parts such 
// than none of them is divisible by 3. 
import java.util.*; 
  
class solution 
{ 
  
static void printThreeParts(int N) 
{ 
    // Print x = 1, y = 1 and z = N - 2 
    if (N % 3 == 0) 
          
        System.out.println("x = 1, y = 1, z = "+ (N-2));  
  
    // Otherwise, print x = 1, y = 2 and z = N - 3 
    else
        System.out.println(" x = 1, y = 2, z = "+ (N-3));  
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int N = 10;  
    printThreeParts(N); 
      
} 
} 

