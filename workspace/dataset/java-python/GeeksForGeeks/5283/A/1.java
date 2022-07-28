

// Java implementation of the above approach  
class GFG 
{ 
      
    // Function to return the value of nCk  
    static long binomialCoeff(long n, long k)  
    {  
        if (k == 0 || k == n)  
            return 1;  
      
        return binomialCoeff(n - 1, k - 1) + 
               binomialCoeff(n - 1, k);  
    }  
      
    // Function to return the factorial of n  
    static long fact(long n)  
    {  
        if (n >= 1)  
            return n * fact(n - 1);  
        else
            return 1;  
    }  
      
    // Function that returns true if ch is a vowel  
    static boolean isVowel(char ch)  
    {  
        if (ch == 'a' || ch == 'e' || ch == 'i' ||  
                         ch == 'o' || ch == 'u')  
        {  
            return true;  
        }  
      
        return false;  
    }  
      
    // Function to return the number of words possible  
    static long countWords(String s, int p, int q)  
    {  
      
        // To store the count of vowels and  
        // consonanats in the given string  
        long countc = 0, countv = 0;  
        for (int i = 0; i < s.length(); i++) 
        {  
      
            // If current character is a vowel  
            if (isVowel(s.charAt(i)))  
                countv++;  
            else
                countc++;  
        }  
      
        // Find the total possible words  
        long a = binomialCoeff(countc, p);  
        long b = binomialCoeff(countv, q);  
        long c = fact(p + q);  
        long ans = (a * b) * c;  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String s = "crackathon";  
        int p = 4, q = 3;  
      
        System.out.println(countWords(s, p, q));  
    }  
} 
  
// This Code is contributed by AnkitRai01 

