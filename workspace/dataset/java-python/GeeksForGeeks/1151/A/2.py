

# Python 3 program to find time for a 
# given angle. 
  
# function to find angle between 
# hour hand and minute hand 
def calcAngle(hh, mm): 
  
    # Calculate the angles moved by 
    # hour and minute hands with  
    # reference to 12:00 
    hour_angle = 0.5 * (hh * 60 + mm) 
    minute_angle = 6 * mm 
  
    # Find the difference between 
    # two angles 
    angle = abs(hour_angle - minute_angle) 
  
    # Return the smaller angle of two 
    # possible angles 
    angle = min(360 - angle, angle) 
  
    return angle 
  
# function to print all time when 
# angle between hour hand and minute 
# hand is theta 
def printTime(theta): 
  
    for hh in range(0, 12): 
        for mm in range(0, 60): 
            if (calcAngle(hh, mm)==theta): 
                print(hh, ":", mm, sep = "") 
                return
              
    print("Input angle not valid.") 
    return
  
# driver code to test ablove function 
theta = 90.0
printTime(theta) 
  
# This code is contributed by Smitha 

