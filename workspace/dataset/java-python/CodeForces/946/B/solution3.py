# RawCoder : https://bit.ly/RCyouTube# Author : MehulYKa, b = map(int, input().split())while(a != 0 and b != 0):    bd = 2 * b; ad = 2 * a    if(a >= bd):        a -= bd * (a // bd)            elif(b >= ad):        b -= ad * (b//ad)            else:        print(a, b)        exit()    print(a, b)   
