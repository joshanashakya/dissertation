# Bounds checking much easier in Python than javaa,b=[],[]for _ in range(int(input())):    x,y=map(int,input().split())    if x<0:a+=[(x,y)]    else:b+=[(x,y)]a.sort()b.sort()a=a[::-1]r=0while a and b:    r+=a[0][1]+b[0][1]    a,b=a[1:],b[1:]if a:r+=a[0][1]if b:r+=b[0][1]print(r)
