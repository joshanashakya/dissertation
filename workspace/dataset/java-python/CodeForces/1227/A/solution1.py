for _ in range(int(input())):    mx=1    mn=10**9    for o in range(int(input())):        l,r=map(int,input().split())        mx=max(mx,l)        mn=min(mn,r)    print(max(0,mx-mn))
