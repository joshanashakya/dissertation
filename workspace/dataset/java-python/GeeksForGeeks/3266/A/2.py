

# Python3 program to find 
# the N-th term in the series 
# 1, 2, 11, 12, 21... 
  
# Return n-th number in series 
def printNthElement(n) :   
          
    # create an array of size (n + 1)   
    arr =[0] * (n + 1);   
    arr[1] = 1
    arr[2] = 2
      
    for i in range(3, n + 1) :   
        # If i is odd   
        if (i % 2 != 0) :   
            arr[i] = arr[i // 2] * 10 + 1
        else :   
            arr[i] = arr[(i // 2) - 1] * 10 + 2
          
    return arr[n]   
          
# Driver code   
n = 5
print(printNthElement(n))   

