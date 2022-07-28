

// Java program to print the winner of the game  
class GfG { 
// Function that returns the winner of the game  
static int returnWinner(String s, int l)  
{  
    // Initialize the freq array to 0  
    int freq[]  =new int[26];  
  
    // Iterate and count the frequencies  
    // of each character in the string  
    for (int i = 0; i < l; i++) {  
        freq[s.charAt(i) - 'a']++;  
    }  
  
    int cnt = 0;  
  
    // Count the odd occurring character  
    for (int i = 0; i < 26; i++) {  
  
        // If odd occurrence  
        if (freq[i] % 2 != 0)  
            cnt++;  
    }  
  
    // Check condition for Player-1 winning the game  
    if ((cnt == 0)|| (cnt & 1) == 1)  
        return 1;  
    else
        return 2;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    String s = "abaaab";  
    int l = s.length();  
  
    // Function call that returns the winner  
    int winner = returnWinner(s, l);  
  
    System.out.println("Player-" + winner);  
} 
}  

