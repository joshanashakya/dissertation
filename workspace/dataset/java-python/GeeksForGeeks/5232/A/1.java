

// Java program to find number  
// of leaf nodes  
  
class GfG  
{ 
  
// Function to calculate  
// leaf nodes in n-ary tree  
static int calcNodes(int N, int I)  
{  
    int result = 0;  
  
    result = I * (N - 1) + 1;  
  
    return result;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int N = 5, I = 2;  
  
    System.out.println("Leaf nodes = " +  
                        calcNodes(N, I));  
} 
}  
  
// This code is contributed by Prerna Saini 

