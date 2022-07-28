

# Python 3 implementation of the approach  
  
# Function to count minimum number of subarrays  
def minimumSubarrays(ar, n) :  
    se = []  
  
    cnt = 1;  
  
    for i in range(n) : 
          
        # Checking if an element already exist in  
        # the current sub-array  
        if se.count(ar[i]) == 0 :  
              
            # inserting the current element  
            se.append(ar[i])  
        else :  
            cnt += 1
              
            # clear set for new possible value  
            # of subarrays  
            se.clear()  
              
            # inserting the current element  
            se.append(ar[i])  
    return cnt  
  
# Driver Code  
ar = [ 1, 2, 1, 3, 4, 2, 4, 4, 4 ]  
n = len(ar)  
print(minimumSubarrays(ar, n))  
  
# This code is contributed by 
# divyamohan123 

