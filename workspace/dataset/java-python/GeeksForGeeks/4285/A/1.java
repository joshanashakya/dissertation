

// Java program to check if a given  
// quadilateral is valid or not  
class GFG 
{ 
      
// Function to check if a given  
// quadilateral is valid or not  
public static int Valid(int a, int b,  
                        int c, int d)  
{  
    // Check condition  
    if (a + b + c + d == 360)  
        return 1;  
      
    return 0;  
}  
  
// Driver code  
public static void main (String[] args)  
{ 
    int a = 80, b = 70, c = 100, d = 110;  
      
    if (Valid(a, b, c, d) == 1)  
        System.out.println("Valid quadilateral");  
    else
        System.out.println("Invalid quadilateral");  
}  
} 
  
// This code is contributed 
// by apurva_sharma244 

