

// Java program to find the minimum number 
// of squares to cover the surface of the 
// rectangle with given dimensions 
class GFG  
{ 
static int squares(int l, int b, int a) 
{ 
      
// function to count 
// the number of squares that can 
// cover the surface of the rectangle 
return (int)(Math.ceil(l / (double)a) * 
             Math.ceil(b / (double)a)); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int l = 11, b = 23, a = 14; 
    System.out.println(squares(l, b, a)); 
} 
} 
  
// This code is contributed by ChitraNayal 

