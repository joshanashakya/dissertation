

# Python 3 program for the above approach 
def getSteps(arr, n): 
  
    # Count to keep track of the  
    # number of steps done. 
    count = 0
  
    # Modulus array to store all elements mod 4 
    modulus = [0 for i in range(4)] 
  
    # Sum to check if given task is possible 
    Sum = 0
  
    # Loop to store all elements mod 4  
    # and calculate Sum 
    i = 0
    for i in range(n): 
        mod = arr[i] % 4
        Sum += mod 
        modulus[mod] += 1
  
    # If Sum is not divisible by 4,  
    # not possible 
    if (Sum % 4 != 0): 
        return -1
    else: 
  
        # Find minimum of modulus[1] and modulus[3] 
        # and increment the count by the minimum 
        if (modulus[1] > modulus[3]): 
            count += modulus[3] 
        else: 
            count += modulus[1] 
              
        # Update the values in modulus array. 
        modulus[1] -= count 
        modulus[3] -= count 
  
        # Use modulus[2] to pair remaining elements. 
        modulus[2] += modulus[1] // 2
        modulus[2] += modulus[3] // 2
  
        # incrememnt count to half of remaining 
        # modulus[1] or modulus of [3] elements. 
        count += modulus[1] // 2
        count += modulus[3] // 2
  
        # increment count by half of modulus[2] 
        count += modulus[2] // 2
  
        return count 
  
# Driver Code 
  
# size of array 
n = 7
  
# input array 
arr = [1, 2, 3, 1, 2, 3, 8] 
  
count = getSteps(arr, n) 
print(count) 
  
# This code is contributed by mohit kumar 

