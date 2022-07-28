

# Python3 implementation of the approach  
  
# Function to return the count of elements  
# P[i] such that P[i] is the second smallest  
# among P[i – 1], P[i] and P[i + 1]  
def countElements(p, n) :  
  
    # To store the required answer  
    ans = 0;  
  
    # Traverse from the second element  
    # to the second last element  
    for i in range(1, n - 1) : 
          
        if (p[i - 1] > p[i] and p[i] > p[i + 1]) : 
            ans += 1;  
        elif (p[i - 1] < p[i] and p[i] < p[i + 1]) : 
            ans += 1;  
      
    # Return the required answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    p = [ 2, 5, 1, 3, 4 ];  
    n = len(p);  
  
    print(countElements(p, n));  
  
# This code is contributed by AnkitRai01 

