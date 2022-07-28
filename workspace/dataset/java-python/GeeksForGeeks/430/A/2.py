

# Python3 implementation of the approach  
  
# Function to find the count of pairs  
# with odd sum and the count  
# of pairs with even sum  
def findPairs(arr, n) :  
  
    # To store the count of even and  
    # odd number from the array  
    cntEven = 0; cntOdd = 0;  
  
    for i in range(n) :  
  
        # If the current element is even  
        if (arr[i] % 2 == 0) : 
            cntEven += 1;  
  
        # If it is odd  
        else : 
            cntOdd += 1;  
  
    # To store the count of  
    # pairs with even sum  
    evenPairs = 0;  
  
    # All the even elements will make  
    # pairs with each other and the  
    # sum of the pair will be even  
    evenPairs += ((cntEven * (cntEven - 1)) // 2);  
  
    # All the odd elements will make  
    # pairs with each other and the  
    # sum of the pair will be even  
    evenPairs += ((cntOdd * (cntOdd - 1)) // 2);  
  
    # To store the count of  
    # pairs with odd sum  
    oddPairs = 0;  
  
    # All the even elements will make pairs  
    # with all the odd element and the  
    # sum of the pair will be odd  
    oddPairs += (cntEven * cntOdd);  
  
    print("Odd pairs = ", oddPairs);  
    print("Even pairs = ", evenPairs);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4, 5 ];  
    n = len(arr);  
  
    findPairs(arr, n);  
  
# This code is contributed by kanugargng 

