

// Java program to find the longest 
// rod that can fit in a cuboid 
class GFG  
{ 
  
// Function to find the length 
static double longestRodInCuboid(int length,  
                                 int breadth,  
                                 int height) 
{ 
    double result; 
    int temp; 
      
    // temporary variable to hold 
    // the intermediate result 
    temp = length * length + breadth *  
           breadth + height * height; 
      
    // length of longest rod is calculated 
    // using square root function 
    result = Math.sqrt(temp); 
      
    return result; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int length = 12,  
        breadth = 9, 
        height = 8; 
  
    // calling longestRodInCuboid()  
    // function to get the length  
    // of longest rod 
    System.out.println((int)longestRodInCuboid(length, 
                                    breadth, height)); 
} 
} 
  
// This code is contributed by ChitraNayal 

