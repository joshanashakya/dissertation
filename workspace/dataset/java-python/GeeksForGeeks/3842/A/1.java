

// Java implementation of 
// above approach 
class GFG  
{ 
  
// Function to check if the 
// number is a perfect square 
static boolean isSquare(int num) 
{ 
    int root = (int)Math.sqrt(num); 
    return (root * root) == num; 
} 
  
// Function to check if the 
// number is a perfect cube 
static boolean isCube(int num) 
{ 
    int root = (int)Math.cbrt(num); 
    return (root * root *  
            root) == num; 
} 
  
// Function to count the number 
// of perfect squares and cubes 
static int countSC(int N) 
{ 
    int count = 0; 
    for (int i = 1; i <= N; i++)  
    { 
  
        // If a number is perfect 
        // square, 
        if (isSquare(i)) 
            count++; 
  
        // Else if the number is  
        // cube or not 
        else if (isCube(i)) 
            count++; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int N = 20; 
  
    System.out.println("Number of squares " +  
                            "and cubes is " +  
                                 countSC(N)); 
} 
} 
  
// This code is contributed 
// by ChitraNayal 

