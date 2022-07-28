

# Python3 program to find the  
# smallest positive number which  
# can not be represented by given digits 
  
# Function to find the smallest  
# positive number which can not be 
# represented by given digits 
def expressDigit(arr, n): 
  
    min = 9
    index = 0
  
    temp = 0
  
    # Storing the count of 0 digit 
    # or store the value at 0th index 
    temp = arr[0] 
  
    # Calculates the min value in  
    # the array starting from  
    # 1st index and also store its index. 
    for i in range(1, 10): 
  
        if(arr[i] < min): 
            min = arr[i] 
            index = i 
  
    # Now compare the min value with the 
    # value at 0th index. 
  
    # If its value at 0th index is  
    # less than min value than either  
    # 10, 100, 1000 ... can't be expressed 
    if(temp < min): 
        print(1, end = "") 
        for i in range(1, temp + 1): 
            print(0, end = "") 
  
    # If its value is greater than  
    # min value then iterate the loop  
    # upto first min value index and 
    # simply print its index value. 
    else: 
        for i in range(min): 
            print(index, end = "") 
  
        print(index) 
  
# Driver code 
arr = [2, 2, 1, 2, 1,  
       1, 3, 1, 1, 1] 
  
# Value of N is always 10  
# as we take digit from 0 to 9 
N = 10
  
# Calling function 
expressDigit(arr, N) 
  
# This code is contributed by Mohit Kumar 

