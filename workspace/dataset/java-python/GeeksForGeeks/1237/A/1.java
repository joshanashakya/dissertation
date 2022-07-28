

// Java program to calculate the  
// sum of area of all possible  
// squares that comes inside 
// the rectangle 
class GFG  
{ 
// Function to calculate the  
// sum of area of all possible  
// squares that comes inside 
// the rectangle 
static int calculateAreaSum(int l, int b) 
{ 
    int size = 1; 
  
    // Square with max size possible 
    int maxSize = Math.min(l, b); 
  
    int totalArea = 0; 
  
    for(int i = 1; i <= maxSize; i++) 
    {  
        // calculate total square  
        // of a given size 
        int totalSquares = (l - size + 1) *  
                           (b - size + 1); 
      
        // calculate area of squares  
        // of a particular size  
        int area = totalSquares *    
                    size * size; 
      
        // total area  
        totalArea += area; 
          
        // increment size  
        size++; 
    } 
  
    return totalArea; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int l = 4, b = 3; 
      
    System.out.println(calculateAreaSum(l, b)); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

