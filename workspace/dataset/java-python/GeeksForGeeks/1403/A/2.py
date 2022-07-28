

# Python3 implementation of the approach  
  
# Function to return the maximum number  
# that can be formed by changing  
# at most k digits in str  
def findMaximumNum(st, n, k): 
  
    # For every digit of the number  
    for i in range(n):  
  
        # If no more digits can be replaced  
        if (k < 1):  
            break
  
        # If current digit is not already 9  
        if (st[i] != '9'):  
  
            # Replace it with 9  
            st = st[0:i] + '9' + st[i + 1:]  
  
            # One digit has been used  
            k -= 1
  
    return st 
  
# Driver code  
st = "569431"
n = len(st)  
k = 3
print(findMaximumNum(st, n, k)) 
  
# This code is contributed by 
# divyamohan123 

