

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
static int COST = 3; 
  
// Function to find maximum fruits 
// Can buy from given values of x, y, z. 
static int maxItems(int x, int y, int z) 
{ 
  
    // Items of type 1 that can be bought 
    int type1 = x / COST; 
  
    // Update the coins 
    x %= COST; 
  
    // Items of type 2 that can be bought 
    int type2 = y / COST; 
  
    // Update the coins 
    y %= COST; 
  
    // Items of type 3 that can be bought 
    int type3 = z / COST; 
  
    // Update the coins 
    z %= COST; 
  
    // Items of type 4 that can be bought 
    // To buy a type 4 item, a coin 
    // of each type is required 
    int type4 = Math.min(x, Math.min(y, z)); 
  
    // Total items that can be bought 
    int maxItems = type1 + type2 + type3 + type4; 
    return maxItems; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int x = 4, y = 5, z = 6; 
    System.out.println(maxItems(x, y, z)); 
} 
}  
  
// This code is contributed by @tushil 

