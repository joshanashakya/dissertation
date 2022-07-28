

# Python 3 program to sort an array such  
# that sum of product of alternate element 
# is minimum. 
def minSum(arr, n): 
  
    # create evenArr[] and oddArr[] 
    evenArr = [] 
    oddArr = [] 
  
    # sort main array in ascending order 
    arr.sort() 
  
    # Put elements in oddArr[] and  
    # evenArr[] as per desired value. 
    for i in range(n): 
      
        if (i < n // 2): 
            oddArr.append(arr[i]) 
        else: 
            evenArr.append(arr[i]) 
  
    # sort evenArr[] in descending order 
    evenArr.sort(reverse = True) 
  
    # merge both sub-array and 
    # calculate minimum sum of 
    # product of alternate elements 
    i = 0
    sum = 0
    for j in range(len(evenArr)): 
        arr[i] = evenArr[j] 
        i += 1
        arr[i] = oddArr[j] 
        i += 1
        sum += evenArr[j] * oddArr[j] 
      
    return sum
  
# Driver Code 
if __name__ == "__main__": 
      
    arr = [ 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 ] 
    n = len(arr) 
    print( "Minimum required sum =",  
                      minSum(arr, n)) 
    print("Sorted array in required format : ",  
                                      end = "") 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# This code is contributed by ita_c 

