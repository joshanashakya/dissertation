

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static int maximum = Integer.MIN_VALUE, x, ans = Integer.MAX_VALUE;  
  
static Vector<Vector<Integer>> graph = new Vector<Vector<Integer>>();  
static Vector<Integer> weight = new Vector<Integer>();  
  
//number of set bits 
static int __builtin_popcount(int x) 
{ 
    int c = 0; 
    for(int i = 0; i < 60; i++) 
    if(((x>>i)&1) != 0)c++; 
      
    return c; 
} 
  
// Function to perform dfs to find  
// the maximum value  
static void dfs(int node, int parent)  
{  
    // If current set bits value is greater than 
    // the current maximum 
    int a = __builtin_popcount(weight.get(node) + x); 
    if (maximum < a)  
    { 
        maximum = a; 
        ans = node; 
    } 
  
    // If count is equal to the maximum 
    // then choose the node with minimum value 
    else if (maximum == a) 
        ans = Math.min(ans, node); 
          
    for (int i = 0; i < graph.get(node).size(); i++)  
    {  
        if (graph.get(node).get(i) == parent)  
            continue;  
        dfs(graph.get(node).get(i), node);  
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    x = 15;  
  
    // Weights of the node  
    weight.add(0);  
    weight.add(5);  
    weight.add(10);;  
    weight.add(11);;  
    weight.add(8);  
    weight.add(6);  
      
    for(int i = 0; i < 100; i++) 
    graph.add(new Vector<Integer>()); 
  
    // Edges of the tree  
    graph.get(1).add(2);  
    graph.get(2).add(3);  
    graph.get(2).add(4);  
    graph.get(1).add(5);  
  
    dfs(1, 1);  
  
    System.out.println( ans);  
} 
}  
  
// This code is contributed by Arnab Kundu 

