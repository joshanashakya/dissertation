

# Python program to shuffle  
# an array in the form  
# of a1, b1, a2, b2,... 
  
arr = [1, 3, 5, 2, 4, 6] 
  
# function to 
# rearrange the array 
def rearrange(n) : 
  
    global arr 
      
    # if size is null or  
    # odd return because  
    # it is not possible  
    # to rearrange 
    if (n % 2 == 1) : 
        return
  
    # start from the 
    # middle index 
    currIdx = int((n - 1) / 2) 
  
    # each time we will set  
    # two elements from the  
    # start to the valid  
    # position by swapping 
    while (currIdx > 0) : 
      
        count = currIdx 
        swapIdx = currIdx 
      
        while (count > 0) :  
          
            temp = arr[swapIdx + 1] 
            arr[swapIdx + 1] = arr[swapIdx] 
            arr[swapIdx] = temp 
            swapIdx = swapIdx + 1
            count = count - 1    
          
        currIdx = currIdx - 1
  
# Driver Code 
n = len(arr) 
rearrange(n) 
for i in range(0, n) : 
    print ("{} " . format(arr[i]),  
                        end = "") 
      
# This code is contributed by  
# Manish Shaw(manishshaw1) 

