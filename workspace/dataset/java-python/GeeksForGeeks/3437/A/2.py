

# Python3 implementation of the approach  
  
# Function to return an ArrayList containing  
# all the perfect squares upto n  
def getPerfectSquares(n):  
  
    perfectSquares = []; 
    current = 1; 
    i = 1;  
  
    # while current perfect square is  
    # less than or equal to n  
    while (current <= n):  
        perfectSquares.append(current); 
        i += 1; 
        current = int(pow(i, 2));  
  
    return perfectSquares;  
  
# Function to print the sum of maximum  
# two elements from the array  
def maxPairSum(arr):  
  
    n = len(arr);  
    max = 0; 
    secondMax = 0;  
    if (arr[0] > arr[1]):  
        max = arr[0];  
        secondMax = arr[1];  
    else:  
        max = arr[1];  
        secondMax = arr[0];  
  
    for i in range(2, n):  
        if (arr[i] > max):  
            secondMax = max;  
            max = arr[i];  
        elif (arr[i] > secondMax):  
            secondMax = arr[i];  
  
    return (max + secondMax);  
  
# Function to return the count of numbers that  
# when added with n give a perfect square  
def countPairsWith(n, perfectSquares, nums):  
  
    count = 0;  
    for i in range(len(perfectSquares)):  
        temp = perfectSquares[i] - n;  
  
        # temp > n is checked so that pairs  
        # (x, y) and (y, x) don't get counted twice  
        if (temp > n and (temp in nums)):  
            count += 1;  
  
    return count;  
  
# Function to count the pairs whose 
# sum is a perfect square  
def countPairs(arr): 
  
    n = len(arr);  
  
    # Sum of the maximum two elements  
    # from the array  
    max = maxPairSum(arr);  
  
    # List of perfect squares upto max  
    perfectSquares = getPerfectSquares(max);  
  
    # Contains all the array elements  
    nums = [];  
    for i in range(n):  
        nums.append(arr[i]);  
  
    count = 0;  
    for i in range(n):  
  
        # Add count of the elements that when  
        # added with arr[i] give a perfect square  
        count += countPairsWith(arr[i],  
                 perfectSquares, nums);  
    return count;  
  
# Driver code  
arr = [ 2, 3, 6, 9, 10, 20 ];  
print(countPairs(arr)); 
  
# This code is contributed by mits 

