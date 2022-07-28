a,m=map(int,input().split()) t=Truefor i in range(m):    if a%m==0:        t=False        print("Yes")        break    else:        x=int(a%m)        a+=xif t==True:    print("No")
