x=int(input())for i in range(x):    n=int(input())    s=0    k=1    for j in range(1,11):        for h in range(1,10):            if(h*k<=n):                s=s+1        k=(k*10)+1    print(s)                