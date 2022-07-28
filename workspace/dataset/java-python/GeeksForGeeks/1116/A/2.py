

# Python 3 implementation of the approach 
MAX = 100000
  
# Function to return the required sum 
def findSumofEle(arr1, m, arr2, n): 
      
    # Creating hash array initially 
    # filled with zero 
    hash = [0 for i in range(MAX)] 
  
    # Calculate the frequency 
    # of elements of arr2[] 
    for i in range(n): 
        hash[arr2[i]] += 1
  
    # Running sum of hash array 
    # such that hash[i] will give count of 
    # elements less than or equal to i in arr2[] 
    for i in range(1, MAX, 1): 
        hash[i] = hash[i] + hash[i - 1] 
  
    # To store the maximum value of 
    # the number of elements in arr2[]  
    # which are smaller than or equal  
    # to some element of arr1[] 
    maximumFreq = 0
    for i in range(m): 
        maximumFreq = max(maximumFreq,  
                          hash[arr1[i]]) 
  
    # Calculate the sum of elements from arr1[] 
    # corresponding to maximum frequency 
    sumOfElements = 0
    for i in range(m): 
        if (maximumFreq == hash[arr1[i]]): 
            sumOfElements += arr1[i] 
  
    # Return the required sum 
    return sumOfElements 
  
# Driver code 
if __name__ == '__main__': 
    arr1 = [2, 5, 6, 8] 
    arr2 = [4, 10] 
    m = len(arr1) 
    n = len(arr2)  
    print(findSumofEle(arr1, m, arr2, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

