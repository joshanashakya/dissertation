from math import sqrtx=abs(int(input()))a=int((sqrt(1+8*x)-1)/2)print(a+min(2*x-a*(a+1),((a+2)*(a+1)//2-x)%2*2+1,((a+3)*(a+2)//2-x)%2+2))
