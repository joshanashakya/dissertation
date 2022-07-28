

# Python3 program to find n-th number  
# in a series made of digits 4 and 7 
  
# Return n-th number in series made  
# of 4 and 7 
def printNthElement(n) : 
      
    # create an array of size (n + 1) 
    arr =[0] * (n + 1); 
    arr[1] = 4
    arr[2] = 7
  
    for i in range(3, n + 1) : 
        # If i is odd 
        if (i % 2 != 0) : 
            arr[i] = arr[i // 2] * 10 + 4
        else : 
            arr[i] = arr[(i // 2) - 1] * 10 + 7
      
    return arr[n] 
      
# Driver code 
n = 6
print(printNthElement(n)) 
  
# This code is contributed by Nikita Tiwari. 

