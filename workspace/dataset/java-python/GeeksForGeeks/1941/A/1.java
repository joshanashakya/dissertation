

// Java program to find a string which when repeated  
// exactly k times gives a permutation  
// of the given string  
class GfG {  
  
// Function to return a string which when repeated  
// exactly k times gives a permutation of s  
static String K_String(String s, int k)  
{  
    // size of string  
    int n = s.length();  
  
    // to frequency of each character  
    int fre[] = new int[26];  
  
    // get frequency of each character  
    for (int i = 0; i < n; i++)  
        fre[s.charAt(i) - 'a']++;  
  
    // to store final answer  
    String str = "";  
  
    for (int i = 0; i < 26; i++) {  
  
        // check if frequency is divisible by k  
        if (fre[i] % k == 0) {  
            int x = fre[i] / k;  
  
            // add to answer  
            while (x != 0) {  
                str += (char)(i + 'a'); 
                x--; 
            }  
        }  
  
        // if frequency is not divisible by k  
        else {  
            return "-1";  
        }  
    }  
  
    return str;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    String s = "aabb";  
    int k = 2;  
  
    // function call  
    System.out.println(K_String(s, k));  
  
} 
}  

