

// Efficient Java Program to print all cube free 
// numbers smaller than or equal to n. 
class GFG { 
  
    public static void printCubeFree(int n) 
    { 
        // Initialize all numbers as not cube free  
        boolean[] cubFree = new boolean[n + 1]; 
        for (int i = 0; i <= n; i++)  
            cubFree[i] = true; 
          
        // Traverse through all possible cube roots 
        for (int i = 2; i * i * i <= n; i++) { 
  
            // If i itself is cube free 
            if (cubFree[i]) { 
  
                // Mark all multiples of i as not cube free 
                for (int multiple = 1; i * i * i * multiple <= n; 
                                                   multiple++) { 
  
                    cubFree[i * i * i * multiple] = false; 
                } 
            } 
        } 
  
        // Print all cube free numbers 
        for (int i = 2; i <= n; i++) { 
            if (cubFree[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        printCubeFree(20); 
    } 
} 

