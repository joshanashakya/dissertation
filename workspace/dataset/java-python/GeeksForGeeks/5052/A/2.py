

# Python3 program to prall n-digit numbers  
# whose digits are str1ictly increasing  
# from left to right 
  
# Function to prall n-digit numbers  
# whose digits are str1ictly increasing 
# from left to right. 
# out --> Stores current output  
#         number as str1ing 
# start --> Current starting digit  
#           to be considered 
def findStrictlyIncreasingNum(start, out, n): 
      
    # If number becomes N-digit, prit 
    if (n == 0): 
        print(out, end = " ") 
        return
  
    # start from (prev digit + 1) till 9 
    for i in range(start, 10): 
          
        # append current digit to number 
        str1 = out + str(i) 
  
        # recurse for next digit 
        findStrictlyIncreasingNum(i + 1,  
                            str1, n - 1) 
  
# Driver code 
n = 3
findStrictlyIncreasingNum(0, "", n) 
  
# This code is contributed by Mohit Kumar 

