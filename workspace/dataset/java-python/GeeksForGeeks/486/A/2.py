

# Python 3 program for each element in 1st  
# array count elements less than or equal  
# to it in 2nd array  
  
MAX = 100000
  
# Function for each element in 1st  
# array count elements less than or  
# equal to it in 2nd array  
def countEleLessThanOrEqual(arr1, m, arr2, n): 
      
    # Creating hash array initially  
    # filled with zero  
    hash = [0 for i in range(MAX)]  
      
    # Insert element of arr2[] to hash  
    # such that hash[i] will give count  
    # of element i in arr2[]  
    for i in range(n): 
        hash[arr2[i]] += 1
  
    # Presum of hash array such that  
    # hash[i] will give count of element  
    # less than or equals to i in arr2[]  
    for i in range(1, MAX, 1): 
        hash[i] = hash[i] + hash[i - 1]  
      
    # Traverse arr1[] and print hash[arr[i]]  
    for i in range(m): 
        print(hash[arr1[i]], end = " ")      
  
# Driver code  
if __name__ == '__main__': 
    arr1 = [1, 2, 3, 4, 7, 9]  
    arr2 = [0, 1, 2, 1, 1, 4]  
    m = len(arr1)  
    n = len(arr2) 
      
    countEleLessThanOrEqual(arr1, m, arr2, n)  
      
# This code is contributed by 
# Shashank_Sharma 

