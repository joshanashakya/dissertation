

# Python3 implementation of the approach  
  
# Function to find the permutation  
def Findpermutation(n) : 
  
    a = [0] * (n + 1);  
  
    # Put n at the first index 1  
    a[1] = n;  
  
    # Put all the numbers from  
    # 2 to n sequentially  
    for i in range(2, n + 1) : 
        a[i] = i - 1;  
  
    return a;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 8;  
  
    v = Findpermutation(n);  
  
    # Display the permutation  
    for i in range(1, n + 1) : 
        print(v[i], end = ' ');  
  
# This code is contributed by AnkitRai01 

