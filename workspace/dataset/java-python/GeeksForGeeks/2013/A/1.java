

// Java program for sum of the  
// series 5 + 55 + 555.....n 
  
class GFG  
{ 
  
    // function which return the 
    // the sum of series 
    static int sumOfSeries(int n) 
    { 
        return (int) (0.6172 *  
                     (Math.pow(10, n) - 1) - 
                                0.55 * n); 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int n = 2; 
        System.out.println(sumOfSeries(n)); 
    } 
} 
  
// This code is contributed by UPENDRA BARTWAL. 

