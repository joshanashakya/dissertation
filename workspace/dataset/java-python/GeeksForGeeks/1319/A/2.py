

# Python program to find 
# kth common factor 
# of two numbers 
  
# Returns k'th common 
# factor of x and y. 
def findKHCF(x,y,k): 
  
    # Find smaller of two numbers 
    small = min(x, y) 
   
    # Count common factors 
    # until we either 
    # reach small or count 
    # becomes k. 
    count = 1
    for i in range(2,small+1): 
     
        if (x % i==0 and y % i == 0): 
            count=count + 1
        if (count == k): 
            return i 
     
   
    # If we reached small 
    return -1
  
# Driver code 
  
x = 4
y = 24
k = 3
print(findKHCF(x, y, k)) 
  
# This code is contributed 
# by Anant Agarwal. 

