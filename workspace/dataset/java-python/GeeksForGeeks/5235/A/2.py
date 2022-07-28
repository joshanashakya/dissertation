

# Python 3 program to replace the elements 
# by their frequency in the array. 
  
def ReplaceElementsByFrequency(arr, n): 
      
    # Hash map which will store the 
    # frequency of the elements of the array. 
    mp = {i:0 for i in range(len(arr))} 
  
    for i in range(n): 
          
        # Increment the frequency of the  
        # element by 1. 
        mp[arr[i]] += 1
  
    # Replace every element by its frequency 
    for i in range(n): 
        arr[i] = mp[arr[i]] 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 5, 2, 2, 5] 
    n = len(arr) 
  
    ReplaceElementsByFrequency(arr, n); 
  
    # Print the modified array. 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# This code is contributed by 
# Sahil_shelangia 

