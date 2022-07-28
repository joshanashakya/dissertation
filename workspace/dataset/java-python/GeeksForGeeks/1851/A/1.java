

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
static int ans = 0;  
  
static Vector<Vector<Integer>> graph = new Vector<Vector<Integer>>();  
static Vector<Integer> weight = new Vector<Integer>();  
  
// Function that returns true if count  
// of set bits in x is even  
static boolean isEvenParity(int x)  
{  
    // parity will store the  
    // count of set bits  
    int parity = 0;  
    while (x != 0)  
    {  
        x = x & (x - 1);  
        parity++;  
    }  
  
    if (parity % 2 == 0)  
        return true;  
    else
        return false;  
}  
  
// Function to perform dfs  
static void dfs(int node, int parent)  
{  
    // If weight of the current  
    // node has even parity  
    if (isEvenParity(weight.get(node) )) 
        ans += 1;  
  
    for (int i = 0; i < graph.get(node).size(); i++)  
    {  
        if (graph.get(node).get(i) == parent)  
            continue;  
        dfs(graph.get(node).get(i) , node);  
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    // Weights of the node  
    weight.add( 0);  
    weight.add( 5);  
    weight.add( 10);;  
    weight.add( 11);;  
    weight.add( 8);  
    weight.add( 6);  
  
    for(int i=0;i<100;i++) 
    graph.add(new Vector<Integer>()); 
      
    // Edges of the tree  
    graph.get(1).add(2);  
    graph.get(2).add(3);  
    graph.get(2).add(4);  
    graph.get(1).add(5);  
  
    dfs(1, 1);  
  
    System.out.println( ans );  
  
} 
} 
  
// This code is contributed by Arnab Kundu 

