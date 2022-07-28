n=int(input())x=0y=0for i in range(0,n):    z=list(map(int,input().rstrip().split()))    x=x-z[0]    x=x+z[1]    if y < x:        y=xprint(y)
