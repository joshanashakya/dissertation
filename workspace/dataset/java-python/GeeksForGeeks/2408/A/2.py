

# Python3 Program to decide if an 
# array represents a permutation or not 
  
# Function to check if an 
# array represents a permutation or not 
def permutation(arr, n): 
      
        # Set to check the count 
    # of non-repeating elements 
    s = set() 
  
    maxEle = 0; 
  
    for i in range(n): 
    
        # Insert all elements in the set 
        s.add(arr[i]); 
  
        # Calculating the max element 
        maxEle = max(maxEle, arr[i]); 
      
    if (maxEle != n): 
        return False
  
    # Check if set size is equal to n 
    if (len(s) == n): 
        return True; 
  
    return False; 
  
# Driver code 
if __name__=='__main__':  
  
    arr = [ 1, 2, 5, 3, 2 ] 
    n = len(arr) 
  
    if (permutation(arr, n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by Princi Singh 

