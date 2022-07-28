

// Java program to reach bottom right corner 
// using minimum jumps. 
import java.util.*; 
  
class GFG 
{ 
static int R = 3, C = 3; 
  
// function to check coordinates are in valid range. 
static boolean safe(int x, int y) 
{ 
    if (x < R && y < C && x >= 0 && y >= 0) 
        return true; 
    return false; 
} 
  
// pair class 
static class pair<T, R> 
{ 
    T first; 
    R second; 
    pair(T t, R r) 
    { 
        first = t; 
        second = r; 
    } 
} 
  
// function to return minimum no of cells  
// to reach bottom right cell. 
static int matrixJump(int M[][], int R1, int C1) 
{ 
    Queue<pair<Integer,  
          pair<Integer,  
               Integer>>> q = new LinkedList<>(); 
  
    // push the no of cells and coordinates in a queue. 
    q.add(new pair(1, new pair(R1, C1))); 
  
    while (q.size() > 0) 
    { 
        int x = q.peek().second.first; // x coordinate 
        int y = q.peek().second.second; // y coordinate 
        int no_of_cells = q.peek().first; // no of cells 
  
        q.remove(); 
  
        // when it reaches bottom right return no of cells 
        if (x == R - 1 && y == C - 1)          
            return no_of_cells; 
  
        int v = M[x][y]; 
  
        if (safe(x + v, y)) 
            q.add(new pair(no_of_cells + 1,  
                  new pair(x + v, y))); 
  
        if (safe(x, y + v)) 
            q.add(new pair(no_of_cells + 1,  
                  new pair(x, y + v))); 
    } 
  
    // when destination cannot be reached 
    return -1; 
} 
  
// Driver Code 
public static void main(String ars[]) 
{ 
    int M[][] = {{ 2, 4, 2 }, 
                 { 5, 3, 8 }, 
                 { 1, 1, 1 }}; 
    System.out.print( matrixJump(M, 0, 0)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

