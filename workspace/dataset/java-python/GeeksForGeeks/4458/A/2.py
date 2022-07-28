

# Python 3 implementation of above approach 
  
# Function to find the count of strings 
def countStrings(s): 
      
    # Variable to store the final result 
    sum = 1
  
    # Loop iterating through string 
    for i in range(len(s)): 
  
        # If '$' is present at the even 
        # position in the string 
        if (i % 2 == 0 and s[i] == '$'): 
  
            #'sum' is multiplied by 21 
            sum *= 21
  
        # If '$' is present at the odd 
        # position in the string 
        elif(s[i] == '$'): 
  
            # 'sum' is multiplied by 5 
            sum *= 5
  
    return sum
  
# Driver code 
if __name__ == "__main__": 
      
    # Let the string 'str' be s$$e$ 
    str = "s$$e$"
  
    # Print result 
    print(countStrings(str)) 
      
# this code is contributed by ChitraNayal 

