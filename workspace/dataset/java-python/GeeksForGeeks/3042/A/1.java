

// Java program to find minimum  
// number of squares to cut a paper. 
class GFG{ 
      
// To swap two numbers 
static void swap(int a,int b) 
{ 
    int temp = a; 
    a = b; 
    b = temp; 
} 
  
// Returns min number of squares needed 
static int minimumSquare(int a, int b) 
{ 
    int result = 0, rem = 0; 
  
    // swap if a is small size side . 
    if (a < b) 
        swap(a, b); 
  
    // Iterate until small size side is 
    // greater then 0 
    while (b > 0) 
    { 
        // Update result 
        result += a/b; 
        rem = a % b; 
        a = b; 
        b = rem; 
    } 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 13, m = 29; 
    System.out.println(minimumSquare(n, m)); 
} 
} 
  
//This code is contributed by Smitha Dinesh Semwal. 

