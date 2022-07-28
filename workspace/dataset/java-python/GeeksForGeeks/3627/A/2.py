

# Python 3 implementation to check 
# if it is possible to pay a value 
  
# Function to check if it 
# is possible to pay a value 
def knowPair(a,b,n,s,m): 
    i = 0
    rem = 0
    count_b = 0
    flag = 0
  
    # Loop to add the value of coin A 
    while (i <= a): 
        rem = s - (n * i) 
        count_b = rem // m 
        if (rem % m == 0 and count_b <= b): 
            flag = 1
        i += 1
      
    # Condition to check if it is 
    # possible to pay a value of S 
    if (flag == 1): 
        print("YES") 
    else: 
        print("NO") 
  
# Driver Code 
if __name__ == '__main__': 
    A = 1
    B = 2
    n = 3
    S = 4
    m = 2
  
    knowPair(A, B, n, S, m) 
      
# This code is contributed by Surendra_Gangwar 

