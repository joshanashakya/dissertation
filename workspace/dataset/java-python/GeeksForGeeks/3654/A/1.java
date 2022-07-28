

// Java code to find mirror image 
class GFG 
{ 
static class pair 
{  
    double first, second;  
    public pair(double first, double second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
// function which finds coordinates 
// of mirror image. 
// This function return a pair of double 
static pair mirrorImage(double a, double b,  
                        double c, double x1,  
                        double y1) 
{ 
    double temp = -2 * (a * x1 + b * y1 + c) / 
                       (a * a + b * b); 
    double x = temp * a + x1; 
    double y = temp * b + y1; 
    return new pair(x, y); 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    double a = -1.0; 
    double b = 1.0; 
    double c = 0.0; 
    double x1 = 1.0; 
    double y1 = 0.0; 
  
    pair image = mirrorImage(a, b, c, x1, y1); 
    System.out.print("Image of point (" + x1 +  
                                   ", " + y1 + ") "); 
    System.out.print("by mirror (" + a +  
                          ")x + (" + b +  
                          ")y + (" + c + ") = 0, is :"); 
    System.out.println("(" + image.first +  
                       ", " + image.second + ")"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

