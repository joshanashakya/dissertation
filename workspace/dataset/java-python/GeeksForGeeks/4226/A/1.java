

// Java program to Generating numbers that   
// are divisor of their right-rotations    
  
public class GFG { 
      
    // Function to check if N is a   
    // divisor of its right-rotation  
    static boolean rightRotationDivisor(int N)  
    {  
        int lastDigit = N % 10;  
        int rightRotation = (int)(lastDigit * Math.pow(10 ,(int)(Math.log10(N)))   
                        + Math.floor(N / 10));   
        return (rightRotation % N == 0);  
    }  
          
    // Function to generate m-digit   
    // numbers which are divisor of   
    // their right-rotation   
    static void generateNumbers(int m)  
    {  
        for (int i= (int)Math.pow(10,(m - 1)); i < Math.pow(10 , m);i++)   
            if (rightRotationDivisor(i))  
                System.out.println(i);  
     }  
  
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int m = 3;  
        generateNumbers(m);  
      
    } 
    // This Code is contributed by ANKITRAI1 
} 
   

