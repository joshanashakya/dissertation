

# Python program to find the maximum number of 
# unique values in the array 
  
# Function to find the maximum number of 
# unique values in the array 
def uniqueNumbers(arr, n): 
  
    # Sorting the given array 
    arr.sort() 
  
    # This array will store the frequency 
    # of each number in the array 
    # after performing the given operation 
    freq =[0]*(n + 2) 
  
    # Loop to apply the operation on  
    # each element of the array 
    for val in arr: 
  
        # Incrementing the value at index x 
        # if the value  arr[x] - 1 is 
        # not present in the array 
        if(freq[val-1]== 0): 
            freq[val-1]+= 1
  
        # If arr[x] itself is not present, then it 
        # is left as it is 
        elif(freq[val]== 0): 
            freq[val]+= 1
  
        # If both arr[x] - 1 and arr[x] are present 
        # then the value is incremented by 1 
        else: 
            freq[val + 1]+= 1
      
    # Variable to store the  
    # number of unique values 
    unique = 0
  
    # Finding the number of unique values 
    for val in freq: 
        if(val>0): 
            unique+= 1
      
    return unique 
  
# Driver code 
if __name__ == "__main__": 
    arr =[3, 3, 3, 3] 
    n = 4
    print(uniqueNumbers(arr, n)) 

