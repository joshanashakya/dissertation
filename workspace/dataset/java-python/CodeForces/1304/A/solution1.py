t=int(input())while t>0:    x=list(map(int,input().split()))    if (x[1]-x[0])%(x[2]+x[3])==0:        print(int((x[1]-x[0])/(x[2]+x[3])))    else:        print(-1)    t-=1
