

// Java implementation of the above approach  
class GfG 
{ 
  
    // Function to find largest integer less than  
    // or equal to N/2 and is coprime with N  
    static int largestCoprime(int N)  
    {  
          
        // Handle the case for N = 6  
        if (N == 6)  
            return 1;  
      
        else if (N % 4 == 0)  
            return (N / 2) - 1;  
      
        else if (N % 2 == 0)  
            return (N / 2) - 2;  
      
        else
            return ((N - 1) / 2);  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
        int n = 50;  
        System.out.println(largestCoprime(n)); 
    } 
} 
      
// This code is contributed by Rituraj Jain 

