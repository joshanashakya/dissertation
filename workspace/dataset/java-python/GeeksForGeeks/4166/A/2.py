

# Python 3 Program to find the  
# second most frequent character  
# in a given string 
  
# Function to find the second 
# most frequent character 
# in a given string 'str' 
def getSecondMostFreq(str) : 
  
    NO_OF_CHARS = 256
  
    # Initialize count list of 
    # 256 size with value 0 
    count = [0] * NO_OF_CHARS 
  
    # count number of occurrences 
    # of every character.  
    for i in range(len(str)) : 
        count[ord(str[i])] += 1
  
    first, second = 0, 0
  
    # Traverse through the count[]  
    # and find second highest element. 
    for i in range(NO_OF_CHARS) : 
  
        # If current element is smaller  
        # than first then update both 
        # first and second  
        if count[i] > count[first] : 
  
            second = first 
            first = i 
  
        # If count[i] is in between  
        # first and second 
        # then update second */ 
        elif (count[i] > count[second] and
            count[i] != count[first] ) : 
              
            second = i 
  
    # return character  
    return chr(second) 
  
# Driver code 
if __name__ == "__main__" : 
  
    str = "geeksforgeeks"
      
    # function calling  
    res = getSecondMostFreq(str) 
    if res != '\0' : 
        print("Second most frequent char is", res) 
    else : 
        print("No second most frequent character") 
  
# This code is contributed by ANKITRAI1 

