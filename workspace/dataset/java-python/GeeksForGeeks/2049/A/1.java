

// Java program to check given  
// number y is power of x 
  
class GFG  
{ 
    static boolean isPower(int x,  
                           int y) 
    { 
        // logarithm function to 
        // calculate value 
        int res1 = (int)Math.log(y) /  
                   (int)Math.log(x); 
                     
         // Note : this is double           
        double res2 = Math.log(y) /  
                      Math.log(x);  
      
        // compare to the result1 or 
        // result2 both are equal 
        return (res1 == res2); 
    } 
      
    // Driver Code 
    public static void main(String args[])  
    { 
        if(isPower(27, 729)) 
            System.out.println("1"); 
        else
            System.out.println("0"); 
    } 
} 
  
// This code is contributed by Sam007 

