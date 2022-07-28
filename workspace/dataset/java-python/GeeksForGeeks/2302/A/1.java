

// Java program to find the number of ways 
// in which the characters of the word 
// can be arranged such that the vowels 
// occupy only the odd positions 
class GFG{ 
// Function to return the 
// factorial of a number 
static int fact(int n) 
{ 
    int f = 1; 
    for (int i = 2; i <= n; i++) { 
        f = f * i; 
    } 
  
    return f; 
} 
  
// calculating nPr 
static int npr(int n, int r) 
{ 
    return fact(n) / fact(n - r); 
} 
  
// Function to find the number of ways 
// in which the characters of the word 
// can be arranged such that the vowels 
// occupy only the odd positions 
static int countPermutations(String str) 
{ 
    // Get total even positions 
    int even = (int)Math.floor((double)(str.length() / 2)); 
  
    // Get total odd positions 
    int odd = str.length() - even; 
  
    int ways = 0; 
  
    // Store frequency of each character of 
    // the string 
    int[] freq=new int[26]; 
    for (int i = 0; i < str.length(); i++) { 
        freq[(int)(str.charAt(i)-'a')]++; 
    } 
  
    // Count total number of vowels 
    int nvowels= freq[0] + freq[4]+ freq[8]  
                + freq[14]+ freq[20]; 
  
    // Count total number of consonants 
    int nconsonants= str.length() - nvowels; 
  
    // Calculate the total number of ways 
    ways = npr(odd, nvowels) * npr(nconsonants, nconsonants); 
  
    return ways; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeks"; 
  
    System.out.println(countPermutations(str)); 
} 
} 
// This code is contributed by mits 

