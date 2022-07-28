

# Python3 Program to find maximum value of  
# maximum of minimums of k segments. 
  
# function to calculate the max of all the  
# minimum segments  
def maxOfSegmentMins(a,n,k): 
  
    # if we have to divide it into 1 segment  
    # then the min will be the answer  
    if k ==1: 
        return min(a) 
    if k==2: 
        return max(a[0],a[n-1]) 
  
    # If k >= 3, return maximum of all  
    #  elements.  
    return max(a) 
      
# Driver code 
if __name__=='__main__': 
    a = [-10, -9, -8, 2, 7, -6, -5] 
    n = len(a) 
    k =2
    print(maxOfSegmentMins(a,n,k)) 
  
# This code is contributed by  
# Shrikant13 

