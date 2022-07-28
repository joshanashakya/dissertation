

# Function to find k-th  
# missing element 
def missingK(a, k, n) : 
  
    difference = 0
    ans = 0
    count = k 
    flag = 0
      
    # interating over the array 
    for i in range (0, n-1) :  
        difference = 0
          
        # check if i-th and  
        # (i + 1)-th element  
        # are not consecutive 
        if ((a[i] + 1) != a[i + 1]) : 
          
              
            # save their difference 
            difference += (a[i + 1] - a[i]) - 1
              
            # check for difference 
            # and given k 
            if (difference >= count) : 
                    ans = a[i] + count 
                    flag = 1
                    break
            else : 
                count -= difference      
      
    # if found 
    if(flag) : 
        return ans 
    else : 
        return -1
  
# Driver code 
# Input array 
a = [1, 5, 11, 19] 
  
# k-th missing element  
# to be found in the array 
k = 11
n = len(a) 
  
# calling function to 
# find missing element 
missing = missingK(a, k, n) 
  
print(missing) 
  
# This code is contributed by  
# Manish Shaw (manishshaw1) 

