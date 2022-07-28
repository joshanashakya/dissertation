

# Python3 program to Replace every 
# element with the smaller element 
# on its left side 
  
# Function to replace the elements 
def ReplaceElements(arr, n): 
  
    # MIN value initialised 
    # to element at 0th index 
    min_ele = arr[0] 
    arr[0] = -1
  
    for i in range(1, n): 
  
        # If min_ele is smaller than arr[i] 
        # then just replace arr[i] with min_ele 
        if (min_ele < arr[i]): 
            arr[i] = min_ele 
  
        # Else if update the min_ele also 
        elif (min_ele >= arr[i]) : 
            temp = arr[i] 
            arr[i] = min_ele 
            min_ele = temp 
  
# Driver code 
if __name__ == "__main__": 
  
    arr = [ 4, 5, 2, 1, 7, 6 ] 
    n = len (arr) 
  
    # Replace the elements 
    # with the smaller element 
    # on its left side 
    ReplaceElements(arr, n) 
  
    # Print the modified array 
    for i in range( n): 
        print (arr[i], end = " ") 
  
# This code is contributed 
# by ChitraNayal 

