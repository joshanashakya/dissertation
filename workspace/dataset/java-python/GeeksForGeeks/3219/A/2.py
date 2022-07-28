

# Python implementation to form the smallest 
# number using at most one swap operation 
  
# function to form the smallest number 
# using at most one swap operation 
def smallestNumber(num): 
    num = list(num) 
    n = len(num) 
    rightMin = [0]*n 
    right = 0
  
    # for the rightmost digit, there 
    # will be no smaller right digit 
    rightMin[n-1] = -1; 
      
    # index of the smallest right digit 
    # till the current index from the 
    # right direction 
    right = n-1; 
  
    # traverse the array from second 
    # right element up to the left 
    # element 
    for i in range(n-2, 0, -1): 
  
        # if 'num[i]' is greater than 
        # the smallest digit encountered 
        # so far 
        if num[i] > num[right]: 
            rightMin[i] = right 
          
        else: 
  
            # there is no smaller right 
            # digit for 'num[i]' 
            rightMin[i] = -1
  
            # update 'right' index 
            right = i 
      
    # special condition for the 1st digit so that 
    # it is not swapped with digit '0' 
    small = -1
    for i in range(1, n): 
  
        if num[i] != '0': 
              
            if small == -1: 
                  
                if num[i] < num[0]: 
                    small = i 
              
            elif num[i] < num[small]: 
                small = i 
          
    if small != -1: 
        num[0], num[small] = num[small], num[0] 
    else: 
  
        # traverse the 'rightMin[]' array from  
        # 2nd digit up to the last digit 
        for i in range(1, n): 
  
            # if for the current digit, smaller 
            # right digit exists, then swap it 
            # with its smaller right digit and 
            # break 
            if rightMin[i] != -1: 
  
                # performing the required 
                # swap operation 
                num[i], num[rightMin[i]] = num[rightMin[i]], num[i] 
                break
      
    # required smallest number 
    return ''.join(num) 
  
# Driver Code 
if __name__ == "__main__": 
    num = "9625635"
    print("Smallest number: ", smallestNumber(num)) 
  
# This code is contributed by  
# sanjeev2552 

