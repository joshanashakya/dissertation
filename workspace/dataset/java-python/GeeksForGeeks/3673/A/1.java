

// Java program to Check whether  
// a given point lies inside or 
// on the rectangle or not 
class GFG  
{ 
  
// function to Check whether  
// a given point lies inside  
// or on the rectangle or not 
static boolean LiesInsieRectangle(int a, int b,  
                                  int x, int y) 
{ 
if (x - y - b <= 0 && x - y + b >= 0 &&  
    x + y - 2 * a + b <= 0 && x + y - b >= 0) 
    return true; 
  
return false; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a = 7, b = 2, x = 4, y = 5; 
  
    if (LiesInsieRectangle(a, b, x, y)) 
        System.out.println("Given point lies " +  
                        "inside the rectangle"); 
    else
        System.out.println("Given point does not " +  
                            "lie on the rectangle"); 
} 
} 
  
// This code is contributed 
// by ChitraNayal 

