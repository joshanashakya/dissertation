

# Python3 code to break the  
# number string into two  
# divisible parts by given 
# numbers 
  
# method prints divisible  
# parts if possible, otherwise  
# prints 'Not possible' 
def printTwoDivisibleParts(num, f, s): 
    N = len(num); 
  
    # creating arrays  
    # to store reminder 
    prefixReminder = [0]*(N + 1); 
    suffixReminder = [0]*(N + 1); 
  
  
    # looping over all  
    # suffix and storing  
    # reminder with f 
    for i in range(1,N):  
  
        # getting suffix  
        # reminder from previous 
        # suffix reminder 
        suffixReminder[i] = (suffixReminder[i - 1] * 10 + 
                            (ord(num[i - 1]) - 
                                        48)) % f;  
  
    base = 1; 
  
    # looping over all  
    # prefix and storing  
    # reminder with s 
    for i in range(N - 1,-1,-1): 
  
        # getting prefix  
        # reminder from next  
        # prefix reminder 
        prefixReminder[i] = (prefixReminder[i + 1] + 
                            (ord(num[i]) - 48) * 
                                        base) % s; 
  
        # updating base value 
        base = (base * 10) % s; 
  
    # now looping over  
    # all reminders to check  
    # partition condition 
    for i in range(N): 
  
        # if both reminders are 
        # 0 and digit itself  
        # is not 0, then print  
        # result and return 
        if (prefixReminder[i] == 0 and suffixReminder[i] == 0 and num[i] != '0'):  
            print(num[0:i],num[i:N]); 
            return 0; 
  
    # if we reach here, then  
    # string can' be partitioned 
    # under constraints 
    print("Not Possible"); 
  
# Driver code  
if __name__=='__main__': 
    num = "246904096"; 
    f = 12345; 
    s = 1024; 
    printTwoDivisibleParts(num,f, s); 
  
# This code is contributed  
# by mits 

