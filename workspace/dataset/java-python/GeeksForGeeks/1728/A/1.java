

// Java Code implementation of the above approach 
class GFG { 
      
    static int centeredSquare_number(int N)  
    {      
        float n = (9 + (float)Math.sqrt(36*N+45))/18;   
        if (n - (int) n == 0) 
            return 1; 
        else
            return 0; 
    }  
      
    // Driver code 
    public static void main (String[] args)  
    {  
        int i = 13; 
        System.out.println(centeredSquare_number(i)); 
    }  
      
} 
  
// This code is contributed by Yash_R 

