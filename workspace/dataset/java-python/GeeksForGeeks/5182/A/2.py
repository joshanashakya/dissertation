

# Python3 code to check whether the last 
# element of the array is even or odd  
# after performing the operation p times. 
  
def check_last (arr, n, p): 
    _sum = 0
      
    # sum of the array. 
    for i in range(n): 
        _sum = _sum + arr[i] 
    if p == 1: 
      
        # if sum is even 
        if _sum % 2 == 0: 
            return "ODD"
        else: 
            return "EVEN"
    return "EVEN"
      
# driver code 
arr = [5, 7, 10] 
p = 1
n = len(arr) 
print(check_last (arr, n, p)) 
  
# This code is contributed by "Abhishek Sharma 44" 

