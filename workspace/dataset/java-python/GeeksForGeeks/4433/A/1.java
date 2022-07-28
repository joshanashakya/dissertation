

// Java program to find the number of steps  
// required to reach (x, y) from (0, 0) following  
// a zig-zag path  
  
class GfG  
{ 
  
// Function to return the required position  
static int countSteps(int x, int y)  
{  
    if (x < y)  
    {  
        return x + y + 2 * ((y - x) / 2);  
    }  
    else 
    {  
        return x + y + 2 * (((x - y) + 1) / 2);  
    }  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
    int x = 4, y = 3;  
    System.out.println(countSteps(x, y));  
} 
}  
  
// This code is contributed by Prerna Saini 

