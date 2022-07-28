

// Java implementation for the above approach  
class GFG 
{ 
  
    // Function to check if the given number  
    // is a factorial of any number  
    static boolean isFactorial(int n)  
    {  
        for (int i = 1;; i++)  
        {  
            if (n % i == 0)  
            {  
                n /= i;  
            }  
            else 
            {  
                break;  
            }  
        }  
      
        if (n == 1)  
        {  
            return true;  
        }  
        else 
        {  
            return false;  
        }  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int n = 24;  
        boolean ans = isFactorial(n);  
          
        if (ans == true)  
        {  
            System.out.println("Yes");  
        }  
        else
        {  
            System.out.println("No");  
        }  
    }  
} 
  
// This code is contributed by AnkitRai01 

