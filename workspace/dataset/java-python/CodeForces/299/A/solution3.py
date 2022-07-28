n=int(input())a=list(map(int,input().split()))m=min(a)for i in range(n):    if a[i]%m!=0:        print(-1)        exit()print(m)
