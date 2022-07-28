

# Python3 program to Replace every 
# element with the greater element 
# on its left side 
  
# Function to replace the elements 
def ReplaceElements(arr, n): 
  
    # Max value initialised 
    # to element at 0th index 
    max_ele = arr[0] 
    arr[0] = -1
  
    for i in range(1, n): 
  
        # If max_ele is greater tha arr[i] 
        # then just replace arr[i] with max_ele 
        if (max_ele > arr[i]): 
            arr[i] = max_ele 
  
        # Else if update the max_ele also 
        elif (max_ele <= arr[i]): 
            temp = arr[i] 
            arr[i] = max_ele 
            max_ele = temp 
  
# Driver code 
if __name__ == "__main__": 
  
    arr = [4, 5, 2, 1, 7, 6 ] 
    n = len(arr) 
  
    # Replace the elements 
    # with the smaller element 
    # on its left side 
    ReplaceElements(arr, n) 
  
    # Print the modified array 
    for i in range (n): 
        print( arr[i], end = " ") 
  
# This code is contributed 
# by ChitraNayal 

