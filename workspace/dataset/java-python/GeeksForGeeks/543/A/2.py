

# Python3 implementation of the approach  
  
# Function to return the count  
# of valid pairs  
def count_pairs(n, a) :  
  
    # Store frequencies of array elements  
    frequency = dict.fromkeys(a, 0)  
    for i in range(n) : 
        frequency[a[i]] += 1
  
    count = 0
  
    # Count of pairs (arr[i], arr[j])  
    # where arr[i] = arr[j]  
    for f in frequency.values() :  
        count += f * (f - 1) // 2
      
    # Count of pairs (arr[i], arr[j]) where  
    # arr[i] != arr[j], i.e. Total pairs - pairs  
    # where arr[i] = arr[j]  
    return ((n * (n - 1)) // 2) - count 
  
# Driver Code  
if __name__ == "__main__" : 
      
    arr = [ 2, 4, 5, 2,  
            5, 7, 2, 8 ]  
    n = len(arr) 
    print(count_pairs(n, arr)) 
  
# This code is contributed by Ryuga 

