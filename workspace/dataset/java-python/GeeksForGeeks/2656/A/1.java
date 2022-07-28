

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to insert n 0s in the  
    // beginning of the given string  
    static String addZeros(String str, int n)  
    {  
        for (int i = 0; i < n; i++)  
        {  
            str = "0" + str;  
        }  
        return str; 
    }  
      
    // Function to return the XOR  
    // of the given strings  
    static String getXOR(String a, String b)  
    {  
      
        // Lengths of the given strings  
        int aLen = a.length();  
        int bLen = b.length();  
      
        // Make both the strings of equal lengths  
        // by inserting 0s in the beginning  
        if (aLen > bLen)  
        {  
            a = addZeros(b, aLen - bLen);  
        }  
        else if (bLen > aLen)  
        {  
            a = addZeros(a, bLen - aLen);  
        }  
      
        // Updated length  
        int len = Math.max(aLen, bLen);  
      
        // To store the resultant XOR  
        String res = "";  
          
        for (int i = 0; i < len; i++) 
        {  
            if (a.charAt(i) == b.charAt(i))  
                res += "0";  
            else
                res += "1";  
        }  
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String a = "11001", b = "111111";  
      
        System.out.println(getXOR(a, b));  
    }  
} 
  
// This code is contributed by AnkitRai01 

