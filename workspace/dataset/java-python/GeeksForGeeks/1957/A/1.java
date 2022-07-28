

// Java implementation of the approach  
  
class GFG 
{ 
    // Function that returns true if num  
    // contains at least one digit  
    // that divides k  
    static boolean digitDividesK(int num, int k)  
    {  
        while (num != 0)  
        {  
      
            // Get the last digit  
            int d = num % 10;  
      
            // If the digit is non-zero  
            // and it divides k  
            if (d != 0 && k % d == 0)  
                return true;  
      
            // Remove the last digit  
            num = num / 10;  
        }  
      
        // There is no digit in num  
        // that divides k  
        return false;  
    }  
      
    // Function to return the required  
    // count of elements from the given  
    // range which contain at least one  
    // digit that divides k  
    static int findCount(int l, int r, int k)  
    {  
      
        // To store the result  
        int count = 0;  
      
        // For every number from the range  
        for (int i = l; i <= r; i++)  
        {  
      
            // If any digit of the current  
            // number divides k  
            if (digitDividesK(i, k))  
                count++;  
        }  
        return count;  
    }  
      
    // Driver code  
    public static void main(String []args) 
    {  
        int l = 20, r = 35;  
        int k = 45;  
      
        System.out.println(findCount(l, r, k));  
    }  
} 
  
// This code is contributed by PrinciRaj1992 

