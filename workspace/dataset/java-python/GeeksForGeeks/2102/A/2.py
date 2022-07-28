

# Python program to count total numbers which 
# have difference with sum of digits greater  
# than specific value 
  
   
#  Utility method to get sum of digits of K 
def sumOfDigit(K):  
  
    #  loop until K is not zero 
    sod = 0
    while (K): 
      
        sod =sod + K % 10
        K =K // 10
      
    return sod 
  
   
# method returns count of 
# numbers smaller than N,  
# satisfying difference condition 
def totalNumbersWithSpecificDifference(N,diff): 
  
    low = 1
    high = N 
   
    #  binary search while loop     
    while (low <= high):  
      
        mid = (low + high) // 2
   
        ''' if difference between number and its sum  
           of digit is smaller than given difference  
           then  smallest number will be on left side'''
        if (mid - sumOfDigit(mid) < diff):         
            low = mid + 1
  
          # if difference between number and its sum  
          # of digit  greater than  equal to given  
          # difference then  smallest number will be on  
          # right side     
        else: 
              
            high = mid - 1        
      
   
    # return the difference between 'smallest number  
    # found' and 'N' as result 
    return (N - high) 
   
#  Driver code to test above methods 
N = 13
diff = 2
  
print(totalNumbersWithSpecificDifference(N, diff))     
      
# This code is contributed by Anant Agarwal. 

