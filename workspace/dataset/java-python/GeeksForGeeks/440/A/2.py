

# Python3 implementation of the approach  
  
# Function to return an ArrayList containing  
# all the perfect cubes upto n  
def getPerfectcubes(n):  
  
    perfectcubes = [];  
    current = 1;  
    i = 1;  
  
    # while current perfect cube is  
    # less than or equal to n  
    while (current <= n):  
        perfectcubes.append(current);  
        i += 1;  
        current = int(pow(i, 3));  
  
    return perfectcubes;  
  
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
# when added with n give a perfect cube  
def countPairsWith(n, perfectcubes, nums):  
  
    count = 0;  
    for i in range(len(perfectcubes)):  
        temp = perfectcubes[i] - n;  
  
        # temp > n is checked so that pairs  
        # (x, y) and (y, x) don't get counted twice  
        if (temp > n and (temp in nums)):  
            count += 1;  
  
    return count;  
  
# Function to count the pairs whose  
# sum is a perfect cube  
def countPairs(arr):  
  
    n = len(arr);  
  
    # Sum of the maximum two elements  
    # from the array  
    max = maxPairSum(arr);  
  
    # List of perfect cubes upto max  
    perfectcubes = getPerfectcubes(max);  
  
    # Contains all the array elements  
    nums = [];  
    for i in range(n):  
        nums.append(arr[i]);  
  
    count = 0;  
    for i in range(n):  
  
        # Add count of the elements that when  
        # added with arr[i] give a perfect cube  
        count += countPairsWith(arr[i],  
                perfectcubes, nums);  
    return count;  
  
# Driver code  
arr = [ 2, 6, 18, 9, 999, 1 ];  
print(countPairs(arr));  

