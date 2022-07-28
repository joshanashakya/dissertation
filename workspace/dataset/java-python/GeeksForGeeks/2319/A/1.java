

// Java program to all possible  
// points of a parallelogram 
public class ParallelogramPoints{  
      
    // Driver code 
    public static void main(String[] s) 
    { 
        int ax = 5, ay = 0; //coordinates of A 
        int bx = 1, by = 1; //coordinates of B 
        int cx = 2, cy = 5; //coordinates of C 
        System.out.println(ax + bx - cx + ", " 
                           + (ay + by - cy)); 
        System.out.println(ax + cx - bx + ", "
                           + (ay + cy - by)); 
        System.out.println(cx + bx - ax + ", "
                           + (cy + by - ax)); 
    } 
} 
  
// This code is contributed by Prerna Saini 

