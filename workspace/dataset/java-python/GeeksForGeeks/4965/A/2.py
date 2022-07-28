

# Python 3 implementation to check  
# whether the given array is a k  
# sorted array or not 
  
# function to find index of element  
# 'x' in sorted 'arr' uses binary  
# search technique 
def binarySearch(arr, low, high, x): 
    while (low <= high): 
        mid = int((low + high) / 2) 
          
        if (arr[mid] == x): 
            return mid 
        elif(arr[mid] > x): 
            high = mid - 1
        else: 
            low = mid + 1
  
# function to check whether the given  
# array is a 'k' sorted array or not 
def isKSortedArray(arr, n, k): 
      
    # auxiliary array 'aux' 
    aux = [0 for i in range(n)] 
      
    # copy elements of 'arr' to 'aux' 
    for i in range(0, n, 1): 
        aux[i] = arr[i] 
      
    # sort 'aux'  
    aux.sort(reverse = False) 
      
    # for every element of 'arr' at  
    # index 'i', find its index 'j' in 'aux' 
    for i in range(0, n, 1): 
          
        # index of arr[i] in sorted 
        # array 'aux' 
        j = binarySearch(aux, 0, n - 1, arr[i]) 
          
        # if abs(i-j) > k, then that element is 
        # not at-most k distance away from its  
        # target position. Thus, 'arr' is not a  
        # k sorted array  
        if (abs(i - j) > k): 
            return "No"
      
    # 'arr' is a k sorted array 
    return "Yes"
  
# Driver Code 
if __name__ == '__main__': 
    arr = [3, 2, 1, 5, 6, 4] 
    n = len(arr) 
    k = 2
    print("Is it a k sorted array?:",  
           isKSortedArray(arr, n, k)) 
  
# This code is contributed by 
# Shashank_Sharma 

