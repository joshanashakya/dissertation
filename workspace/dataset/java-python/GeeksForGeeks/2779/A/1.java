

// Java program to Find the lexicographically 
// smallest substring in a given string with 
// maximum frequency and contains a's and b's only 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to Find the lexicographically 
// smallest substring in a given string with 
// maximum frequency and contains a's and b's only. 
static int maxFreq(String s, int a, int b) 
{ 
    // To store frequency of digits 
    int fre[] =  new int[10]; 
  
    // size of string 
    int n = s.length(); 
  
    // Take lexicographically larger digit in b 
    if (a > b) 
    { 
        int temp = a; 
        a =b; 
        b = temp; 
      
    } 
  
    // get frequency of each character 
    for (int i = 0; i < n; i++) 
        fre[s.charAt(i) - '0']++; 
  
    // If no such string exits 
    if (fre[a] == 0 && fre[b] == 0) 
        return -1; 
  
    // Maximum frequency 
    else if (fre[a] >= fre[b]) 
        return a; 
    else
        return b; 
} 
  
// Driver program 
  
    public static void main (String[] args) { 
      
    int a = 4, b = 7; 
  
    String s = "47744"; 
  
    System.out.print(maxFreq(s, a, b)); 
    } 
} 
// This code is contributed by inder_verma 

