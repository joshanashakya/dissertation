

# Python 3 program to implement  
# above approach 
  
# Function to print the array elements 
def printArray(N, arr): 
    for i in range(N): 
        print(arr[i], end = " ") 
  
    print("\n", end = "") 
  
# Function to replace all elements with  
# absolute difference of absolute sums  
# of positive and negatve elements 
def replacedArray(N, arr): 
    for i in range(N): 
        pos_sum = 0
        neg_sum = 0
  
        # Calculate absolute sums of possitive 
        # and negative elements in range i+1 to N 
        for j in range(i + 1, N, 1): 
            if (arr[j] > 0): 
                pos_sum += arr[j] 
            else: 
                neg_sum += arr[j] 
  
        # calculate difference of both sums 
        diff = abs(pos_sum) - abs(neg_sum) 
  
        # replace i-th elements with absolute 
        # difference 
        arr[i] = abs(diff) 
  
# Driver code 
if __name__ == '__main__': 
    N = 5
    arr = [1, -1, 2, 3, -2] 
    replacedArray(N, arr) 
    printArray(N, arr) 
  
    N = 6
    arr1 = [-3, -4, -2, 5, 1, -2] 
    replacedArray(N, arr1) 
    printArray(N, arr1) 
  
# This code is contributed by 
# Surendra_Gangwar 

