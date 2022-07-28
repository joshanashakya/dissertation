

# Python 3 program to find number of  
# occurrences of a subsequence of length 3 
  
# Function to find number of occurrences of 
# a subsequence of length three in a string 
def findOccurrences(str1, substr): 
      
    # calculate length of string 
    n = len(str1) 
  
    # auxilary array to store occurrences of 
    # first character 
    preLeft = [0 for i in range(n)] 
  
    # auxilary array to store occurrences of 
    # third character 
    preRight = [0 for i in range(n)] 
  
    if (str1[0] == substr[0]): 
        preLeft[0] += 1
  
    # calculate occurrences of first character  
    # upto ith index from left 
    for i in range(1, n): 
        if (str1[i] == substr[0]): 
            preLeft[i] = preLeft[i - 1] + 1    
        else: 
            preLeft[i] = preLeft[i - 1]      
  
    if (str1[n - 1] == substr[2]): 
        preRight[n - 1] += 1
  
    # calculate occurrences of third character  
    # upto ith index from right 
    i = n - 2
    while(i >= 0): 
        if (str1[i] == substr[2]): 
            preRight[i] = preRight[i + 1] + 1    
        else:      
            preRight[i] = preRight[i + 1] 
  
        i -= 1
  
    # variable to store  
    # total number of occurrences 
    counter = 0
  
    # loop to find the occurrences  
    # of middle element 
    for i in range(1, n - 1): 
          
        # if middle character of subsequence  
        # is found in the string 
        if (str1[i] == str1[1]): 
              
            # multiply the total occurrences of first  
            # character before middle character with  
            # the total occurrences of third character  
            # after middle character 
            total = preLeft[i - 1] * preRight[i + 1] 
            counter += total 
  
    return counter 
  
# Driver code 
if __name__ == '__main__': 
    str1 = "GFGFGYSYIOIWIN"
    substr = "GFG"
    print(findOccurrences(str1, substr)) 
      
# This code is contributed by 
# Surendra_Gangwar 

