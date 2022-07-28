

# Python3 program to decide if an array 
# represents a permutation or not 
  
# Function to check if an 
# array represents a permutation or not 
def permutation(arr,  N) : 
  
    hash = [0]*(N + 1); 
  
    # Counting the frequency 
    for i in range(N) : 
        hash[arr[i]] += 1; 
  
    # Check if each frequency is 1 only 
    for i in range(1, N + 1) : 
        if (hash[i] != 1) : 
            return "No"; 
  
    return "Yes"; 
  
# Driver code 
if __name__ == "__main__" : 
  
    arr = [ 1, 1, 5, 5, 3 ]; 
    n = len(arr); 
    print(permutation(arr, n)); 
  
    # This code is contributed by Yash_R 

