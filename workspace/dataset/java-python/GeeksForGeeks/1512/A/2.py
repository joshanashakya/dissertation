

# Python program to find maximum value (a[i]+i)* 
# (a[j]+j) in an array of integers. maxval()  
# returns maximum value of (a[i]+i)*(a[j]+j) 
# where i is not equal to j 
def maxval(a,n): 
  
    # at-least there must be two elements  
    # in array 
    if (n < 2): 
        return -99999
  
    # calculate maximum value 
    max = 0
    for i in range(n): 
        for j in range(i+1,n): 
                x = (a[i]+i)*(a[j]+j) 
                if max < x: 
                    max = x 
    return max
  
# test the function 
print(maxval([4,5,3,1,10],5)) 

