

// Java implementation of the approach 
  
class GFG  
{ 
  
    // Function to return the 
    // required rate percentage 
    static int Rate(int N1, int N2) 
    { 
        float rate = (N2 - N1) * 100 / N1; 
  
        return (int)rate; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int N1 = 100, N2 = 120; 
  
        System.out.println(Rate(N1, N2) + " %"); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

