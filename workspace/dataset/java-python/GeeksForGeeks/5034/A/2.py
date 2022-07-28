

# Python 3 implementation of the approach 
from math import gcd 
  
# Function to find elements of vector 
def Print(ans): 
    for i in range(len(ans)): 
        print(ans[i], end = " ") 
  
# Function to find the lexicographically  
# largest permutation that satisfies  
# the given condition 
def Permutation(a, n): 
    flag = 0
  
    # To store the required ans 
    ans = [] 
  
    # Sort the array 
    a.sort(reverse = False) 
  
    for i in range(2, n, 1): 
          
        # If need to make arranagement 
        if (a[i] != a[i - 1] + 
        gcd(a[i - 1], a[i - 2])): 
            flag = 1
            pos = i 
            break
  
    # If possible then check for  
    # lexographically larger  
    # permutation (if any possible) 
    if (flag == 0): 
          
        # If larger arrangement is possible 
        if (a[1] == a[0] + 
        gcd(a[0], a[n - 1])): 
            ans.append(a[n - 1]) 
            for i in range(n - 1): 
                ans.append(a[i]) 
  
            Print(ans) 
            return
  
        # If no other arrangement is possible 
        else: 
            for i in range(n): 
                ans.append(a[i]) 
  
            Print(ans) 
            return
  
    # Need to re-arrange the array 
    else: 
          
        # If possible, place at first position 
        if (a[1] == a[0] + 
        gcd(a[pos], a[0])): 
            flag = 0
            i = n - 1
            while(i > pos + 2): 
                  
                # If even after one arrangement its  
                # impossible to get the required array 
                if (a[i] != a[i - 1] + 
                gcd(a[i - 1], a[i - 2])): 
                    flag = 1
                    break
  
                i -= 1
              
            if (flag == 0 and pos < n - 1): 
                  
                # If it is not possible to get 
                # the required array 
                if (a[pos + 1] != a[pos - 1] + 
                gcd(a[pos - 1], a[pos - 2])): 
                    flag = 1
  
            if (flag == 0 and pos < n - 2): 
                  
                # If it is not possible to get 
                # the required array 
                if (a[pos + 2] != a[pos + 1] +
                gcd(a[pos - 1], a[pos + 1])): 
                    flag = 1
  
            # If it is possible to get the answer 
            if (flag == 0): 
                ans.append(a[pos]) 
                for i in range(n): 
                    if (i != pos): 
                        ans.append(a[i]) 
  
                Print(ans) 
                return
  
    ans.append(-1) 
    Print(ans) 
  
# Driver code 
if __name__ == '__main__': 
    a = [4, 6, 2, 8, 8] 
    n = len(a) 
  
    Permutation(a, n) 
      
# This code is contributed by 
# Surendra_Gangwar 

