

# Python3 implementation of the approach  
  
# Function that returns true if n is an ugly number  
def isUgly(n):  
  
    # While divisible by 2, keep dividing  
    while n % 2 == 0:  
        n = n // 2
  
    # While divisible by 3, keep dividing  
    while n % 3 == 0:  
        n = n // 3
  
    # While divisible by 5, keep dividing  
    while n % 5 == 0:  
        n = n // 5
  
    # n must be 1 if it was ugly  
    if n == 1: 
        return True
    return False
  
# Function to sort ugly numbers  
# in their relative positions  
def sortUglyNumbers(arr, n):  
  
    # To store the ugly numbers from the array  
    list = []  
  
    for i in range(0, n):  
  
        # If current element is an ugly number  
        if isUgly(arr[i]):  
  
            # Add it to the ArrayList  
            # and set arr[i] to -1  
            list.append(arr[i])  
            arr[i] = -1
  
    # Sort the ugly numbers  
    list.sort()  
  
    j = 0
    for i in range(0, n):  
      
        # Position of an ugly number  
        if arr[i] == -1:  
            print(list[j], end = " ") 
            j += 1
        else: 
            print(arr[i], end = " ")  
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [1, 2, 3, 7, 12, 10]  
    n = len(arr)  
    sortUglyNumbers(arr, n)  
  
# This code is contributed by Rituraj Jain 

