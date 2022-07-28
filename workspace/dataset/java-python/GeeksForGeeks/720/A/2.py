

# Python3 program to find number of pairs 
  
# Function to find the count of required pairs 
def CalculatePairs(a, n): 
  
    # To store the count of elements which 
    # give remainder 0 i.e. even values 
    cnt_zero = 0
  
    # To store the count of elements which 
    # give remainder 1 i.e. odd values 
    cnt_one = 0
  
    for i in range(0, n): 
        if (a[i] % 2 == 0): 
            cnt_zero += 1
        else: 
            cnt_one += 1
      
    total_XOR_pairs = cnt_zero * cnt_one 
    total_AND_pairs = (cnt_one) * (cnt_one - 1) / 2
    total_OR_pairs = cnt_zero * cnt_one + (cnt_one) * (cnt_one - 1) / 2
  
    print("cntXOR = ", int(total_XOR_pairs)) 
    print("cntAND = ", int(total_AND_pairs)) 
    print("cntOR = ", int(total_OR_pairs)) 
      
  
# Driver code 
if __name__ == '__main__': 
      
    a = [1, 3, 4, 2] 
    n = len(a) 
      
    # Print the count 
    CalculatePairs(a, n) 

