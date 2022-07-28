

// Java program to implement 
// the above problem 
class GFG 
{ 
      
// Function to find the number of triangles 
static void findTriangles(int n) 
{ 
    int num; 
    num = n * (n - 4); 
  
    // print the number of triangles 
    System.out.println(num); 
} 
  
// Driver code 
public static void main(String [] args) 
{ 
    // initialize the number of sides of a polygon 
    int n; 
    n = 6; 
  
    findTriangles(n); 
  
} 
} 
  
// This code is contributed by ihritik 

