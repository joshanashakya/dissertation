

# Python3 implementation of the approach  
MAX = 26;  
  
# Function to print the frequency  
# of each of the characters of  
# s in alphabetical order  
def compressString(s, n) : 
  
    # To store the frequency  
    # of the characters  
    freq = [ 0 ] * MAX;  
  
    # Update the frequency array  
    for i in range(n) : 
        freq[ord(s[i]) - ord('a')] += 1;  
  
    # Print the frequency in alphatecial order  
    for i in range(MAX) :  
  
        # If the current alphabet doesn't  
        # appear in the string  
        if (freq[i] == 0) : 
            continue;  
  
        print((chr)(i + ord('a'))+ str(freq[i]),end = "");  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "geeksforgeeks";  
    n = len(s);  
  
    compressString(s, n);  
  
# This code is contributed by AnkitRai01 

