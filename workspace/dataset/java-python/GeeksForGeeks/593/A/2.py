

# Python 3 implementation of the approach  
  
# Function to return the minimized number  
def minNum(num, k) :  
  
    # Total digits in the number  
    len_ = len(num)  
  
    # If the string is empty or there  
    # are no operations to perform  
    if len_ == 0 or k == 0 :  
        return num  
  
    # "0" is a valid number  
    if len_ == 1:  
        return "0"
  
    # If the first digit is not already 1 then  
    # update it to 1 and decrement k  
    if num[0] != '1' :  
        num = '1' + num[1:]  
        k -= 1
  
    i = 1
      
    # While there are operations left  
    # and the number can still be updated  
    while k > 0 and i < len_ :  
  
        # If the current digit is not already 0  
        # then update it to 0 and decrement k  
        if num[i] != '0' :  
            num = num[:i] + '0' + num[i + 1:] 
            k -= 1
  
        i += 1
   
    # Return the minimised number  
    return num  
  
# Driver code  
num = "91945"
k = 3
  
print(minNum(num, k))  
  
# This code is contributed by divyamohan123 

