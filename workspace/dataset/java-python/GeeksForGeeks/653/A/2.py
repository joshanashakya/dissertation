

# Python3 program to maximum set bit sum in  
# array without considering adjacent elements 
  
# Function to count total number  
# of set bits in an integer 
def bit(n): 
  
    count = 0
      
    while(n): 
      
        count += 1
        n = n & (n - 1) 
      
    return count 
  
# Maximum sum of set bits 
def maxSumOfBits(arr, n): 
  
    # Calculate total number of set bits 
    # for every element of the array 
    for i in range( n): 
      
        # find total set bits for each  
        # number and store back into the array 
        arr[i] = bit(arr[i]) 
      
    incl = arr[0] 
    excl = 0
      
    for i in range(1, n) : 
      
        # current max excluding i  
        if incl > excl: 
            excl_new = incl  
        else: 
            excl_new = excl 
  
        # current max including i  
        incl = excl + arr[i];  
        excl = excl_new 
      
    # return max of incl and excl  
    if incl > excl: 
        return incl  
    else : 
        return excl 
  
# Driver code 
if __name__ == "__main__": 
  
    arr = [1, 2, 4, 5,  
           6, 7, 20, 25] 
      
    n = len(arr) 
      
    print (maxSumOfBits(arr, n)) 
      
# This code is contributed by ita_c 

