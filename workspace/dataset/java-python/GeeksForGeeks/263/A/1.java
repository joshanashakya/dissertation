

// Java program to check whether the given  
// number N is the perfect cube or not  
class GFG { 
      
    // Function to check if a number  
    // is a perfect Cube or not  
    static void perfectCube(int N)  
    {  
        int cube;  
      
        // Iterate from 1-N  
        for (int i = 0; i <= N; i++) {  
      
            // Find the cube of  
            // every number  
            cube = i * i * i;  
      
            // Check if cube equals  
            // N or not  
            if (cube == N) {  
                System.out.println("Yes");  
                return;  
            }  
            else if (cube > N) {  
                System.out.println("NO");  
                return;  
            }  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int N = 216;  
      
        // Function call  
        perfectCube(N);  
  
    }  
} 
  
// This code is contributed by AnkitRai01 

