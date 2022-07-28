

# Python3 implementation of the approach  
N = 2;  
  
# Function that returns true  
# if ch is a vowel  
def isVowel(ch) :  
  
    return (ch == 'a' or ch == 'e' or 
            ch == 'i' or ch == 'o' or
            ch == 'u');  
  
# Function to return the count of vowels  
# in the substring str[l...r]  
def countVowels(string, l, r) : 
  
    # To store the count of vowels  
    cnt = 0;  
  
    # For every character in  
    # the index range [l, r]  
    for i in range(l, r + 1) : 
  
        # If the current character  
        # is a vowel  
        if (isVowel(string[i])) : 
            cnt += 1;  
  
    return cnt;  
  
def performQueries(string, queries, q) : 
  
    # For every query  
    for i in range(q) : 
  
        # Find the count of vowels  
        # for the current query  
        print(countVowels(string, queries[i][0],  
                                  queries[i][1]));  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "geeksforgeeks";  
    queries = [ [ 1, 3 ], 
                [ 2, 4 ],  
                [ 1, 9 ] ];  
    q = len(queries)  
  
    performQueries(string, queries, q);  
  
# This code is contributed by AnkitRai01 

