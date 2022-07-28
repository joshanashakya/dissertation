

# Python3 implementation of  
# the above approach  
  
# function to count swaps 
def minSwaps(str1, str2) : 
  
    # Initialize the count 
    count = 0
  
    # Iterate the loop with  
    # length of str1 
    for i in range(len(str1)) : 
  
        # If any non-equal elements are  
        # found increment the counter  
        if str1[i] != str2[i] : 
            count += 1
  
    # If counter is even print  
    # the swap  
    if count % 2 == 0 : 
        print(count // 2) 
    else : 
        print("Not Possible") 
  
  
# Driver code 
if __name__ == "__main__" : 
  
    # Take two input 
    binaryString1 = "1110000"
    binaryString2 = "0001101"
  
    # Call the function 
    minSwaps( binaryString1, binaryString2) 
  
# This code is contributed by ANKITRAI1 

