

# Python 3 program to sort the  
# array in a given index range  
  
# Function to sort the elements of  
# the array from index a to index b  
def partSort(arr, N, a, b): 
      
    # Variables to store start and 
    # end of the index range  
    l = min(a, b) 
    r = max(a, b) 
  
    # Temporary array  
    temp = [0 for i in range(r - l + 1)] 
    j = 0
    for i in range(l, r + 1, 1): 
        temp[j] = arr[i] 
        j += 1
      
    # Sort the temporary array  
    temp.sort(reverse = False) 
  
    # Modifying original array with 
    # temporary array elements  
    j = 0
    for i in range(l, r + 1, 1): 
            arr[i] = temp[j] 
            j += 1
  
    # Print the modified array  
    for i in range(0, N, 1): 
            print(arr[i], end = " ") 
  
# Driver code  
if __name__ == '__main__': 
    arr = [7, 8, 4, 5, 2] 
    a = 1
    b = 4
  
    # length of the array  
    N = len(arr)  
  
    partSort(arr, N, a, b) 
  
# This code is contributed by  
# Surendra_Gangwar 

