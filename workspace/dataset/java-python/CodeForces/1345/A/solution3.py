t = int(input())for i in range(t):    x,y=list(map(int,input().split()))    if(x*y<=x+y):        print("YES")    else:        print("NO")
