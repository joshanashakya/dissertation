

# Python3 implementation of the approach  
  
# Function to return the count  
# of the required pairs  
def countPairs(arr, n) :  
  
    # Calculating the valid pairs  
    # in forward direction  
    forward = [0] * n; 
      
    sForward = [];  
      
    for i in range(n) : 
        while (len(sForward) != 0 and arr[i] > arr[sForward[-1]]) : 
            forward[sForward[-1]] = 1;  
            sForward.pop();  
  
        sForward.append(i);  
  
    # Calculating the valid pairs  
    # in backward direction  
    backward = [0] * n;  
      
    sBackward = [];  
      
    for i in range(n - 1, -1, -1) :  
          
        while (len(sBackward) != 0 and arr[i] > arr[sBackward[-1]]) : 
            backward[sBackward[-1]] = 1;  
            sBackward.pop();  
  
        sBackward.append(i);  
  
    # Calculating the total number of pairs  
    res = 0;  
    for i in range(n) : 
        res += forward[i] + backward[i];  
  
    return res;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4, 5 ];  
      
    n = len(arr);  
  
    print(countPairs(arr, n));  
  
# This code is contributed by AnkitRai01 

