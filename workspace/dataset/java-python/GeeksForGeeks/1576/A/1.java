

// Java program to calculate 
// the percentage 
class GFG 
{ 
      
// Function to calculate the percentage 
static int percent(int a, int b) 
{ 
    float result = 0; 
    result = ((b - a) * 100) / a; 
  
    return (int)result; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a = 20, b = 25; 
  
    System.out.println(percent(a, b) + "%"); 
} 
} 
  
// This code is contributed by mits 

