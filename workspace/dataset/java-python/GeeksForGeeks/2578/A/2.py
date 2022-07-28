

# Python3 program to find log(a) on  
# any base b using Recursion  
  
# Recursive function to compute  
# log a to the base b  
def log_a_to_base_b(a, b) :  
  
    rslt = (1 + log_a_to_base_b(a // b, b)) if (a > (b - 1)) else 0;  
              
    return rslt; 
      
# Driver code  
if __name__ == "__main__" :  
  
    a = 3;  
    b = 2;  
    print(log_a_to_base_b(a, b));  
  
    a = 256;  
    b = 4;  
    print(log_a_to_base_b(a, b));  
  
# This code is contributed by AnkitRai01 

