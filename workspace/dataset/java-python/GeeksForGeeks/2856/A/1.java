

// Java program to find the count of palindromic sub-string  
// of a string in it's ascending form  
  
class GFG { 
  
    final static int MAX_CHAR = 26; 
  
// function to return count of palindromic sub-string  
    static int countPalindrome(String str) { 
        int n = str.length(); 
        int sum = 0; 
  
        // calculate frequency  
        int hashTable[] = new int[MAX_CHAR]; 
        for (int i = 0; i < n; i++) { 
            hashTable[str.charAt(i) - 'a']++; 
        } 
  
        // calculate count of palindromic sub-string  
        for (int i = 0; i < 26; i++) { 
            if (hashTable[i] != 0) { 
                sum += (hashTable[i] * (hashTable[i] + 1) / 2); 
            } 
        } 
  
        // return result  
        return sum; 
    } 
  
// driver program  
    public static void main(String[] args) { 
        String str = "ananananddd"; 
  
        System.out.println(countPalindrome(str)); 
  
    } 
} 

