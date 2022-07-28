

# Python Program to count all even 
# decimal value substring 
  
# Function return count of even  
# decimal value substring 
def evenDecimalValue(str, n) : 
  
    # Store the count of even 
    # decimal value substring 
    result = 0
    for i in range(0, n): 
  
        # substring started with '0' 
        if (str[i] == '0'): 
  
            # increment result by (n-i) 
            # because all substring which are generate by 
            # this character produce even decimal value. 
            result += (n - i) 
      
    return result 
  
# Driver code 
str = "10010"
n = 5
print (evenDecimalValue(str, n)) 
  
# This code is contributed by Gitanjali. 

