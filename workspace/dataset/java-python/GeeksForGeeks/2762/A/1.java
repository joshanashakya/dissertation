

// Java implementation of the 
// above approach 
class GFG 
{ 
  
static int MAX = 64; 
  
// Function to return the bitmask for the string 
static int getBitmask(char[] s) 
{ 
    int temp = 0; 
    for (int j = 0; j < s.length; j++)  
    { 
        switch (s[j])  
        { 
            case 's': 
                temp = temp | (1); 
                break; 
            case 't': 
                temp = temp | (2); 
                break; 
            case 'r': 
                temp = temp | (4); 
                break; 
            case 'i': 
                temp = temp | (8); 
                break; 
            case 'n': 
                temp = temp | (16); 
                break; 
            case 'g': 
                temp = temp | (32); 
                break; 
            default: 
                break; 
        } 
    } 
  
    return temp; 
} 
  
// Function to return the count of pairs 
static int countPairs(String arr[], int n) 
{ 
  
    // bitMask[i] will store the count of strings 
    // from the array whose bitmask is i 
    int []bitMask = new int[MAX]; 
    for (int i = 0; i < n; i++) 
        bitMask[getBitmask(arr[i].toCharArray())]++; 
  
    // To store the count of pairs 
    int cnt = 0; 
    for (int i = 0; i < MAX; i++)  
    { 
        for (int j = i; j < MAX; j++) 
        { 
  
            // MAX - 1 = 63 i.e. 111111 in binary 
            if ((i | j) == (MAX - 1))  
            { 
  
                // arr[i] cannot make s pair with itself 
                // i.e. (arr[i], arr[i]) 
                if (i == j) 
                    cnt += ((bitMask[i] * bitMask[i] - 1) / 2); 
                else
                    cnt += (bitMask[i] * bitMask[j]); 
            } 
        } 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String arr[] = { "strrr", "strring", "gstrin" }; 
    int n = arr.length; 
    System.out.println(countPairs(arr, n)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

