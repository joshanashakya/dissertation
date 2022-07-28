

// Java program for above implementation 
class GFG { 
      
    // Function to find no. of elements 
    // to be added from 1 to get n 
    static int findS(int s) 
    { 
        int sum = 0; 
  
        // Start adding numbers from 1 
        for (int n = 1; sum < s; n++)  
        { 
            sum += n; 
      
            // If sum becomes equal to s 
            // return n 
            if (sum == s) 
                return n; 
        } 
  
        return -1; 
    } 
  
    // Drivers code 
    public static void main(String[]args) 
    { 
          
        int s = 15; 
        int n = findS(s); 
        if(n == -1)  
            System.out.println("-1"); 
        else
            System.out.println(n); 
    } 
} 
  
//This code is contributed by Azkia Anam. 

