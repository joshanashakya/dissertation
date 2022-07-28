

class GFG  
{ 
  
// function to subtract two values 
// using 2's complement method 
static int Subtract(int a, int b) 
{ 
    int c; 
  
    // ~b is the 1's Complement 
    // of b adding 1 to it make  
    // it 2's Complement 
    c = a + (~b + 1); 
  
    return c; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 2, b = 3; 
      
    System.out.println(Subtract(a, b)); 
      
    a = 9; b = 7; 
    System.out.println(Subtract(a, b)); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

