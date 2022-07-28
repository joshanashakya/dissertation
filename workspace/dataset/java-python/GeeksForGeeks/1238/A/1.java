

//Java to find maximum area rectangle 
  
import java.io.*; 
  
class GFG { 
// Function to find max area 
static int maxArea(float perimeter) 
{ 
    int length = (int)Math.ceil(perimeter / 4); 
    int breadth = (int)Math.floor(perimeter / 4); 
  
// return area 
return length * breadth; 
} 
  
// Driver code 
      
    public static void main (String[] args) { 
  
        float n = 38; 
        System.out.println("Maximum Area = " + 
                maxArea(n)); 
          
    } 
} 

