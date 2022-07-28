

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// To store the required answer  
static int ans = 0;  
  
// To store the graph  
static Vector<Vector<Integer>> gr = new Vector<Vector<Integer>>();  
  
// Function to add edges  
static void Add_Edge(int u, int v)  
{  
    gr.get(u).add(v);  
    gr.get(v).add(u);  
}  
  
// Dfs function  
static void dfs(int child, int par, int color[])  
{  
  
    // When there is difference in colors  
    if (color[child] != color[par])  
        ans++;  
  
    // For all it's child nodes  
    for (int i = 0; i < gr.get(child).size(); i++) 
    {  
        if (gr.get(child).get(i) == par)  
            continue;  
        dfs(gr.get(child).get(i), child, color);  
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    for(int i = 0; i <= 10; i++) 
    gr.add(new Vector<Integer>()); 
  
    // Here zero is for parent of node 1  
    int color[] = { 0, 1, 2, 3, 2, 2, 3 };  
  
    // Adding edges in the graph  
    Add_Edge(1, 2);  
    Add_Edge(1, 3);  
    Add_Edge(2, 4);  
    Add_Edge(2, 5);  
    Add_Edge(3, 6);  
  
    // Dfs call  
    dfs(1, 0, color);  
  
    // Required answer  
    System.out.println( ans);  
}  
}  
  
// This code is contributed by Arnab Kundu 

