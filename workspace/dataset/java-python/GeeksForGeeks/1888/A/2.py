

# Python program to find  
# number of occurrences  
# of a subsequence of  
# length 3 
  
# Function to find number  
# of occurrences of a  
# subsequence of length  
# three in a string 
def findOccurrences(str, substr) : 
  
    # variable to store  
    # no of occurrences 
    counter = 0
  
    # loop to find 
    # first character 
    for i in range(0, len(str)) : 
      
        if (str[i] == substr[0]) : 
          
            # loop to find 
            # 2nd character 
            for j in range(i + 1,  
                           len(str)) : 
              
                if (str[j] == substr[1]) : 
                  
                    # loop to find 
                    # 3rd character 
                    for k in range(j + 1,  
                                   len(str)) : 
                      
                        # increment count if  
                        # subsequence is found 
                        if (str[k] == substr[2]) : 
                            counter = counter + 1
  
    return counter 
  
# Driver Code 
str = "GFGFGYSYIOIWIN"
substr = "GFG"
print (findOccurrences(str, substr)) 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

