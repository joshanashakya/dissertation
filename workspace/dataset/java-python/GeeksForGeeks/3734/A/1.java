

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the percentage increase 
// in the volume of the cuboid 
static double increaseInVol(double l,    
                            double b,  
                            double h) 
{ 
    double percentInc = (1 + (l / 100)) *  
                        (1 + (b / 100)) *  
                        (1 + (h / 100)); 
    percentInc -= 1; 
    percentInc *= 100; 
  
    return percentInc; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    double l = 50, b = 20, h = 10; 
    System.out.println(increaseInVol(l, b, h) + "%"); 
} 
} 
  
// This code is contributed by Code_Mech 

