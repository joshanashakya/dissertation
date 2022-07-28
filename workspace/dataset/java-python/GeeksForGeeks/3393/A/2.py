

# Python3 program to find OR of all the sub-arrays 
  
# function to return OR of sub-arrays  
def OR(a, n): 
      
    ans = a[0] 
    for i in range(1,n): 
        ans |= a[i] 
      
    return ans 
      
# Driver Code 
if __name__=='__main__': 
    a = [1, 4, 6] 
    n = len(a) 
  
# print OR of all subarrays 
    print(OR(a, n)) 
  
# This code is contributed  
# by Shashank_Sharma 

