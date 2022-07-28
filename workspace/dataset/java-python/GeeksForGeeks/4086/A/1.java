

// Java Efficient solution to find  
// sum of arithmetic series. 
class GFG 
{ 
    static float sumOfAP(float a, float d, float n) 
    { 
        float sum = (n / 2) * (2 * a + (n - 1) * d); 
        return sum; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        float n = 20; 
        float a = 2.5f, d = 1.5f; 
        System.out.print(sumOfAP(a, d, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

