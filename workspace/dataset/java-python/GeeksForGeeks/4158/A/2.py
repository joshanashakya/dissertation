

# Python3 implementation of the approach  
  
# Maximum distinct characters possible  
MAX = 256;  
  
# Function to return the last non-repeating character  
def lastNonRepeating(string, n) :  
  
    # To store the frequency of each of  
    # the character of the given string  
    freq = [0]*MAX;  
  
    # Update the frequencies  
    for i in range(n) : 
        freq[ord(string[i])] += 1;  
  
    # Starting from the last character  
    for i in range(n-1,-1,-1) : 
  
        # Current character  
        ch = string[i];  
  
        # If frequency of the current character is 1  
        # then return the character  
        if (freq[ord(ch)] == 1) : 
            return ("" + ch);  
      
  
    # All the characters of the  
    # string are repeating  
    return "-1";  
  
  
# Driver code  
if __name__ == "__main__" :  
      
    string = "GeeksForGeeks";  
    n = len(string);  
      
    print(lastNonRepeating(string, n));  
  
# This code is contributed by AnkitRai01 

