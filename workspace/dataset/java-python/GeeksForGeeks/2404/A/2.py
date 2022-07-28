

# Python 3 implementation of the approach 
  
# Function that finds the largest 
# element which is repeated 'k' times 
def solve(arr, n, k): 
  
    # sort the array 
    arr.sort() 
  
    # if the value of 'k' is 1 and the 
    # largest appears only once in the array 
    if (k == 1 and arr[n - 2] != arr[n - 1]): 
        print( arr[n - 1] ) 
        return
  
    # counter to count 
    # the repeated elements 
    count = 1
  
    for i in range(n - 2, -1, -1) : 
  
        # check if the element at index 'i' 
        # is equal to the element at index 'i+1' 
        # then increase the count 
        if (arr[i] == arr[i + 1]): 
            count += 1
  
        # else set the count to 1 
        # to start counting the frequency 
        # of the new number 
        else: 
            count = 1
  
        # if the count is equal to k 
        # and the previous element 
        # is not equal to this element 
        if (count == k and (i == 0 or 
           (arr[i - 1] != arr[i]))): 
            print(arr[i]) 
            return
  
    # if there is no such element 
    print("No such element") 
  
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 1, 1, 2, 3, 3, 4,  
            5, 5, 6, 6, 6 ] 
    k = 2
    n = len(arr) 
  
    # find the largest element 
    # that is repeated K times 
    solve(arr, n, k) 
  
# This code is contributed 
# by ChitraNayal 

