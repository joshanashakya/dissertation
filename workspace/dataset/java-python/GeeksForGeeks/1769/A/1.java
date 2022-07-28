

// Program to find the amount  
/// of water in j-th glass 
// of i-th row 
import java.lang.*; 
  
class GFG 
{ 
// Returns the amount of water 
// in jth glass of ith row 
static float findWater(int i, int j,  
                       float X) 
{ 
// A row number i has maximum i  
// columns. So input column  
// number must be less than i 
if (j > i) 
{ 
    System.out.println("Incorrect Input"); 
    System.exit(0); 
} 
  
// There will be i*(i+1)/2 glasses  
// till ith row (including ith row) 
int ll = Math.round((i * (i + 1) )); 
float[] glass = new float[ll + 2]; 
  
// Put all water in first glass 
int index = 0; 
glass[index] = X; 
  
// Now let the water flow to the  
// downward glasses till the row  
// number is less than or/ equal  
// to i (given row)  
// correction : X can be zero for side  
// glasses as they have lower rate to fill 
for (int row = 1; row <= i ; ++row) 
{ 
    // Fill glasses in a given row. Number of  
    // columns in a row is equal to row number 
    for (int col = 1;  
             col <= row; ++col, ++index) 
    { 
        // Get the water from current glass 
        X = glass[index]; 
  
        // Keep the amount less than or  
        // equal to capacity in current glass 
        glass[index] = (X >= 1.0f) ? 1.0f : X; 
  
        // Get the remaining amount 
        X = (X >= 1.0f) ? (X - 1) : 0.0f; 
  
        // Distribute the remaining amount   
        // to the down two glasses 
        glass[index + row] += X / 2; 
        glass[index + row + 1] += X / 2; 
    } 
} 
  
// The index of jth glass in ith  
// row will be i*(i-1)/2 + j - 1 
return glass[(int)(i * (i - 1) /  
                   2 + j - 1)]; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int i = 2, j = 2; 
    float X = 2.0f; // Total amount of water 
    System.out.println("Amount of water in jth " + 
                         "glass of ith row is: " +  
                              findWater(i, j, X)); 
} 
} 
  
// This code is contributed by mits 

