

class GFG  
{ 
// Function to check whether  
// it is possible to make a 
// regular polygon with a given angle.  
static void makePolygon(double a)  
{  
    // N denotes the number of  
    // sides of polygons possible  
    double n = 360 / (180 - a);  
    if (n == (int)n)  
        System.out.println("YES");  
    else
        System.out.println("NO");  
}  
  
// Driver code  
public static void main (String[] args)  
{ 
    double a = 90;  
  
    // function to print 
    // the required answer  
    makePolygon(a);  
} 
} 
  
// This code is contributed by Bilal 

