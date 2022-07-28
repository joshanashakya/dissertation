

# Python 3 implmentation to count the 
# triplets such that the sum of the 
# two numbers is equal to third number 
  
# Function to find the count of the  
# triplets such that sum of two  
# numbers is equal to the third number  
def countTriplets(arr, n): 
    freq = [0 for i in range(100)] 
      
    # Loop to count the frequency 
    for i in range(n): 
        freq[arr[i]] += 1
    count = 0
      
    # Loop to count for triplets 
    for i in range(n): 
        for j in range(i + 1, n, 1): 
            if(freq[arr[i] + arr[j]]): 
                count += 1
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    n = 4
    arr = [1, 5, 3, 2] 
      
    # Function Call 
    print(countTriplets(arr, n)) 
  
# This code is contributed by Surendra_Gangwar 

