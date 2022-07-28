

# Python3 program to find whether a number  
# is power-isolated or not  
  
def checkIfPowerIsolated(num): 
  
    input1 = num;  
    count = 0;  
    factor = [0] * (num + 1);  
  
    # for 2 as prime factor  
    if(num % 2 == 0): 
        while(num % 2 == 0): 
            count += 1;  
            num //= 2;  
        factor[2] = count;  
  
    # for odd prime factor 
    i = 3; 
    while(i * i <= num):  
        count = 0;  
        while(num % i == 0):  
            count += 1;  
            num //= i;  
        if(count > 0):  
            factor[i] = count; 
        i += 2; 
          
    if(num > 1):  
        factor[num] = 1;  
      
    # calculate product of powers and prime factors  
    product = 1;  
    for i in range(0, len(factor)): 
        if(factor[i] > 0): 
            product = product * factor[i] * i;  
          
    # check result for power-isolation  
    if (product == input1):  
        print("Power-isolated Integer");  
    else: 
        print("Not a Power-isolated Integer"); 
  
# Driver code  
checkIfPowerIsolated(12);  
checkIfPowerIsolated(18);  
checkIfPowerIsolated(35);  
  
# This code is contributed by mits 

