

# Python3 implementation of above approach 
  
# Function to return the total pairs 
# of elements whose modulo yield K 
def totalPairs(arr1, arr2, K, n, m): 
  
    # set is used to avoid duplicate pairs 
    s={} 
  
    for i in range(n): 
        for j in range(m): 
  
            # check which element is greater and 
            # proceed according to it 
            if (arr1[i] > arr2[j]): 
  
                # check if modulo is equal to K 
                if (arr1[i] % arr2[j] == K): 
                    s[(arr1[i], arr2[j])]=1
            else: 
                if (arr2[j] % arr1[i] == K): 
                    s[(arr2[j], arr1[i])]=1
  
  
  
    # return size of the set 
    return len(s) 
  
# Driver code 
  
arr1 = [ 8, 3, 7, 50 ] 
arr2 = [5, 1, 10, 4 ] 
K = 3
n = len(arr1) 
m = len(arr2) 
  
print(totalPairs(arr1, arr2, K, n, m)) 
  
# This code is contributed by mohit kumar 29 

