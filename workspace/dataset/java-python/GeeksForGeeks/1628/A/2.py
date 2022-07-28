

# Python3 program to sort first half in increasing 
# order and second half in decreasing 
def mySort(arr): 
    n = len(arr); 
  
    # Sort the whole array 
    arr1 = arr[:n // 2] 
    arr2 = arr[n // 2:] 
    arr1.sort() 
    arr2.sort() 
    arr = arr1 + arr2 
  
    # Reverse the second half 
    low = n // 2; 
    high = n - 1; 
    while (low < high): 
        temp = arr[low]; 
        arr[low] = arr[high]; 
        arr[high] = temp; 
        low += 1; 
        high -= 1; 
    return arr; 
  
# Driver code 
if __name__ == '__main__': 
      
    # Our arr contains 8 elements 
    arr = [5, 4, 6, 2, 1, 3, 8, 9, 7]; 
    arr = mySort(arr); 
    print("Modified Array : ") 
    print(arr) 
  
# This code is contributed by 29AjayKumar 

