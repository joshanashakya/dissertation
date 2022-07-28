

# Python3 implementation of the approach 
  
# Function to return the index of the character 
# that has 0 occurrence starting from index i 
def nextZero(i, occurrences): 
    while i < 26: 
  
        # If current character has 0 occurrence 
        if occurrences[i] == 0: 
            return i 
        i += 1
  
    # If no character has 0 occurrence 
    return -1
  
# Function to return the modified string 
# which consists of distinct characters 
def getModifiedString(str): 
    n = len(str) 
  
    # String cannot consist of 
    # all distinct characters 
    if n > 26: 
        return "-1"
  
    ch = str
    ch = list(ch) 
    occurrences = [0] * 26
  
    # Count the occurrences for 
    # each of the character 
    for i in range(n): 
        occurrences[ord(ch[i]) - ord('a')] += 1
  
    # Index for the first character 
    # that hasn't appeared in the string 
    index = nextZero(0, occurrences) 
  
    for i in range(n): 
  
        # If current character appeared more 
        # than once then it has to be replaced 
        # with some character that 
        # hasn't occurred yet 
        if occurrences[ord(ch[i]) - ord('a')] > 1: 
  
            # Decrement current character's occurrence by 1 
            occurrences[ord(ch[i]) - ord('a')] -= 1
  
            # Replace the character 
            ch[i] = chr(ord('a') + index) 
  
            # Update the new character's occurrence 
            # This step can also be skipped as 
            # we'll never encounter this character 
            # in the string because it has 
            # been added just now 
            occurrences[index] = 1
  
            # Find the next character  
            # that hasn't occurred yet 
            index = nextZero(index + 1, occurrences) 
  
    ch = ''.join(ch) 
    print(ch) 
  
# Driver code 
if __name__ == "__main__": 
    str = "geeksforgeeks"
    getModifiedString(str) 
  
# This code is contributed by 
# sanjeev2552 

