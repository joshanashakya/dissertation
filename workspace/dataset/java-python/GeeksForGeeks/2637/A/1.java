

// Java code to generate 
// 'Nth' term of this sequence 
  
class GFG { 
  
    // Function to generate a fixed number 
    public static int nthTerm(int N) 
    { 
        int nth = 0; 
  
        //(N^2*(N+1))/2 
        nth = (N * N * (N + 1)) / 2; 
  
        return nth; 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
        int N = 5; 
  
        System.out.println(nthTerm(N)); 
    } 
    // This code is contributed by 29AjayKumar 
} 

