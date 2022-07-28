

// Java program to print sideways 
// traversal of complete binary tree 
import java.util.*; 
  
class GFG 
{ 
      
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
static int sz = (int) 1e5; 
static int maxLevel = 0; 
  
// Adjacency list representation 
// of the tree 
static Vector<Integer> []tree = new Vector[sz + 1]; 
  
// Boolean array to mark all the 
// vertices which are visited 
static boolean []vis = new boolean[sz + 1]; 
  
// Integer array to store the level 
// of each node 
static int []level = new int[sz + 1]; 
  
// Array of vector where ith index 
// stores all the nodes at level i 
static Vector<Integer> []nodes = new Vector[sz + 1]; 
  
// Utility function to create an 
// edge between two vertices 
static void addEdge(int a, int b) 
{ 
  
    // Add a to b's list 
    tree[a].add(b); 
  
    // Add b to a's list 
    tree[b].add(a); 
} 
  
// Modified Breadth-First Function 
static void bfs(int node) 
{ 
  
    // Create a queue of {child, parent} 
    Queue<pair > qu = new LinkedList<>(); 
  
    // Push root node in the front of 
    // the queue and mark as visited 
    qu.add(new pair( node, 0 )); 
    nodes[0].add(node); 
    vis[node] = true; 
    level[1] = 0; 
  
    while (!qu.isEmpty()) { 
  
        pair p = qu.peek(); 
  
        // Dequeue a vertex from queue 
        qu.remove(); 
        vis[p.first] = true; 
  
        // Get all adjacent vertices of the dequeued 
        // vertex s. If any adjacent has not 
        // been visited then enqueue it 
        for (int child : tree[p.first]) { 
  
            if (!vis[child]) { 
                qu.add(new pair( child, p.first )); 
                level[child] = level[p.first] + 1; 
                maxLevel = Math.max(maxLevel, level[child]); 
                nodes[level[child]].add(child); 
            } 
        } 
    } 
} 
  
// Utility Function to display the pattern 
static void display() 
{ 
    // k represents the level no. 
    // cycle represents how many 
    // cycles has been completed 
    int k = 0, path = 0; 
    int condn = (maxLevel) / 2 + 1; 
    boolean flag = true; 
  
    // While there are nodes left to traverse 
    while (condn-- > 0) { 
  
        if (flag) { 
  
            // Traversing whole level from 
            // left to right 
            int j = nodes[k].size() - 1; 
            for (j = 0; j < nodes[k].size() - path; j++) 
                System.out.print(nodes[k].get(j)+ " "); 
  
            // Moving to new level 
            k++; 
  
            // Traversing rightmost unvisited 
            // element in path path as we 
            // move up to down 
            while (k < maxLevel) { 
  
                j = nodes[k].size() - 1; 
                System.out.print(nodes[k].get(j - path)+ " "); 
                k++; 
            } 
  
            j = nodes[k].size() - 1; 
            if (k > path) 
                for (j -= path; j >= 0; j--) 
                    System.out.print(nodes[k].get(j)+ " "); 
  
            // Setting value of new maximum 
            // level upto which we have to traverse 
            // next time 
            maxLevel--; 
  
            // Updating from which level to 
            // start new path 
            k--; 
            path++; 
  
            flag = !flag; 
        } 
        else { 
  
            // Traversing each element of remaing 
            // last level from left to right 
            int j = nodes[k].size() - 1; 
            for (j = 0; j < nodes[k].size() - path; j++) 
                System.out.print(nodes[k].get(j)+ " "); 
  
            // Decrementing value of Max level 
            maxLevel--; 
  
            k--; 
  
            // Traversing rightmost unvisited 
            // element in path as we 
            // move down to up 
            while (k > path) { 
  
                int c = nodes[k].size() - 1; 
                System.out.print(nodes[k].get(c - path)+ " "); 
                k--; 
            } 
  
            j = nodes[k].size() - 1; 
  
            if (k == path) 
                for (j -= path; j >= 0; j--) 
                    System.out.print(nodes[k].get(j)+ " "); 
  
            path++; 
  
            // Updating the level number from which 
            // a new cycle has to be started 
            k++; 
            flag = !flag; 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    for (int i = 0; i < tree.length; i++) { 
        tree[i] = new Vector<>(); 
        nodes[i] = new Vector<>(); 
    } 
      
    // Initialising the above mentioned 
    // complete binary tree 
    for (int i = 1; i <= 5; i++) { 
  
        // Adding edge to a binary tree 
        addEdge(i, 2 * i); 
        addEdge(i, 2 * i + 1); 
    } 
  
    // Calling modified bfs function 
    bfs(1); 
  
    display(); 
} 
} 
  
// This code is contributed by 29AjayKumar 

