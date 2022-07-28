

# Python3 program to count number 
# of ways we can form triplets  
# with minimum product. 
  
# function to calculate number of triples 
def noOfTriples (arr, n): 
  
    # Sort the array 
    arr.sort() 
      
    # Count occurrences of third element 
    count = 0
    for i in range(n): 
        if arr[i] == arr[2]: 
            count+=1
      
    # If all three elements are same  
    # (minimum element appears at l 
    # east 3 times). Answer is nC3. 
    if arr[0] == arr[2]: 
        return (count - 2) * (count - 1) * (count) / 6
      
    # If minimum element appears once. 
    # Answer is nC2. 
    elif arr[1] == arr[2]: 
        return (count - 1) * (count) / 2
      
    # Minimum two elements are distinct. 
    # Answer is nC1. 
    return count 
      
# Driver code 
arr = [1, 3, 3, 4] 
n = len(arr) 
print (noOfTriples(arr, n)) 
  
# This code is contributed by "Abhishek Sharma 44" 

