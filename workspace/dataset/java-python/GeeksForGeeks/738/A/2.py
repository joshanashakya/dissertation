

from math import gcd 
# Python 3 implementation to generate the  
# required array 
  
# Function to find gcd of 
# array of numbers 
def findGCD(arr, n): 
    result = arr[0]  
    for i in range(1,n): 
        result = gcd(arr[i], result) 
    return result 
  
# Function to generate the array 
# with required constraints. 
def compute(arr, n): 
    answer = [] 
      
    # computing GCD of the given set 
    GCD_of_array = findGCD(arr, n) 
  
    # Solution exists if GCD of array is equal 
    # to the minimum element of the array 
    if(GCD_of_array == arr[0]): 
        answer.append(arr[0]) 
        for i in range(1,n): 
            answer.append(arr[0]) 
            answer.append(arr[i]) 
      
        # Printing the built array 
        for i in range(len(answer)): 
            print(answer[i],end = " ") 
  
      
    else: 
        print("No array can be build") 
  
# Driver function 
if __name__ == '__main__': 
    # Taking in the input and initializing 
    # the set STL set in cpp has a property 
    # that it maintains the elements in 
    # sorted order, thus we do not need  
    # to sort them externally 
    n = 3
    input = [2, 5, 6, 7, 11] 
    GCD = set() 
    for i in range(len(input)): 
        GCD.add(input[i]) 
  
    arr = [] 
  
    for i in GCD: 
        arr.append(i) 
  
    # Calling the computing function. 
    compute(arr,n) 
      
# This code is contributed by 
# Surendra_Gangwar 

