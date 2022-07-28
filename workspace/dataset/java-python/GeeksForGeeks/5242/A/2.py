

# python3 code to find the largest  
# number with given conditions. 
  
# function to find the largest number 
def largestNum(num): 
  
    # converting the number to the list 
    num_to_str = list(str(num)) 
    temp = num_to_str[:] 
  
    # swaping each digit and check for 
    # the largest number 
    for i in range(len(num_to_str)): 
        for j in range(i + 1, len(num_to_str)): 
  
            // Swapping current pair 
            num_to_str[i], num_to_str[j] = num_to_str[j], num_to_str[i] 
            if num_to_str > temp: 
                temp = num_to_str[:] 
  
            # Reverting above change before next iteration  
            num_to_str[i], num_to_str[j] = num_to_str[j], num_to_str[i] 
  
    # returning the largest number. 
    return int("".join(temp)) 
  
# main function 
def main(): 
    A = int(432) 
    print(largestNum(A)) 
    A = int(2736) 
    print(largestNum(A)) 
    A = int(4596) 
    print(largestNum(A)) 
  
# calling main function 
if __name__=="__main__": 
    main() 

