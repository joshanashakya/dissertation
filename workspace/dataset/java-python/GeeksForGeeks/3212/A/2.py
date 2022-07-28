

# Python3 code to determine whether numbers 
# 1 to N can be divided into two sets 
# such that absolute difference between  
# sum of these two sets is M and these 
# two sum are co-prime 
  
def __gcd (a, b): 
  
        return a if(b == 0) else __gcd(b, a % b); 
  
# function that returns boolean value 
# on the basis of whether it is possible 
# to divide 1 to N numbers into two sets 
# that satisfy given conditions. 
def isSplittable(n, m): 
  
    # initializing total sum of 1 
    # to n numbers 
    total_sum = (int)((n * (n + 1)) / 2); 
  
    # since (1) total_sum = sum_s1 + sum_s2 
    # and (2) m = sum_s1 - sum_s2 
    # assuming sum_s1 > sum_s2. 
    # solving these 2 equations to get 
    # sum_s1 and sum_s2 
    sum_s1 = int((total_sum + m) / 2); 
  
    # total_sum = sum_s1 + sum_s2 
    # and therefore 
    sum_s2 = total_sum - sum_s1; 
  
    # if total sum is less than the absolute 
    # difference then there is no way we 
    # can split n numbers into two sets 
    # so return false 
    if (total_sum < m): 
        return False; 
  
    # check if these two sums are 
    # integers and they add up to 
    # total sum and also if their 
    # absolute difference is m. 
    if (sum_s1 + sum_s2 == total_sum and 
                 sum_s1 - sum_s2 == m): 
  
        # Now if two sum are co-prime 
        # then return true, else return false. 
        return (__gcd(sum_s1, sum_s2) == 1); 
  
    # if two sums don't add up to total 
    # sum or if their absolute difference 
    # is not m, then there is no way to 
    # split n numbers, hence return false 
    return False; 
  
# Driver code 
n = 5; 
m = 7; 
  
# function call to determine answer 
if (isSplittable(n, m)): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed by mits 

