

// Java implementation of the approach 
class GFG 
{ 
  
// Function to check if X and Y 
// can be made equal to zero by 
// using given operation any number of times 
static void ifPossible(int X, int Y) 
{ 
    if (X > Y) 
        swap(X, Y); 
  
    // Check for the two conditions 
    if ((X + Y) % 5 == 0 && 3 * X >= 2 * Y) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
static void swap(int x, int y) 
{ 
    int temp = x; 
    x = y; 
    y = temp; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int X = 33, Y = 27; 
  
    ifPossible(X, Y); 
} 
} 
  
// This code is contributed by Rajput-Ji 

