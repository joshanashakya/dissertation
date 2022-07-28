

# Python3 program to find the maximum product sub 
  
# Function to return the value of a character 
def value(x): 
    return (ord(x) - ord('a')) 
  
# Function to find the maximum product sub 
def maximumProduct(strr, n): 
  
    # To store subs 
    answer = "" 
    curr = "" 
    maxProduct = 0
    product = 1
  
    for i in range(n): 
        product *=value(strr[i]) 
  
        curr += strr[i] 
  
        # Check if current product is maximum 
        # possible or not 
        if (product >= maxProduct): 
            maxProduct = product 
            answer = curr 
  
        # If product is 0 
        if (product == 0): 
            product = 1
            curr = "" 
  
    # Return the sub with maximum product 
    return answer 
  
# Driver code 
if __name__ == '__main__': 
    strr = "sdtfakdhdahdzz"
  
    n = len(strr) 
  
    # Function call 
    print(maximumProduct(strr, n)) 
  
# This code is contributed by mohit kumar 29 

