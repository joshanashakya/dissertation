

# Python 3 program to check whether the  
# given array is perfect or not. 
  
def checkUnimodal(arr, n): 
      
    # Cover first strictly increasing part 
    i = 1
    while (i < n and arr[i] > arr[i - 1]): 
        i += 1
  
    # Cover middle equal part 
    while (i < n and arr[i] == arr[i - 1]): 
        i += 1
  
    # Cover last decreasing part 
    while (i < n and arr[i] < arr[i - 1]): 
        i += 1
  
    # Return true if we reached end. 
    return (i == n) 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 5, 5, 5, 4, 2 ] 
    n = len(arr) 
    if (checkUnimodal(arr, n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by  
# Surendra_Gangwar 

