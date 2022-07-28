

// Java code to count number of matching  
// characters in a pair of strings  
class GFG  
{ 
      
    // Function to count the matching characters  
    static void count(String str1, String str2)  
    {  
        int c = 0, j = 0;  
      
        // Traverse the string 1 char by char  
        for (int i = 0; i < str1.length(); i++) 
        {  
      
            // This will check if str1[i]  
            // is present in str2 or not  
            // str2.find(str1[i]) returns -1 if not found  
            // otherwise it returns the starting occurrence  
            // index of that character in str2  
            if (str2. indexOf(str1.charAt(i)) >= 0)  
            { 
                c += 1;  
        }  
    } 
        System.out.println("No. of matching characters are: " + c);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String str1 = "aabcddekll12@";  
        String str2 = "bb2211@55k";  
      
        count(str1, str2);  
    }  
} 
  
// This code is contributed by AnkitRai01 

