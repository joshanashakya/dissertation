

// Java implementation of the above approach  
  
public class GFG{ 
  
    // Function to return required count  
    static int SquareCube(long N)  
    {  
      
        int cnt = 0, i = 1;  
      
        while ((int)(Math.pow(i, 6)) <= N) {  
            ++cnt;  
            ++i;  
        }  
      
        return cnt;  
    }  
      
    public static void main(String []args) 
    {  
        long N = 100000;  
      
        // function call to print required answer  
        System.out.println(SquareCube(N)) ; 
    }  
    // This code is contributed by Ryuga 
} 

