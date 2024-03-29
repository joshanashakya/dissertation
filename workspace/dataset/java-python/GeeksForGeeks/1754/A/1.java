

// A program to find day of a given date  
  
class GFG 
{ 
static int dayofweek(int d, int m, int y) 
{ 
    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
    y -= (m < 3) ? 1 : 0; 
    return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
} 
  
// Driver Program to test above function 
public static void main(String arg[]) 
{ 
    int day = dayofweek(30, 8, 2010); 
    System.out.print(day); 
} 
} 
  
// This code is contributed 
// by Anant Agarwal. 

