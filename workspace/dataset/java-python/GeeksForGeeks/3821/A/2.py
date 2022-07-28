

# Python3 implementation of the approach  
  
# Function to find the required numbers  
def findNums(arr, n) :  
  
    # Find the sum and xor  
    S = 0; X = 0;  
    for i in range(n) :  
        S += arr[i];  
        X ^= arr[i]; 
  
    # Print the required elements  
    print(X, X + S);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 7 ];  
    n = len(arr);  
  
    findNums(arr, n);  
      
# This code is contributed by AnkiRai01 

