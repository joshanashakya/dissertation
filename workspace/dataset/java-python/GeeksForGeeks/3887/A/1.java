

//Java code to find the bucket to choose  
// for picking flowers out of it 
import java.lang.System.*; 
  
class GFG { 
      
    static int findBucketNo(int p) 
    { 
        return (int)Math.ceil((  
        Math.sqrt( 8*p + 1 ) -1 ) / 2 ) ; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int p = 10 ;  
          
        System.out.println(findBucketNo(p)); 
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

