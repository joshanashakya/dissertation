

# Python program to find Minimum  
# increase in sides to get  
# non-negative area of a triangle  
  
# Function to return the  
# minimum increase in side  
# lengths of the triangle  
def minimumIncrease(a, b, c) : 
  
    # push the three sides 
    # to a array  
    arr = [ a, b, c ] 
  
    # sort the array  
    arr.sort() 
  
    # check if sum is greater 
    # than third side 
    if arr[0] + arr[1] >= arr[2] : 
        return 0
  
    else : 
        return arr[2] - (arr[0] + arr[1]) 
  
# Driver code      
if __name__ == "__main__" : 
  
    a, b, c = 3, 5, 10
    print(minimumIncrease(a, b, c)) 
  
# This code is contributed 
# by ANKITRAI1 

