

// Java program to find size of  
// subset of graph vertex such that  
// each vertex has more than 1 color edges  
import java.util.*; 
  
class GFG  
{ 
  
    // Number of vertices  
    static int N = 6; 
  
    // function to calculate max subset size  
    static int subsetGraph(int C[][]) 
    { 
        // set for number of vertices  
        HashSet<Integer> vertices = new HashSet<>(); 
        for (int i = 0; i < N; ++i)  
        { 
            vertices.add(i); 
        } 
  
        // loop for deletion of vertex from set  
        while (!vertices.isEmpty()) 
        { 
              
            // if subset has only 1 vertex return 0  
            if (vertices.size() == 1) 
            { 
                return 1; 
            } 
  
            // for each vertex iterate and keep removing  
            // a vertix while we find a vertex with all  
            // edges of same color.  
            boolean someone_removed = false; 
            for (int x : vertices)  
            { 
                  
                // note down different color values  
                // for each vertex  
                HashSet<Integer> values = new HashSet<>(); 
                for (int y : vertices)  
                { 
                    if (y != x)  
                    { 
                        values.add(C[x][y]); 
                    } 
                } 
  
                // if only one color is found  
                // erase that vertex (bad vertex)  
                if (values.size() == 1)  
                { 
                    vertices.remove(x); 
                    someone_removed = true; 
                    break; 
                } 
            } 
  
            // If no vertex was removed in the  
            // above loop.  
            if (!someone_removed)  
            { 
                break; 
            } 
        } 
  
        return (vertices.size()); 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int C[][] = {{0, 9, 2, 4, 7, 8}, 
        {9, 0, 9, 9, 7, 9}, 
        {2, 9, 0, 3, 7, 6}, 
        {4, 9, 3, 0, 7, 1}, 
        {7, 7, 7, 7, 0, 7}, 
        {8, 9, 6, 1, 7, 0} 
        }; 
        System.out.println(subsetGraph(C)); 
    } 
}  
  
// This code has been contributed by 29AjayKumar 

