

# Python3 program to find the difference  
# between the sum of the cubes of the  
# first N natural numbers and  
# the sum of the first N natural number  
def difference(n) :  
  
    # Sum of first n natural numbers  
    S = (n * (n + 1)) // 2;  
  
    # Find the required difference  
    res = S * (S - 1);  
  
    return res;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 5;  
    print(difference(n));  
      
# This code is contributed by AnkitRai01 

