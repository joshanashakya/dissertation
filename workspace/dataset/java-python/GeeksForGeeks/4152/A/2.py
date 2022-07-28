

# Python3 implementation of the approach  
import numpy as np 
  
MAX = 26;  
  
# Function to perform the queries  
def performQueries(string , q, type_arr, ch, freq) : 
  
    n = len(string);  
  
    # L[i][j] stores the largest i  
    # such that ith character appears  
    # exactly jth times in str[0...i]  
    L = np.zeros((MAX, n));  
  
    # F[i][j] stores the smallest i  
    # such that ith character appears  
    # exactly jth times in str[0...i]  
    F = np.zeros((MAX, n));  
  
    # To store the frequency of each  
    # of the character of str  
    cnt = [ 0 ] * MAX;  
    for i in range(n) : 
  
        # Current character of str  
        k = ord(string[i]) - ord('a');  
  
        # Update its frequency  
        cnt[k] += 1;  
  
        # For every lowercase character  
        # of the English alphabet  
        for j in range(MAX) : 
  
            # If it is equal to the character  
            # under consideration then update  
            # L[][] and R[][] as it is cnt[j]th  
            # occurrence of character k  
            if (k == j) : 
                L[j][cnt[j]] = i;  
                F[j][cnt[j]] = i;  
  
            # Only update L[][] as k has not  
            # been occurred so only index  
            # has to be incremented  
            else : 
                L[j][cnt[j]] = L[j][cnt[j]] + 1;  
  
    # Perform the queries  
    for i in range(q) : 
  
        # Type 1 query  
        if (type_arr[i] == 1) : 
            print(L[ord(ch[i]) - 
                    ord('a')][freq[i]], end = "");  
  
        # Type 2 query  
        else : 
            print(F[ord(ch[i]) - 
                    ord('a')][freq[i]], end = ""); 
              
        print() 
          
# Driver code  
if __name__ == "__main__" :  
  
    string = "geeksforgeeks";  
  
    # Queries  
    type_arr = [ 1, 2 ];  
    ch = [ 'e', 'k' ];  
    freq = [ 2, 2 ];  
    q = len(type_arr);  
  
    # Perform the queries  
    performQueries(string, q, type_arr, ch, freq);  
  
# This code is contributed by AnkitRai01 

