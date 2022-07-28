

// An Efficient Method to count cubes between a and b 
class GFG 
{ 
  
// Function to count cubes between two numbers 
static int countCubes(int a, int b) 
{ 
    return (int) (Math.floor(Math.cbrt(b)) -  
                Math.ceil(Math.cbrt(a)) + 1); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 7, b = 28; 
    System.out.print("Count of cubes is "
        + countCubes(a, b)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

