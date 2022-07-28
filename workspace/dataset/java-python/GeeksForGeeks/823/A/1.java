

// Java Implementation to find the minimum 
// no of blocks required to form 
// hollow rectangular prism 
import java.util.*; 
  
class GFG{ 
   
// Function to display output 
static void disp(int row_no, int block) 
{ 
    System.out.print(row_no * block); 
} 
   
// Function to return minimum no of layers 
// required to form the hollow prism 
static int row(int ht, int h) 
{ 
    return ht / h; 
} 
   
// Function to calculate no of blocks 
// required for each layer 
static void calculate(int l, int w, int h, int a, int ht) 
{ 
    // No of blocks required for each row 
    int no_block = (4 * a) / l; 
    int row_no; 
   
    // Check for no of layers is minimum 
    if (h < w) 
        row_no = row(ht, w); 
    else
        row_no = row(ht, h); 
    disp(row_no, no_block); 
} 
   
// Driver function 
public static void main(String[] args) 
{ 
    // Length, width, height of each block 
    int l = 50, w = 20, h = 35; 
   
    // Side of one wall 
    int a = 700; 
   
    // height of each wall 
    int ht = 140; 
   
    calculate(l, w, h, a, ht); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

