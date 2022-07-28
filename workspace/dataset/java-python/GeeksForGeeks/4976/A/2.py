

# Python3 program to find n numbers  
# from given ordered pairwise sum of them. 
  
# Note : n is not size of array, 
# but number of elements whose 
# pairwise sum is stored in arr[] 
def findNumbers(arr, n): 
  
    num = [0 for i in range(n)] 
  
    # b-a is calculated here 
    b_minus_a = arr[n-1] - arr[1] 
  
    # b is calculated here 
    num[1] = (arr[0] + b_minus_a) // 2
  
    # a is calculated here 
    num[0] = arr[0] - num[1] 
  
    # to calculate all the other numbers 
    for i in range(1, (n - 2) + 1): 
        num[i+1] = arr[i] - num[0] 
  
    # display the numbers 
    print("Numbers are: ", end = "") 
    for i in range(n):  
        print(num[i], end = ", ") 
  
# Driver Code 
arr = [13, 10, 14, 9, 17, 21, 16, 18, 13, 17] 
n = 5 # n is not size of array, but number 
      # of elements whose pairwise sum is  
      # stored in arr[] 
        
findNumbers(arr, n) 
  
# This code is contributed by Anant Agarwal. 

