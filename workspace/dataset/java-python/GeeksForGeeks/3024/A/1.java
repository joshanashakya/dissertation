

// Java implementation of the above approach  
  
class GFG 
{ 
  
    // Function to return digit sum  
    static int digitSum(int n)  
    {  
        int ans = 0;  
        while (n != 0) 
        {  
            ans += n % 10;  
            n /= 10;  
        }  
      
        return ans;  
    }  
      
    // Function to find out the  
    // smallest integer  
    static int findInt(int n, int m)  
    {  
        int minDigit = (int)Math.floor((double)(m / 9));  
      
        // Start of the iterator (Smallest multiple of n)  
        int start = (int)Math.pow(10, minDigit) -  
                    (int)Math.pow(10, minDigit) % n;  
      
        while (start < Integer.MAX_VALUE)  
        {  
            if (digitSum(start) == m)  
                return start;  
            else
                start += n;  
        }  
        return -1;  
    }  
  
    // Driver code  
    static public void main(String args[])  
    {  
        int n = 13, m = 32;  
        System.out.print(findInt(n, m));  
    }  
} 
  
// This code is contributed  
// by Akanksha Rai 

