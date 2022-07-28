

// Java Program for DFA that accepts string  
// if it starts and ends with same character 
class GFG  
{ 
      
    // Function for the state Q1  
    static void q1(String s, int i)  
    {  
      
        // Condition to check end of string  
        if (i == s.length())  
        {  
            System.out.println("Yes");  
            return;  
        }  
      
        // State transitions  
        // 'a' takes to q1, and  
        // 'b' takes to q2  
        if (s.charAt(i) == 'a')  
            q1(s, i + 1);  
        else
            q2(s, i + 1);  
    }  
      
    // Function for the state Q2  
    static void q2(String s, int i)  
    {  
        // Condition to check end of string  
        if (i == s.length()) 
        {  
            System.out.println("No");  
            return;  
        }  
      
        // State transitions  
        // 'a' takes to q1, and  
        // 'b' takes to q2  
        if (s.charAt(i) == 'a')  
            q1(s, i + 1);  
        else
            q2(s, i + 1);  
    }  
      
    // Function for the state Q3  
    static void q3(String s, int i)  
    {  
        // Condition to check end of string  
        if (i == s.length())  
        {  
            System.out.println("Yes");  
            return;  
        }  
      
        // State transitions  
        // 'a' takes to q4, and  
        // 'b' takes to q3  
        if (s.charAt(i) == 'a')  
            q4(s, i + 1);  
        else
            q3(s, i + 1);  
    }  
      
    // Function for the state Q4  
    static void q4(String s, int i)  
    {  
        // Condition to check end of string  
        if (i == s.length()) 
        {  
            System.out.println("No");  
            return;  
        }  
      
        // State transitions  
        // 'a' takes to q4, and  
        // 'b' takes to q3  
        if (s.charAt(i) == 'a')  
            q4(s, i + 1);  
        else
            q3(s, i + 1);  
    }  
      
    // Function for the state Q0  
    static void q0(String s, int i)  
    {  
      
        // Condition to check end of string  
        if (i == s.length())  
        {  
            System.out.println("No");  
            return;  
        }  
      
        // State transitions  
        // 'a' takes to q1, and  
        // 'b' takes to q3  
        if (s.charAt(i) == 'a')  
            q1(s, i + 1);  
        else
            q3(s, i + 1);  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        String s = "abbaabb";  
      
        // Since q0 is the starting state  
        // Send the string to q0  
        q0(s, 0);  
    }  
} 
  
// This code is contributed by AnkitRai01 

