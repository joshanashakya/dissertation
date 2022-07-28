

# Python3 implementation of the approach 
SIZE = 26
  
# Function to print the even frequency characters 
# in the order of their occurrence 
def printChar(string, n): 
  
    # To store the frequency of each of 
    # the character of the stringing 
    # Initialize all elements of freq[] to 0 
    freq = [0] * SIZE 
  
    # Update the frequency of each character 
    for i in range(0, n): 
        freq[ord(string[i]) - ord('a')] += 1
  
    # Traverse string character by character 
    for i in range(0, n):  
  
        # If frequency of current character is even 
        if (freq[ord(string[i]) - 
                 ord('a')] % 2 == 0): 
            print(string[i], end = "") 
          
# Driver code 
if __name__ == '__main__': 
    string = "geeksforgeeks"
    n = len(string) 
    printChar(string, n) 
  
# This code is contributed by Ashutosh450 

