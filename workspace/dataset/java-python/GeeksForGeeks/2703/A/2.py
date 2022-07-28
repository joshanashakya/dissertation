

# Python3 implementation of the approach  
  
# Function that returns true if some character  
# exists in the given string whose frequency  
# is equal to the sum frequencies of  
# other characters of the string  
def isFrequencyEqual(string, length):  
  
    # If string is of odd length  
    if length % 2 == 1:  
        return False
  
    # To store the frequency of each  
    # character of the string  
    freq = [0] * 26
  
    # Update the frequencies of  
    # the characters  
    for i in range(0, length):  
        freq[ord(string[i]) - ord('a')] += 1
  
    for i in range(0, 26):  
        if freq[i] == length // 2:  
            return True
  
    # No such character exists  
    return False
  
# Driver code  
if __name__ == "__main__":  
  
    string = "geeksforgeeks"
    length = len(string)  
    if isFrequencyEqual(string, length):  
        print("Yes")  
    else: 
        print("No")  
  
# This code is contributed by Rituraj Jain 

