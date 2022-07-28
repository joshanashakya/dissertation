

// Java code to check if a given  
// number is Triperfect or not  
  
public class GFG{ 
      
    // Returns true if n is Triperfect  
    static boolean isTriPerfect(int n )  
    {  
        // To store sum of divisors.  
        // Adding 1 and n since they are divisors of n.  
        int sum = 1 + n;  
          
        // Find all divisors and add them  
        int i = 2;  
        while (i * i <= n)  
        {  
        if (n % i == 0)  
            {  
                if (n / i == i)  
                    sum = sum + i;  
                else
                    sum = sum + i + n / i;  
            }  
            i += 1;  
        }  
          
        // If sum of divisors is equal to  
        // 3 * n, then n is a Triperfect number  
        if (sum == 3 * n & n != 1)  
            return true;  
        else
            return  false;  
    }  
      
    // Driver program  
    public static void main(String []args) 
    {  
    int n = 120;  
      
    if (isTriPerfect(n))  
        System.out.println(n + " is a Triperfect number");      
    }  
      
    //This code is contributed by  
    // Ryuga 
} 

