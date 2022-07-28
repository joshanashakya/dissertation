

// Java implementation of the approach 
class GFG 
{ 
static int MAX = 26; 
  
// Function to perform the queries 
static void performQueries(String str, int q, int type[], 
                                   char ch[], int freq[]) 
{ 
    int n = str.length(); 
  
    // L[i][j] stores the largest i 
    // such that ith character appears 
    // exactly jth times in str[0...i] 
    int [][]L = new int[MAX][n]; 
  
    // F[i][j] stores the smallest i 
    // such that ith character appears 
    // exactly jth times in str[0...i] 
    int [][]F = new int[MAX][n]; 
  
    // To store the frequency of each 
    // of the character of str 
    int []cnt = new int[MAX]; 
    for (int i = 0; i < n; i++)  
    { 
  
        // Current character of str 
        int k = str.charAt(i) - 'a'; 
  
        // Update its frequency 
        cnt[k]++; 
  
        // For every lowercase character 
        // of the English alphabet 
        for (int j = 0; j < MAX; j++)  
        { 
  
            // If it is equal to the character 
            // under consideration then update 
            // L[][] and R[][] as it is cnt[j]th 
            // occurrence of character k 
            if (k == j)  
            { 
                L[j][cnt[j]] = i; 
                F[j][cnt[j]] = i; 
            } 
  
            // Only update L[][] as k has not 
            // been occurred so only index 
            // has to be incremented 
            else
                L[j][cnt[j]] = L[j][cnt[j]] + 1; 
        } 
    } 
  
    // Perform the queries 
    for (int i = 0; i < q; i++)  
    { 
  
        // Type 1 query 
        if (type[i] == 1) 
        { 
            System.out.print(L[ch[i] - 'a'][freq[i]]); 
        } 
  
        // Type 2 query 
        else
        { 
            System.out.print(F[ch[i] - 'a'][freq[i]]); 
        } 
        System.out.print("\n"); 
    } 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    String str = "geeksforgeeks"; 
  
    // Queries 
    int type[] = { 1, 2 }; 
    char ch[] = { 'e', 'k' }; 
    int freq[] = { 2, 2 }; 
    int q = type.length; 
  
    // Perform the queries 
    performQueries(str, q, type, ch, freq); 
} 
} 
  
// This code is contributed by Rajput-Ji 

