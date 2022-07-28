

# Python3 to count number of elements  
# present in arr1 whose occurrence is 
# more than in arr2 
def Largercount(arr1, arr2, m, n): 
  
    count = 0
  
    # map to store frequency of 
    # elements present in arr1 
    mp=dict() 
  
    # frequency of elements of arr1  
    # is calulated 
    for i in range(m): 
        mp[arr1[i]] = mp.get(arr1[i], 0) + 1
  
    # check if the elements of arr2 
    # is present in arr2 or not 
    for i in range(n): 
        if (arr2[i] in mp.keys() and 
                       mp[arr2[i]] != 0): 
            mp[arr2[i]] -= 1
  
    # count the elements of arr1 whose 
    # frequency is more than arr2 
    for i in range(m): 
        if (mp[arr1[i]] != 0): 
            count += 1
            mp[arr1[i]] = 0
              
    return count 
  
# Driver code 
arr1 = [2, 4, 4, 6, 6, 6, 8, 9] 
arr2 = [2, 2, 4, 6, 6 ] 
print(Largercount(arr1, arr2, 8, 5)) 
  
# This code is contributed by mohit kumar 

