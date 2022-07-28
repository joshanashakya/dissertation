def hcf(x,y):    while(y):        x,y = y,x%y    return x n = int(input())l = list(map(int,input().split()))h = hcf(l[0],l[1])for i in range(2,n):    h = hcf(h,l[i])print(h*n)
