for _ in range(int(input())):    n,m=map(int,input().split())    if m%2:        print(m//2*n+n//2+n%2)    else:        print(m//2*n)
