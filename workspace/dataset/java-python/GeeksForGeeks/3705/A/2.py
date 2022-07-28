

# Python3 implementation of the approach  
MAX = 26
  
# Function to return the count of  
# required pairs of characters  
def countPairs(string, k) :  
  
    # Length of the string  
    n = len(string);  
  
    # To store the frequency  
    # of each character  
    freq = [0] * MAX;  
  
    # Update the frequency  
    # of each character  
    for i in range(n) :  
        freq[ord(string[i]) - 
             ord('a')] += 1;  
  
    # To store the required  
    # count of pairs  
    cnt = 0;  
  
    # If ascii value difference is zero  
    if (k == 0) : 
  
        # If there exists similar characters  
        # more than once  
        for i in range(MAX) : 
            if (freq[i] > 1) : 
                cnt += ((freq[i] * 
                        (freq[i] - 1)) // 2);  
      
    else : 
  
        # If there exits characters with  
        # ASCII value difference as k  
        for i in range(MAX) : 
            if (freq[i] > 0 and 
                i + k < MAX and 
                freq[i + k] > 0) : 
                cnt += (freq[i] * freq[i + k]);  
  
    # Return the required count  
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "abcdab";  
    k = 0;  
  
    print(countPairs(string, k));  
      
# This code is contributed by AnkitRai01 

