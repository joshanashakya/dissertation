

// Java program to find the count of  
// natural octal numbers upto N digits  
  
public class GFG { 
      
    // Function to return the count of  
    // natural octal numbers upto N digits  
    static int count(int N)  
    {  
        int sum = 0;  
      
        // Loop to iterate from 1 to N  
        // and calculating number of  
        // octal numbers for every 'i'th digit.  
        for (int i = 1; i <= N; i++) {  
            sum += 7 * Math.pow(8, i - 1);  
        }  
        return sum;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int N = 4;  
        System.out.println(count(N));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

