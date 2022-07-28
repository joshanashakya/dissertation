for _ in range(int(input())):    l=list(input().split())    a=l[0]    b=l[1]    x=len(b)    if('9'*len(b)!=b):        x=x-1    print(int(a)*x)
