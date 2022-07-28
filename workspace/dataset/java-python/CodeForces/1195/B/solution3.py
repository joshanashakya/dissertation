n,k=map(int,input().split())for r in range(1,10**5):  if (r*(r+1))//2+r==k+n:    print(n-r)    exit()
