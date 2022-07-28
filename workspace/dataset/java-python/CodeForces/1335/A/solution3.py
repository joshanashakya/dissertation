t=int(input())for _ in range(t):    n=int(input())    if n==1:        print("0")    else:        if n%2==0:            c=(n//2)-1        else:            c=(n//2)        print(c)
