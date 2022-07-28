n,m,k=map(int,input().split())print((k-1)//(m*2)+1,(k-1)%(2*m)//2+1,'R' if k%2==0 else 'L')
