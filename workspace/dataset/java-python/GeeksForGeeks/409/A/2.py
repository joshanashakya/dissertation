

# Python 3 program to count minimum number  
# of partitions of size 2 and sum smaller  
# than or equal to given key. 
  
def minimumSets(arr, n, key): 
      
    # sort the array 
    arr.sort(reverse = False) 
  
    # if sum of ith smaller and jth larger  
    # element is less than key, then pack  
    # both numbers in a set otherwise pack  
    # the jth larger number alone in the set 
    j = n - 1
    for i in range(0, j + 1, 1): 
        if (arr[i] + arr[j] <= key): 
            j -= 1
  
    # After ending of loop i will  
    # contain minimum number of sets 
    return i + 1
  
# Driver Code 
if __name__ == '__main__': 
    arr = [3, 5, 3, 4] 
    n = len(arr) 
    key = 5
    print(minimumSets(arr, n, key)) 
  
# This code is contributed by 
# Shashank_Sharma 

