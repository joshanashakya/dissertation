

// Java program to count of  
// steps until one of the 
// two numbers become 0. 
import java.io.*; 
  
class GFG  
{ 
      
// Returns count of steps 
// before one of the numbers  
// become 0 after repeated 
// subtractions. 
static int countSteps(int x,  
                      int y) 
{ 
    // If y divides x, then  
    // simply return x/y. 
    if (x % y == 0) 
        return x / y; 
  
    // Else recur. Note that this 
    // function works even if x is  
    // smaller than y because 
    // in that case first recursive 
    // call exchanges roles of x and y. 
    return x / y + countSteps(y, x % y); 
} 
  
// Driver code  
public static void main (String[] args)  
{ 
    int x = 100, y = 19; 
    System.out.println(countSteps(x, y)); 
      
} 
} 
  
// This code is contributed by aj_36 

