

# Python3 program to sort even 
# positioned elements in ascending  
# order and odd positionedelements  
# in descending order. 
  
# Function to calculate  
# the given problem. 
def evenOddInsertionSort(arr, n): 
  
    for i in range(2, n): 
      
        j = i - 2
        temp = arr[i] 
              
        # checking whether the position 
        #  is even or odd. And after  
        # checking applying the insertion  
        # sort to the given  
        # positioned elements. 
          
        # checking for odd positioned. 
        if ((i + 1) & 1 == 1) : 
          
            # Inserting even positioned elements 
            # in ascending order. 
            while (temp >= arr[j] and j >= 0):  
              
                arr[j + 2] = arr[j] 
                j -= 2
              
            arr[j + 2] = temp      
          
          
        # sorting the even positioned. 
        else : 
      
            # Inserting odd positioned elements 
            # in descending order. 
            while (temp <= arr[j] and j >= 0) : 
              
                arr[j + 2] = arr[j] 
                j -= 2
              
            arr[j + 2] = temp  
          
      
      
      
# A utility function to print an array of size n 
def printArray(arr, n): 
      
    for i in range(0, n): 
            print(arr[i], end=" ") 
  
# Driver program  
arr = [12, 11, 13, 5, 6] 
n = len(arr) 
evenOddInsertionSort(arr, n) 
printArray(arr, n) 
  
  
# This code is contributed by 
# Smitha Dinesh Semwal 

