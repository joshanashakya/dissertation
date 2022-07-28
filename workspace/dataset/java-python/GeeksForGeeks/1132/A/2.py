

# Python program to convert time from 24 hour 
# to 12 hour format 
  
# Convert Function which takes in 
# 24hour time and convert it to 
# 12 hour format 
def convert12(str): 
  
    # Get Hours 
    h1 = ord(str[0]) - ord('0'); 
    h2 = ord(str[1]) - ord('0'); 
  
    hh = h1 * 10 + h2; 
  
    # Finding out the Meridien of time 
    # ie. AM or PM 
    Meridien=""; 
    if (hh < 12): 
        Meridien = "AM"; 
    else: 
        Meridien = "PM"; 
  
    hh %= 12; 
  
    # Handle 00 and 12 case separately 
    if (hh == 0): 
        print("12", end = ""); 
  
        # Printing minutes and seconds 
        for i in range(2, 8): 
            print(str[i], end = ""); 
  
    else: 
        print(hh,end=""); 
          
        # Printing minutes and seconds 
        for i in range(2, 8): 
            print(str[i], end = ""); 
  
    # After time is printed 
    # cout Meridien 
    print(" " + Meridien); 
  
# Driver code 
if __name__ == '__main__': 
  
    # 24 hour format 
    str = "17:35:20"; 
    convert12(str); 
  
# This code is contributed by 29AjayKumar 

