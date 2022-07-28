

# Python3 implementation of the approach  
  
# Function to return the  
# required sum  
def sumOfLastDig(n, m) :  
  
    sum = 0;  
  
    # Number of element beetween  
    # 1 to n divisible by m  
    k = n // m; 
      
    # Array to store the last digit 
    # of elements in a cycle 
    arr = [0] * 10;  
  
    # Storing and adding last  
    # digit of cycle  
    for i in range(10) : 
        arr[i] = m * (i + 1) % 10;  
        sum += arr[i];  
  
    # Number of elements  
    # present in last cycle  
    rem = k % 10;  
  
    # Sum of k/10 cycle  
    ans = (k // 10) * sum;  
  
    # Adding value of digits  
    # of last cycle to the answer  
    for i in range(rem) : 
        ans += arr[i];  
  
    return ans;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    # input n and m  
    n = 100; m = 3;  
  
    print(sumOfLastDig(n, m));  
  
# This code is contributed by AnkitRai01 

