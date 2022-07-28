

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to check if it is possible or not  
    static boolean checkTriangularSumRepresentation(int n)  
    { 
        HashSet<Integer> tri = new HashSet<>(); 
        int i = 1; 
  
        // Store all triangular numbers up to N in a Set  
        while (true)  
        { 
            int x = i * (i + 1) / 2; 
            if (x >= n)  
            { 
                break; 
            } 
            tri.add(x); 
            i++; 
        } 
  
        // Check if a pair exists  
        for (Integer tm : tri)  
        { 
            if (tri.contains(n - tm) && (n - tm) !=  
                (int) tri.toArray()[tri.size() - 1]) 
            { 
                return true; 
            } 
        } 
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 24; 
        if (checkTriangularSumRepresentation(n))  
        { 
            System.out.println("Yes"); 
        } 
        else
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

