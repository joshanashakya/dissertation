

# Python program which counts  
# different palindromic  
# characteristics of a string.          
MAX_STR_LEN = 1000; 
  
P = [[0 for x in range(MAX_STR_LEN)]  
        for y in range(MAX_STR_LEN)] ; 
  
for i in range(0, MAX_STR_LEN) : 
    for j in range(0, MAX_STR_LEN) : 
        P[i][j] = False; 
          
Kpal = [0] * MAX_STR_LEN; 
      
# def which checks 
# whether a substr[i..j]  
# of a given is a  
# palindrome or not. 
def checkSubStrPal(str, n) : 
  
    global P, Kpal, MAX_STR_LEN; 
              
    # P[i,j] = True if substr 
    # [i..j] is palindrome, 
    # else False 
    for i in range(0, MAX_STR_LEN) : 
  
        for j in range(0, MAX_STR_LEN) : 
            P[i][j] = False; 
        Kpal[i] = 0; 
      
    # palindrome of  
    # single length 
    for i in range(0, n) : 
        P[i][i] = True; 
  
    # palindrome of 
    # length 2 
    for i in range(0, n - 1) : 
        if (str[i] == str[i + 1]) : 
            P[i][i + 1] = True; 
  
    # Palindromes of length more  
    # then 2. This loop is similar  
    # to Matrix Chain Multiplication.  
    # We start with a gap of length  
    # 2 and fill P table in a way  
    # that gap between starting and  
    # ending indexes increases one  
    # by one by outer loop. 
    for gap in range(2, n) : 
  
        # Pick starting point 
        # for current gap 
        for i in range(0, n - gap) : 
  
            # Set ending point 
            j = gap + i; 
  
            # If current string 
            # is palindrome 
            if (str[i] == str[j] and 
                P[i + 1][j - 1]) : 
                P[i][j] = True; 
  
# A Python def which  
# recursively counts if  
# a str [i..j] is a  
# k-palindromic or not. 
def countKPalindromes(i, j, k) : 
  
    global Kpal, P; 
      
    # terminating condition  
    # for a which is a 
    # k-palindrome. 
    if (i == j) : 
      
        Kpal[k] = Kpal[k] + 1; 
        return; 
  
    # terminating condition  
    # for a which is not a  
    # k-palindrome. 
    if (P[i][j] == False) : 
        return; 
  
    # increases the counter 
    # for the if it is a  
    # k-palindrome. 
    Kpal[k] = Kpal[k] + 1; 
  
    # mid is middle pointer  
    # of the str [i...j]. 
    mid = int((i + j) / 2); 
  
    # if length of which is 
    # (j - i + 1) is odd than  
    # we have to subtract one  
    # from mid else if even  
    # then no change. 
    if ((j - i + 1) % 2 == 1) : 
        mid = mid - 1; 
  
    # if the is k-palindrome 
    # then we check if it is a 
    # (k+1) - palindrome or not  
    # by just sending any of  
    # one half of the to the  
    # Count_k_Palindrome def. 
    countKPalindromes(i, mid, k + 1); 
  
def printKPalindromes(s) : 
  
    global P, Kpal, MAX_STR_LEN; 
              
    # Finding all palindromic 
    # substrings of given string 
    n = len(s); 
    checkSubStrPal(s, n); 
  
    # counting k-palindromes  
    # for each and every sub  
    # of given string. . 
    for i in range(0, n) : 
        for j in range(0, n - i) : 
            countKPalindromes(j, j + i, 1); 
  
    # Output the number of  
    # K-palindromic substrings 
    # of a given string. 
    for i in range(1, n + 1) : 
        print (Kpal[i], end=" "); 
    print(); 
  
  
# Driver code 
s = "abacaba"; 
printKPalindromes(s); 
  
# This code is contributd by 
# Manish Shaw(manishshaw1) 

