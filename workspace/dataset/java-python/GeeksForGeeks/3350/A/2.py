

# Python3 program to replace minimal  
# number of characters to make all  
# characters pair wise distinct  
  
# Function to replace minimal  
# number of characters to make all  
# characters pair wise distinct  
def minReplacement(string):  
  
    # If length of string is greater  
    # than 26, it is impossible to make  
    # characters pair wise distinct  
    if len(string) > 26:  
        print("IMPOSSIBLE")  
    else: 
          
        # Array to store frequency of each  
        # character  
        Hash = [0] * 26
  
        # Store frequency of each character  
        for i in range(0, len(string)):  
            Hash[ord(string[i]) - ord('a')] += 1
  
        count = 0
  
        # Start traversing the string  
        for i in range(0, len(string)):  
  
            # Check if frequency of current  
            # character is greater than 1  
            if Hash[ord(string[i]) - ord('a')] > 1:  
  
                # Traverse the hash  
                for j in range(0, 26):  
  
                    # Find the first character starting from 'a'  
                    # which have not appeared in the string yet  
                    if Hash[j] == 0:  
  
                        # Reduce the frequency of current  
                        # character in the string  
                        Hash[ord(string[i]) - ord('a')] -= 1
  
                        # Replace the current character in  
                        # string by current character in hash  
                        string[i] = chr(j + ord('a'))  
  
                        # Increment the frequency  
                        # of this char in hash  
                        Hash[j] += 1
  
                        break
  
        # Print the modified string  
        print(''.join(string))  
      
# Driver code  
if __name__ == "__main__":  
  
    string = "xxxxyyyy"
  
    minReplacement(list(string)) 
      
# This code is contributed by Rituraj Jain 

