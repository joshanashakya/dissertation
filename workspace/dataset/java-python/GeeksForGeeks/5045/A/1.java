

// Java program to find the maximum   
// number of Edge-Disjoint Spanning 
// tree possible  
import java.io.*; 
  
class GFG 
{ 
      
// Function to calculate max number  
// of Edge-Disjoint Spanning tree 
// possible  
static double edgeDisjoint(int n)  
{  
    double result = 0;  
  
    result = Math.floor(n / 2);  
  
    return result;  
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 4;  
    System.out.println((int)edgeDisjoint(n)); 
} 
} 
  
// This code is contributed 
// by Naman_Garg 

