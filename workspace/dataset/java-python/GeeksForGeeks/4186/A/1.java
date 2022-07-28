

// Java implementation of the approach 
class GFG 
{ 
  
// Function that returns true if multiple 
// lines are possible passing through 
// (x, y) that divide the given 
// rectangle into two equal parts 
static boolean isPossible(int w, int h, int x, int y) 
{ 
  
    // If the point (x, y) is the 
    // centre of the rectangle 
    if (x * 2 == w && y * 2 == h) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int w = 1, h = 2, x = 1, y = 2; 
  
    if (isPossible(w, h, x, y)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code contributed by PrinciRaj1992 

