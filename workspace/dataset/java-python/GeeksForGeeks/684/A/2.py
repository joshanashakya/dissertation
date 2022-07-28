

# Python3 implementation of the approach  
  
# Function to find maximum element  
# among (N - 1) elements other than  
# a[i] for each i from 1 to N  
def max_element(a, n) : 
  
    # To store prefix max element  
    pre = [0] * n;  
  
    pre[0] = a[0];  
    for i in range(1, n) :  
        pre[i] = max(pre[i - 1], a[i]);  
  
    # To store suffix max element  
    suf = [0] * n;  
  
    suf[n - 1] = a[n - 1];  
    for i in range(n - 2, -1, -1) : 
        suf[i] = max(suf[i + 1], a[i]);  
  
    # Find the maximum element  
    # in the array other than a[i]  
    for i in range(n) : 
        if (i == 0) : 
            print(suf[i + 1], end = " ");  
  
        elif (i == n - 1) : 
            print(pre[i - 1], end = " ");  
  
        else : 
            print(max(pre[i - 1],  
                      suf[i + 1]), end = " "); 
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 2, 5, 6, 1, 3 ];  
    n = len(a);  
  
    max_element(a, n);  
  
# This code is contributed by AnkitRai01 

