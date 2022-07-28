

// C# program to count the number of nodes 
// in the tree whose weight is a 
// Fibonacci number 
using System; 
using System.Collections.Generic; 
  
public class GFG{ 
    
static int sz = (int) 1e5; 
static int ans = 0; 
    
static List<int> []graph = new List<int>[100]; 
static int []weight = new int[100]; 
    
// To store all fibonacci numbers 
static HashSet<int> fib = new HashSet<int>(); 
    
// Function to generate fibonacci numbers using 
// Dynamic Programming and create hash table 
// to check Fibonacci numbers 
static void fibonacci() 
{ 
    // Inserting the first two Fibonacci numbers 
    // in the hash 
    int prev = 0, curr = 1, len = 2; 
    fib.Add(prev); 
    fib.Add(curr); 
    
    // Computing the Fibonacci numbers until 
    // the maximum number and storing them 
    // in the hash 
    while (len <= sz) { 
        int temp = curr + prev; 
        fib.Add(temp); 
        prev = curr; 
        curr = temp; 
        len++; 
    } 
} 
    
// Function to perform dfs 
static void dfs(int node, int parent) 
{ 
    // Check if the weight of the node 
    // is a Fibonacci number or not 
    if (fib.Contains(weight[node])) 
        ans += 1; 
    
    // Performing DFS to iterate the 
    // remaining nodes 
    foreach (int to in graph[node]) { 
        if (to == parent) 
            continue; 
        dfs(to, node); 
    } 
} 
    
// Driver code 
public static void Main(String[] args) 
{ 
    for(int i = 0; i < 100; i++) { 
        graph[i] = new List<int>(); 
    } 
   
    // Weights of the node 
    weight[1] = 5; 
    weight[2] = 10; 
    weight[3] = 11; 
    weight[4] = 8; 
    weight[5] = 6; 
    
    // Edges of the tree 
    graph[1].Add(2); 
    graph[2].Add(3); 
    graph[2].Add(4); 
    graph[1].Add(5); 
    
    // Generate fibonacci numbers 
    fibonacci(); 
    
    // Call the dfs function to 
    // traverse through the tree 
    dfs(1, 1); 
    
    Console.Write(ans +"\n"); 
    
} 
} 
// This code contributed by Rajput-Ji 

