

// Java program to find the 
// Longest palindrome that can be formed 
// by concatenating and reordering 
// given N Strings of equal length 
import java.util.*; 
  
class GFG{ 
   
// Function to print the longest palindrome 
static void printPalindrome(Vector<String> left, 
                     String mid, Vector<String> right) 
{ 
    // Printing every String in left vector 
    for (String x : left) 
        System.out.print(x); 
   
    // Printing the palindromic String 
    // in the middle 
    System.out.print(mid); 
   
    // Printing the reverse of the right vector 
    // to make the final output palindromic 
    Collections.reverse(right); 
    for (String x : right) 
        System.out.print(x); 
   
    System.out.println(); 
} 
   
// Function to find and print the 
// longest palindrome that can be formed 
static void findPalindrome(Vector<String> S, int N, int M) 
{ 
    HashSet<String> dict = new HashSet<String>(); 
    for (int i = 0; i < M; i++) { 
        // Inserting each String in the set 
        dict.add(S.get(i)); 
    } 
   
    // Vectors to add the Strings 
    // in the left and right side 
    Vector<String> left = new Vector<String>(), right = new Vector<String>(); 
   
    // To add the already present palindrome 
    // String in the middle of the solution 
    String mid=""; 
   
    // Iterating through all the given Strings 
    for (int i = 0; i < N; i++) { 
        String t = S.get(i); 
        t = reverse(t); 
   
        // If the String is a palindrome 
        // it is added in the middle 
        if (t == S.get(i)) 
            mid = t; 
   
        // Checking if the reverse 
        // of the String is already 
        // present in the set 
        else if (dict.contains(t)) { 
            left.add(S.get(i)); 
            right.add(t); 
            dict.remove(S.get(i)); 
            dict.remove(t); 
        } 
    } 
   
    printPalindrome(left, mid, right); 
} 
static String reverse(String input) { 
    char[] a = input.toCharArray(); 
    int l, r = a.length - 1; 
    for (l = 0; l < r; l++, r--) { 
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
}  
// Driver code 
public static void main(String[] args) 
{ 
    String arr[] = { "tab", "one", "bat" }; 
    Vector<String> S = new Vector<String>(Arrays.asList(arr)); 
    int M = 3; 
    int N = S.size(); 
    findPalindrome(S, N, M); 
} 
} 
  
// This code contributed by PrinciRaj1992 

