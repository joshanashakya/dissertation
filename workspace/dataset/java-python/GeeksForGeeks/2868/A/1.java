

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
static int cnt = 0;  
  
static Vector<Vector<Integer>> graph = new Vector<Vector<Integer>>();  
static Vector<String> weight = new Vector<String>();  
  
// Function that returns true  
// if x is a palindrome  
static boolean isPalindrome(String x)  
{  
    int n = x.length();  
    for (int i = 0; i < n / 2; i++) 
    {  
        if (x.charAt(i) != x.charAt(n - 1 - i))  
            return false;  
    }  
    return true;  
}  
  
// Function to perform dfs  
static void dfs(int node, int parent)  
{  
  
    // Weight of the current node  
    String x = weight.get(node);  
      
  
    // If the weight is a palindrome  
    if (isPalindrome(x))  
        cnt += 1;  
  
    for (int i=0;i<graph.get(node).size();i++) 
    {  
          
        if ( graph.get(node).get(i)== parent)  
            continue;  
        dfs(graph.get(node).get(i), node);  
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
  
    // Weights of the node  
    weight.add( "");  
    weight.add( "abc");  
    weight.add( "aba");  
    weight.add( "bcb");  
    weight.add( "moh");  
    weight.add( "aa");  
      
    for(int i = 0; i < 100; i++) 
    graph.add(new Vector<Integer>()); 
      
    // Edges of the tree  
    graph.get(1).add(2);  
    graph.get(2).add(3);  
    graph.get(2).add(4);  
    graph.get(1).add(5);  
    dfs(1, 1);  
  
    System.out.println( cnt);  
} 
} 
  
// This code is contributed by Arnab Kundu 

