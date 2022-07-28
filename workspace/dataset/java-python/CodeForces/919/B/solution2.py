def digit(x):    t=0    while x:        t+=x%10        x=x//10    return t k=int(input())x=19while k>1 :    x=x+9    if digit(x)==10 :        k-=1print(x)                
