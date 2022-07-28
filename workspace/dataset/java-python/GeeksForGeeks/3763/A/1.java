

// Java Program to count  
// possible binary trees 
// using dynamic programming 
import java.io.*; 
  
class GFG 
{ 
static int countTrees(int n) 
{ 
    // Array to store number 
    // of Binary tree for  
    // every count of nodes 
    int BT[] = new int[n + 1]; 
    for(int i = 0; i <= n; i++) 
    BT[i] = 0; 
    BT[0] = BT[1] = 1; 
  
    // Start finding from 2 
    // nodes, since already  
    // know for 1 node. 
    for (int i = 2; i <= n; ++i)  
        for (int j = 0; j < i; j++) 
            BT[i] += BT[j] * 
                     BT[i - j - 1]; 
  
    return BT[n]; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
int n = 5; 
System.out.println("Total Possible " +  
                "Binary Trees are : " +  
                       countTrees(n)); 
} 
} 
  
// This code is contributed by anuj_67. 

