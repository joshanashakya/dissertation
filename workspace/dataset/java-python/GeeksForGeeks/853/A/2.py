

# Python3 program to remove the characters 
# having odd frequencies in the string 
  
# Function to remove the characters which 
# have odd frequencies in the string 
def removeOddFrequencyCharacters(s): 
      
    # Create a map to store the 
    # frequency of each character 
    m = dict() 
    for i in s: 
        m[i] = m.get(i, 0) + 1
  
    # To store the new string 
    new_s = "" 
  
    # Remove the characters which 
    # have odd frequencies 
    for i in s: 
  
        # If the character has 
        # odd frequency then skip 
        if (m[i] & 1): 
            continue
  
        # Else concatenate the 
        # character to the new string 
        new_s += i 
  
    # Return the modified string 
    return new_s 
  
# Driver code 
if __name__ == '__main__': 
    str = "geeksforgeeks"
  
    # Remove the characters which 
    # have odd frequencies 
    str = removeOddFrequencyCharacters(str) 
    print(str) 
  
# This code is contributed by mohit kumar 29 

