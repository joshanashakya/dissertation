

# Efficient Python3 program to count  
# Amicable pairs in an array. 
import math 
  
# Calculating the sum 
# of proper divisors 
def sumOfDiv(x):  
      
    # 1 is a proper divisor 
    sum = 1; 
    for i in range(2,int(math.sqrt(x))): 
        if x % i==0: 
            sum += i 
              
            # To handle perfect squares 
            if i != x/i: 
                sum += x/i 
    return int(sum); 
  
# check if pair is ambicle 
def isAmbicle(a, b): 
    return (sumOfDiv(a) == b and
            sumOfDiv(b) == a) 
  
# This function prints count  
# of amicable pairs present  
# in the input array 
def countPairs(arr,n):  
      
    # Map to store the numbers 
    s = set() 
    count = 0
    for i in range(n): 
        s.add(arr[i]) 
      
    # Iterate through each number,  
    # and find the sum of proper  
    # divisors and check if it's  
    # also present in the array 
    for i in range(n):      
        if sumOfDiv(arr[i]) in s: 
              
            # It's sum of proper divisors 
            sum = sumOfDiv(arr[i]) 
            if isAmbicle(arr[i], sum): 
                count += 1        
      
    # As the pairs are counted  
    # twice, thus divide by 2 
    return int(count/2); 
      
# Driver Code  
arr1 = [220, 284, 1184,  
        1210, 2, 5] 
n1 = len(arr1) 
print(countPairs(arr1, n1))  
  
arr2 = [2620, 2924, 5020,  
        5564, 6232, 6368] 
n2 = len(arr2) 
print(countPairs(arr2, n2))  
  
# This code is contributed  
# by Naveen Babbar 

