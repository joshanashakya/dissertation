

# Python program to sort an array in 
# decreasing order of their frequnecy 
  
# Function that return the index 
# upto all the array elements are 
# updated. 
def sortByFreq(arr, n): 
  
    # Initialise maxE = -1 
    maxE = -1; 
  
    # Find the maximum element of 
    # arr[] 
    for i in range(n): 
        maxE = max(maxE, arr[i]) 
  
    # Create frequency array freq[] 
    freq = [0]*(maxE + 1); 
  
    # Update the frequency array as 
    # per the occurence of element in 
    # arr[] 
    for i in range(n): 
        freq[arr[i]] += 1; 
      
    # Initialise cnt to 0 
    cnt = 0; 
  
    # Traversing freq[] 
    for i in range(maxE+1): 
  
        # If freq of an element is 
        # greater than 0 update the 
        # value of arr[] at index cnt 
        # & increment cnt 
        if (freq[i] > 0): 
  
            value = 100000 - i; 
            arr[cnt] = 100000 * freq[i] + value; 
            cnt += 1; 
          
    # Return cnt 
    return cnt; 
  
# Function that print array arr[] 
# elements in sorted order 
def printSortedArray(arr, cnt): 
  
    # Traversing arr[] till index cnt 
    for i in range(cnt): 
  
        # Find frequency of elements 
        frequency = arr[i] / 100000; 
  
        # Find value at index i 
        value = 100000 - (arr[i] % 100000); 
  
        # Traversing till frequency 
        # to print value at index i 
        for j in range(int(frequency)): 
            print(value, end=" ") 
              
# Driver code 
if __name__=='__main__':  
  
    arr = [ 4, 4, 5, 6, 4, 2, 2, 8, 5 ] 
  
    # Size of array arr[] 
    n = len(arr) 
  
    # Function call to get cnt 
    cnt = sortByFreq(arr, n); 
  
    # Sort the arr[] in decreasing order 
    arr.sort(reverse = True) 
  
    # Function that prints elements 
    # in decreasing order 
    printSortedArray(arr, cnt); 
  
# This code is contributed by Princi Singh 

