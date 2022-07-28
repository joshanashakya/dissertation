

// Java program for the above approach  
  
class GFG  
{ 
  
    // Function to calculate  
    // min swaps to make  
    // binary strings equal  
    static int minSwaps(String s1, String s2)  
    {  
      
        int c0 = 0, c1 = 0;  
      
        for (int i = 0; i < s1.length(); i++) 
        {  
            // Count of zero's  
            if (s1.charAt(i) == '0' && s2.charAt(i) == '1') 
            {  
                c0++;  
            } 
              
            // Count of one's  
            else if (s1.charAt(i) == '1' && s2.charAt(i) == '0') 
            {  
                c1++;  
            }  
        }  
      
        // As discussed  
        // above  
        int ans = c0 / 2 + c1 / 2;  
      
        if (c0 % 2 == 0 && c1 % 2 == 0) 
        {  
            return ans;  
        }  
        else if ((c0 + c1) % 2 == 0)  
        {  
            return ans + 2;  
        }  
        else
        {  
            return -1;  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
      
        String s1 = "0011", s2 = "1111";  
        int ans = minSwaps(s1, s2);  
      
        System.out.println(ans);  
      
    }  
  
} 
  
// This code is contributed by AnkitRai01 

