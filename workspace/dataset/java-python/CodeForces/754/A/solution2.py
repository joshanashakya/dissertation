import mathn=int(input())p=list(map(int,input().split()))sm=0pos=-1for i in range(n):    sm+=p[i]    p[i]=smif p[n-1]!=0:    print("YES")    print("1")    print("1",n)else:    for i in range(n-1):        if abs(p[i]-p[n-1])!=0:            pos=i            break    if pos==-1:        print("NO")    else:        print("YES")        print("2")        print("1",(pos+1))        print((pos+2),n)         