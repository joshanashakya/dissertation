

// Java program to find the Minimum length String  
// with Sum of the alphabetical values  
// of the characters equal to N  
class GFG  
{ 
  
    // Function to find the minimum length  
    static int minLength(int n)  
    {  
        int ans = n / 26;  
        if (n % 26 != 0)  
            ans++;  
      
        return ans;  
    }  
      
    // Function to find the minimum length String  
    static String minString(int n)  
    {  
        int ans = n / 26;  
        String res = "";  
      
        while (ans-- != 0) 
        {  
            res = res + "z";  
        }  
      
        if (n % 26 != 0)  
        {  
            res = res + (char)((n % 26) + 96);  
        }  
      
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 50;  
      
        System.out.println(minLength(n)); 
        System.out.println(minString(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

