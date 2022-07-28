

// Java program to check whether the given 
// number N is the perfect cube or not 
public class GFG { 
  
    // Function to check if a number is 
    // a perfect Cube using inbuilt function 
    static void perfectCube(int N) 
    { 
        int cube_root; 
        cube_root = (int)Math.round(Math.cbrt(N)); 
      
        // If cube of cube_root is equals to N, 
        // then print Yes Else print No 
        if (cube_root * cube_root * cube_root == N) { 
            System.out.println("Yes"); 
            return; 
        } 
        else { 
            System.out.println("NO"); 
            return; 
        } 
    } 
      
    // Driver's code 
    public static void main (String[] args)  
    { 
        int N = 125; 
      
        // Function call to check 
        // N is cube or not 
        perfectCube(N); 
      
    } 
  
} 
// This code is contributed by AnkitRai01 

