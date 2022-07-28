

// Java implementation of the approach  
public class GFG  
{ 
      
    // Function to check if parity  
    // can be made same or not  
    static boolean flipsPossible(int []a, int n)  
    {  
      
        int count_odd = 0, count_even = 0;  
      
        // Iterate and count the parity  
        for (int i = 0; i < n; i++)  
        {  
      
            // Odd  
            if ((a[i] & 1) == 1)  
                count_odd++;  
      
            // Even  
            else
                count_even++;  
        }  
      
        // Condition check  
        if (count_odd % 2 == 1 && count_even % 2 == 1)  
            return false;  
      
        else
            return true;  
    }  
      
    // Drivers code  
    public static void main (String[] args)  
    {  
        int []a = { 1, 0, 1, 1, 0, 1 };  
        int n = a.length;  
      
        if (flipsPossible(a, n))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
} 
  
// This code is contributed by AnkitRai01 

