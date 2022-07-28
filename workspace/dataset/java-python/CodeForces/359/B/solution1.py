n,k = map(int,input().split())r = 2*n-2*kfor i in range(2*n,r,-2):    print(i-1,i,end=' ')for i in range(r,1,-2):    print(i,i-1,end=' ')
