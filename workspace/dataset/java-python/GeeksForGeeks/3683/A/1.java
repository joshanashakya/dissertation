

import java.util.Vector; 
  
// Java program to find coordinate of the  
// triangle given midpoint of each side  
class GFG { 
  
//static final int N = 3;  
// Return after solving the equations and  
// finding the vertices coordinate.  
    static Vector<Integer> solve(int v[]) { 
        Vector<Integer> res = new Vector<Integer>(); 
  
        // Finding sum of all three coordinate.  
        int all3 = v[0] + v[1] + v[2]; 
  
        // Solving the equation.  
        res.add(all3 - v[1] * 2); 
        res.add(all3 - v[2] * 2); 
        res.add(all3 - v[0] * 2); 
  
        return res; 
    } 
  
// Finds vertices of a triangles from given  
// middle vertices.  
    static void findVertex(int xmid[], int ymid[]) { 
        // Find X coordinates of verices.  
        Vector<Integer> V1 = solve(xmid); 
  
        // Find Y coordinates of verices.  
        Vector<Integer> V2 = solve(ymid); 
  
        // Output the solution.  
        for (int i = 0; i < 3; i++) { 
            System.out.println(V1.get(i) + " " + V2.get(i)); 
        } 
  
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int xmid[] = {5, 4, 5}; 
        int ymid[] = {3, 4, 5}; 
        findVertex(xmid, ymid); 
    } 
} 
// This code is contributed by 
// PrinciRaj1992 

