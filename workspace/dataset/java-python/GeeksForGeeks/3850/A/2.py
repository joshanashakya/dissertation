

# Python 3 program to find  
# length of the longest array  
# with first element smaller  
# than or equal to last element. 
  
# Search function for searching 
# the first element of the 
# subarray which is greater or 
# equal to the last element(num) 
def binarySearch(searchSpace, s, e, num): 
  
    while (s <= e): 
        mid = (s + e) // 2
  
        if searchSpace[mid] >= num : 
            ans = mid 
            e = mid - 1
          
        else: 
            s = mid + 1
  
    return ans 
  
# Returns length of the longest  
# array with first element 
# smaller than the last element. 
def longestSubArr(arr, n): 
  
    # Search space for the  
    # potential first elements. 
    searchSpace = [None] * n 
  
    # It will store the Indexes 
    # of the elements of search  
    # space in the original array. 
    index = [None] * n 
  
    # Initially the search  
    # space is empty. 
    j = 0
    ans = 0
  
    for i in range(n):  
  
        # We will add an ith element  
        # in the search space if the 
        # search space is empty or if  
        # the ith element is greater  
        # than the last element of  
        # the search space. 
        if (j == 0 or searchSpace[j - 1] < arr[i]) : 
            searchSpace[j] = arr[i] 
            index[j] = i 
            j += 1
  
        # we will search for the index  
        # first element in the search 
        # space and we will use it  
        # find the index of it in the  
        # original array. 
        idx = binarySearch(searchSpace, 0,  
                           j - 1, arr[i]) 
  
        # Update the answer if the length  
        # of the subarray is greater than  
        # the previously calculated lengths. 
        ans = max(ans, i - index[idx] + 1) 
      
    return ans 
  
if __name__ == "__main__": 
    arr = [ -5, -1, 7, 5, 1, -2 ] 
    n = len(arr) 
    print(longestSubArr(arr, n)) 
  
# This code is contributed 
# by ChitraNayal 

