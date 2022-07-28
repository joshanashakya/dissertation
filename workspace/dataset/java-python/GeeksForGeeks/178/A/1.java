

// Java implementation to find the percentage 
import java.util.*; 
  
class GFG{ 
  
    // change in the area when the percentage change 
    // in the length and breadth is given 
  
    // Function to calculate percentage 
    // change in area of rectangle 
    static int calculate_change(int length, int breadth){ 
        int change = 0; 
        change = length + breadth+((length * breadth)/100); 
        return change; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int cL = 20; 
        int cB = -10; 
        int cA = calculate_change(cL, cB); 
          
        System.out.println(+ cA); 
      
    } 
} 
  
// This code is contributed by AbhiThakur 
  

