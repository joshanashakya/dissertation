

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to print the required sequence  
    static void generateSequence(int n, int g)  
    {  
        for (int i = 1; i <= n; i++)  
            System.out.print(i * g + " ");;  
    }  
      
    // Driver Code 
    public static void main(String []args) 
    { 
        int n = 6, g = 5;  
        generateSequence(n, g);  
      
    } 
} 
  
// This code is contributed by Rituraj Jain 

