t=int(input())for i in range(t):    n=int(input())    a=list(map(int,input().split(" ")))    c=0    for i in range(n):        if a[i]%2==0:            print(1)            print(i+1)            c+=1            break    if c==0:        for j in range(n):            if  n==1:                print(-1)                c+=1                break            elif a[j]%2!=0 and a[j+1]%2!=0:                print(2)                print(j+1,j+2)                c+=1                break    if c==0:        print(-1)