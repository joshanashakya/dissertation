

# Python 3 program to print first half  
# in ascending order and the second half 
# in descending order 
  
# function to print half of the array in  
# ascending order and the other half in  
# descending order 
def printOrder(arr, n): 
  
    # sorting the array 
    arr.sort() 
  
    # printing first half in ascending  
    # order 
    for i in range(n // 2):  
        print(arr[i], end = " ")  
  
    # printing second half in descending  
    # order 
    for j in range(n - 1, n // 2 -1, -1) : 
        print(arr[j], end = " ") 
  
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 5, 4, 6, 2, 1, 3, 8, -1 ] 
    n = len(arr) 
    printOrder(arr, n) 
  
# This code is contributed by ita_c 

