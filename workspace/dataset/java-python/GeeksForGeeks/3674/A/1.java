

// Java program to Check if  
// a point lies on or inside 
// a rectangle | Set-2 
class GFG  
{ 
  
// function to find if given point 
// lies inside a given rectangle or not. 
static boolean FindPoint(int x1, int y1, int x2, 
                         int y2, int x, int y) 
{ 
if (x > x1 && x < x2 &&  
    y > y1 && y < y2) 
    return true; 
  
return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
      
    // bottom-left and top-right 
    // corners of rectangle 
    int x1 = 0, y1 = 0,  
        x2 = 10, y2 = 8; 
  
    // given point 
    int x = 1, y = 5; 
  
    // function call 
    if (FindPoint(x1, y1, x2, y2, x, y)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

