

# Python 3 implementation  
# of above approach 
  
# Function to count such triplets 
def countTriplets(arr, n, m): 
  
    count = 0
  
    # Sort the array 
    arr.sort() 
  
    # three pointer technique 
    for end in range(n - 1, 1, -1) : 
        start = 0
        mid = end - 1
        while (start < mid) : 
  
            # Calculate the product  
            # of a triplet 
            prod = (arr[end] * 
                    arr[start] * arr[mid]) 
  
            # Check if that product is  
            # greater than m, decrement mid 
            if (prod > m): 
                mid -= 1
  
            # Check if that product is  
            # greater than m, increment start 
            elif (prod < m): 
                start += 1
  
            # Check if that product is greater  
            # than m, decrement mid, increment  
            # start and increment the count  
            # of pairs 
            elif (prod == m): 
                count += 1
                mid -= 1
                start += 1
  
    return count 
  
# Drivers code 
if __name__ == "__main__": 
    arr = [ 1, 1, 1, 1, 1, 1 ] 
    n = len(arr) 
    m = 1
  
    print(countTriplets(arr, n, m)) 
  
# This code is contributed  
# by ChitraNayal 

