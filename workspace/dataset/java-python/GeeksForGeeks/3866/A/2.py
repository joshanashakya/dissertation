

# Python3 program to count the numbers  
# divisible by k in a given range  
  
# Returns count of numbers in [l r]  
# that are divisible by k.  
def Check_is_possible(l, r, k):  
  
    div_count = (r // k) - (l // k)  
  
    # Add 1 explicitly as l is 
    # divisible by k  
    if l % k == 0: 
        div_count += 1
  
    # l is not divisible by k  
    return div_count > 1
  
# Driver Code  
if __name__ == "__main__": 
  
    l, r, k = 30, 70, 10
  
    if Check_is_possible(l, r, k) == True:  
        print("YES")  
    else: 
        print("NO")  
      
# This code is contributed  
# by Rituraj Jain 

