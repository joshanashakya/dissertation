n,m=map(int,input().split())if m==0:    print(n,n)elif n==0:    print('Impossible')else:    print(max(n,m),n+m-1)
