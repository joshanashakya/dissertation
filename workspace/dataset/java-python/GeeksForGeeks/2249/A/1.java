

// Java implementation of the approach 
class GFG 
{ 
      
    // Recursive function to return gcd  
    static int calgcd(int a, int b)  
    {  
        if (b == 0)  
            return a;  
        return calgcd(b, a % b);  
    } 
      
    // Function to return the count of  
    // the required integers 
    static int getCount(int [] a, int n) 
    { 
      
        // To store the gcd of the array elements 
        int gcd = 0; 
        for (int i = 0; i < n; i++) 
            gcd = calgcd(gcd, a[i]); 
      
        // To store the count of factors 
        // of the found gcd 
        int cnt = 0; 
      
        for (int i = 1; i * i <= gcd; i++)  
        { 
            if (gcd % i == 0)  
            { 
      
                // If g is a perfect square 
                if (i * i == gcd) 
                    cnt++; 
      
                // Factors appear in pairs 
                else
                    cnt += 2; 
            } 
        } 
        return cnt; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int [] a = { 4, 16, 1024, 48 }; 
        int n = a.length; 
      
        System.out.println(getCount(a, n)); 
    } 
} 
  
// This code is contributed by ihritik 

