

// Java program to print path from root to all  
// nodes in a complete binary tree.  
import java.util.*; 
  
class GFG 
{ 
  
// Function to print path of all the nodes  
// nth node represent as given node  
// kth node represents as left and right node  
static void printPath(Vector<Integer> res, 
                    int nThNode, int kThNode)  
{  
    // base condition  
    // if kth node value is greater  
    // then nth node then its means  
    // kth node is not valid so  
    // we not store it into the res  
    // simply we just return  
    if (kThNode > nThNode)  
        return;  
  
    // Storing node into res  
    res.add(kThNode);  
  
    // Print the path from root to node  
    for (int i = 0; i < res.size(); i++)  
        System.out.print( res.get(i) + " ");  
    System.out.print( "\n");  
  
    // store left path of a tree  
    // So for left we will go node(kThNode*2)  
    printPath(res, nThNode, kThNode * 2);  
  
    // right path of a tree  
    // and for right we will go node(kThNode*2+1)  
    printPath(res, nThNode, kThNode * 2 + 1);  
      
    res.remove(res.size()-1); 
}  
  
// Function to print path from root to all of the nodes  
static void printPathToCoverAllNodeUtil(int nThNode)  
{  
    // res is for store the path  
    // from root to particulate node  
    Vector<Integer> res=new Vector<Integer>();  
  
    // Print path from root to all node.  
    // third argument 1 because of we have  
    // to consider root node is 1  
    printPath(res, nThNode, 1);  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    // Given Node  
    int nThNode = 7;  
  
    // Print path from root to all node.  
    printPathToCoverAllNodeUtil(nThNode);  
} 
} 
  
// This code is contributed by Arnab Kundu 

