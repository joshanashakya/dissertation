t = int(input())
for a in range(t):    x, y, z = -1, -1, -1
n = int(input())
for i in range(n // 7 + 1):        for
j in range(
    n // 5 + 1):  # print (i,j)            num = n-5*j-7*i            if num>=0 and num%3==0:                x=i                y=j                z=num//3                break        #if x!=-1:break    if x==-1: print (-1)    else:print (z,y,x)
