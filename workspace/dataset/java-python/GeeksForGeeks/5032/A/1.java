

// Java program to find the smallest permutaion 
class GFG 
{ 
  
// Function to print the smallest permutation 
static void smallestPermute(int n) 
{ 
    char res[] = new char[n + 1]; 
  
    // when n is even 
    if (n % 2 == 0) { 
        for (int i = 0; i < n; i++)  
        { 
            if (i % 2 == 0) 
                res[i] = (char)(48 + i + 2); 
            else
                res[i] = (char)(48 + i); 
        } 
    } 
  
    // when n is odd 
    else 
    { 
        for (int i = 0; i < n - 2; i++)  
        { 
            if (i % 2 == 0) 
                res[i] = (char)(48 + i + 2); 
            else
                res[i] = (char)(48 + i); 
        } 
        // handling last 3 digit 
        res[n - 1] = (char)(48 + n - 2); 
        res[n - 2] = (char)(48 + n); 
        res[n - 3] = (char)(48 + n - 1); 
    } 
  
    // add EOL and print result 
    res[n] = '\0'; 
  
    for (int i = 0; i < n ; i++) 
    { 
        System.out.print(res[i]); 
    } 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int n = 7; 
  
    smallestPermute(n); 
} 
} 
  
// This code is contributed by ANKITRAI1 

